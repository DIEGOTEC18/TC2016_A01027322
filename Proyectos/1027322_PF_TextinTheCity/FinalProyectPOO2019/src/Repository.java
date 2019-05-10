import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public interface Repository {

    default void cloneRepository(String repoFilename, String commitRepoFilename, Landing local) throws IOException {

        File repository = new File(repoFilename);
        File register = new File(commitRepoFilename);

        Scanner reader = null;

        int counter = 0;
        int counterUser = 0;

        String[] rawRepositoryCurrentID = null;
        String[] rawRepositoryCurrentText = null;
        String[] rawRepositoryOldID = null;
        String[] rawRepositoryOldText = null;

        String[] rawRegisterIDc = null;
        String[] rawRegisterDates = null;
        String[] rawRegisterMessage = null;

        //Catch the File Not Found Exception and prevents a crash:

        try (BufferedReader br = new BufferedReader(new FileReader(repository))) {
            String line;
            while ((line = br.readLine()) != null) {

                switch (counter) {

                    case 0:

                        rawRepositoryCurrentID = line.split("¬");
                        break;

                    case 1:

                        rawRepositoryCurrentText = line.split("¬");
                        break;

                    case 2:

                        rawRepositoryOldID = line.split("¬");
                        break;

                    case 3:

                        rawRepositoryOldText = line.split("¬");

                }
                //System.out.println(line);
                counter++;
            }
        }

        try (BufferedReader br1 = new BufferedReader(new FileReader(register))) {
            String line1;
            while ((line1 = br1.readLine()) != null) {

                switch (counterUser) {

                    case 0:

                        rawRegisterIDc = line1.split("¬");
                        break;

                    case 1:

                        rawRegisterDates = line1.split("¬");
                        break;

                    case 2:

                        rawRegisterMessage = line1.split("¬");
                        break;

                }

                counterUser++;

            }



        }

        /*
        System.out.println(Arrays.toString(rawRepositoryCurrentID));
        System.out.println(Arrays.toString(rawRepositoryCurrentText));
        System.out.println(Arrays.toString(rawRepositoryOldID));
        System.out.println(Arrays.toString(rawRepositoryOldText));

        System.out.println("\n---\n");

        System.out.println(Arrays.toString(rawRegisterIDc));
        System.out.println(Arrays.toString(rawRegisterDates));
        System.out.println(Arrays.toString(rawRegisterMessage));
        */

        Note[] currentNotesR = new Note[rawRepositoryCurrentID.length];
        Note[] oldNotesR = new Note[rawRepositoryOldID.length];
        Commit[] commitsR = new Commit[rawRegisterIDc.length];

        for(int i = 0; i < rawRepositoryCurrentID.length; i++){

            currentNotesR[i] = new Note(rawRepositoryCurrentID[i], rawRepositoryCurrentText[i]);

        }

        for(int i = 0; i < rawRepositoryOldID.length; i++){

            oldNotesR[i] = new Note(rawRepositoryOldID[i], rawRepositoryOldText[i]);

        }

        for(int i = 0; i < rawRegisterIDc.length; i++){

            commitsR[i] = new Commit(rawRegisterIDc[i], rawRegisterDates[i], rawRegisterMessage[i]);

        }

        local.currentNotes = currentNotesR;
        local.oldNotes = oldNotesR;
        local.commits = commitsR;


        System.out.println(local.currentNotes.length);
        System.out.println(local.oldNotes.length);
        System.out.println(local.commits.length);

    }

    default void addChanges(Note note, String changedText){

        //Saves an old version:

        if(!note.getText().equals("")) {

            Note[] newOldNotes = new Note[Landing.getInstance().oldNotes.length + 1];

            for (int i = 0; i < Landing.getInstance().oldNotes.length; i++) {

                newOldNotes[i] = Landing.getInstance().oldNotes[i];

            }

            newOldNotes[newOldNotes.length - 1] = new Note(note.getID(), note.getText());

            Landing.getInstance().oldNotes = newOldNotes;

        }

        note.setText(changedText);

        JOptionPane.showMessageDialog(null, "Changes added successfully.", "Add successfull", JOptionPane.INFORMATION_MESSAGE);

    }

    default void commit(Landing repo, String message, String commitRegister){

        String IDc = "C" + (new Random().nextInt(999-100) + 100);
        String date = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm z").format(new Date(System.currentTimeMillis()));

        Commit[] newCommitList = new Commit[repo.commits.length + 1];

        for(int i = 0; i < repo.commits.length; i++){

            newCommitList[i] = repo.commits[i];

        }

        newCommitList[newCommitList.length - 1] = new Commit(IDc, date, message);

        repo.commits = newCommitList;

        try {

            PrintWriter writer = new PrintWriter(commitRegister);

            String CIDs = "";
            String Dates = "";
            String Messages = "";

            for(int i = 0; i < repo.commits.length; i++){

                CIDs += repo.commits[i].getIDc() + "¬";
                Dates += repo.commits[i].getDate() + "¬";
                Messages += repo.commits[i].getMessage() + "¬";

            }

            writer.println(CIDs);
            writer.println(Dates);
            writer.println(Messages);

            writer.close();

            JOptionPane.showMessageDialog(repo, "Changes commited succesfully!", "Commit Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e){

            new NotSuchFileException(commitRegister).displayError();

        }

    }

    default void logCommits(Landing repo){

        LogScreen logScreen = new LogScreen(repo.commits);

        logScreen.setVisible(true);

    }

    default void checkOldVersion(Note note){

        boolean found = false;
        Note foundOldNote = null;

        //System.out.println(Landing.getInstance().oldNotes[0].getText());

        System.out.println(Landing.getInstance().oldNotes.length);

        for(int i = 0; i < Landing.getInstance().oldNotes.length; i++){

            if(Landing.getInstance().oldNotes[i].getID().equals(note.getID())){

                found = true;
                foundOldNote = Landing.getInstance().oldNotes[i];
                break;

            }

        }

        if(found){

            oldVersionDisplay checkDisplay = new oldVersionDisplay(foundOldNote);
            checkDisplay.setVisible(true);

        }else{

            JOptionPane.showMessageDialog(Landing.getInstance(), "No old versions found for " + note.getID() + ".", "No old version found", JOptionPane.WARNING_MESSAGE);

        }

    }

    default void push(Landing local){

        try {

            PrintWriter writer = new PrintWriter(local.currentFile);

            String NIDs = "";
            String Ntexts = "";
            String ONIDs = "";
            String ONtexts = "";

            for(int i = 0; i < local.currentNotes.length; i++){

                NIDs += local.currentNotes[i].getID() + "¬";
                Ntexts += local.currentNotes[i].getText() + "¬";

            }

            for(int i = 0; i < local.oldNotes.length; i++){

                ONIDs += local.oldNotes[i].getID() + "¬";
                ONtexts += local.oldNotes[i].getText() + "¬";

            }

            writer.println(NIDs);
            writer.println(Ntexts);
            writer.println(ONIDs);
            writer.println(ONtexts);

            writer.close();

            JOptionPane.showMessageDialog(local, "Push succesfull!", "Push Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e){

            JOptionPane.showMessageDialog(local, "The file " + local.currentFile + " was not found.\nPlease specify a file using Remote before attempting to push.", "Push Error", JOptionPane.ERROR_MESSAGE);

            remote();

        }

    }

    default void remote() {


        String userResponse = JOptionPane.showInputDialog(Landing.getInstance(), "Please enter a filename to use as a repository:", "");

        if (userResponse != null) {

            String userFile = "src\\" + userResponse;

            File repository = new File(userFile);

            int counter = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(repository))) {
                String line;

                Landing.getInstance().currentFile = userFile;

                JOptionPane.showMessageDialog(Landing.getInstance(), userResponse + " successfully added as a repository.", "Remote Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {

                new NotSuchFileException(userFile).displayError();

            }

        }
    }

}

