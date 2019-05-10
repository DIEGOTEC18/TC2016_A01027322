import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class Landing extends JFrame implements Repository {

    //Repository stuff:

    public Note[] currentNotes = null;

    public Note[] oldNotes = null;

    public Commit[] commits = null;

    public Note currentNote;

    public String currentFile = "src\\defaultRepository.txt";

    //UI access stuff:

    public GroupLayout layoutList = new GroupLayout(getContentPane());

    public JLabel noteLabel = new JLabel("Notes:");

    public JLabel noteIDLabel = new JLabel("Note ID:");

    public JTable listOfNotes;

    public DefaultTableModel tableModel = new DefaultTableModel(){
        public boolean isCellEditable(int row, int column)
        {
            return false;//This causes all cells to be not editable
        }
    };

    public JTextArea textArea = new JTextArea(5,10);

    public JPanel leftPanel = new JPanel();

    public JPanel rightPanel = new JPanel();

    private static Landing ourInstance = new Landing();

    public static Landing getInstance() {

        return ourInstance;

    }

    private Landing() {

        try {

            cloneRepository(currentFile, "src\\commitsRegister.txt", this);

            System.out.println(commits.length);

        }catch (IOException e){

            new NotSuchFileException("Default Repositories").displayError();

        }

        initializeUI();

    }

    private void initializeUI() {


        //Main Frame Setup:

        setTitle("Textin the City");
        setSize(631, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("src\\icon.png");

        setIconImage(icon.getImage());

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        createLayout();



    }

    private void createLayout() {

        FlowLayout notesLayout = new FlowLayout(FlowLayout.LEFT);

        JPanel upPanel = new JPanel();

        JPanel downPanel = new JPanel();

        upPanel.setLayout(notesLayout);

        downPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        //Notes Section:

        Container pane = getContentPane();

        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        //Note List Column:

        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        //Write notes:

        Object[] columns = new Object[]{"column1"};

        tableModel.addColumn("Column1");

        listOfNotes = new JTable(tableModel);

        for(int i = 0; i < currentNotes.length; i++){

            tableModel.addRow(new Object[]{currentNotes[i].getID()});

        }

        listOfNotes.addMouseListener(new java.awt.event.MouseAdapter(){

            public void mouseClicked(java.awt.event.MouseEvent event) {
                int row = listOfNotes.rowAtPoint(event.getPoint());
                int col = listOfNotes.columnAtPoint(event.getPoint());

                //System.out.println("Clicked at: " + listOfNotes.getModel().getValueAt(row, col));

                displayNote(listOfNotes.getModel().getValueAt(row, col).toString());

            }});

        leftPanel.add(noteLabel);
        leftPanel.add(listOfNotes);

        JButton addNoteButton = new JButton("Add Note");

        addNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addNote();

            }
        });

        JButton deleteNotesButton = new JButton("Delete Notes");

        deleteNotesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                currentNotes = new Note[]{};

                for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {

                    tableModel.removeRow(i);

                }

            }
        });

        JButton findNoteButton = new JButton("Find Note");

        findNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                findNote();

            }
        });


        JPanel leftButtonPanel = new JPanel();

        leftButtonPanel.setLayout(new BoxLayout(leftButtonPanel, BoxLayout.Y_AXIS));

        leftButtonPanel.add(addNoteButton);
        leftButtonPanel.add(Box.createRigidArea(new Dimension(1, 5)));
        leftButtonPanel.add(deleteNotesButton);
        leftButtonPanel.add(Box.createRigidArea(new Dimension(1, 5)));
        leftButtonPanel.add(findNoteButton);

        leftButtonPanel.setBackground(new Color(70, 74, 91));

        leftPanel.add(Box.createRigidArea(new Dimension(1, 20)));

        leftPanel.add(leftButtonPanel);

        leftPanel.setBackground(new Color(70, 74, 91));

        leftPanel.setPreferredSize(new Dimension(200, 400));

        noteLabel.setFont(new Font("Arial", Font.ITALIC, 24));

        noteLabel.setForeground(Color.WHITE);

        upPanel.add(leftPanel);




        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        rightPanel.add(noteIDLabel);
        rightPanel.add(textArea);

        rightPanel.setBackground(new Color(244, 66, 66));

        rightPanel.setPreferredSize(new Dimension(400, 400));

        upPanel.add(rightPanel);

        pane.add(upPanel);

        //Down Panel:

        JButton cloneButton = new JButton("Clone");

        cloneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cloneRepo();

            }
        });

        JButton addButton = new JButton("Add");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addChanges(currentNote, textArea.getText());

            }
        });

        JButton commitButton = new JButton("Commit");

        commitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String message = JOptionPane.showInputDialog(null,"Please enter a message for your commit:", "");

                if(message != null){

                    commit(Landing.getInstance(), message, "src\\commitsRegister.txt");

                }

            }
        });

        JButton logButton = new JButton("Log");

        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                logCommits(Landing.getInstance());

            }
        });

        JButton checkButton = new JButton("Check");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                checkOldVersion(currentNote);

            }
        });

        JButton pushButton = new JButton("Push");

        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                push(Landing.getInstance());

            }
        });

        JButton remoteButton = new JButton("Remote");

        remoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remote();

            }
        });

        downPanel.add(cloneButton);
        downPanel.add(addButton);
        downPanel.add(commitButton);
        downPanel.add(logButton);
        downPanel.add(checkButton);
        downPanel.add(pushButton);
        downPanel.add(remoteButton);

        downPanel.setBackground(new Color(152, 172, 188));

        pane.add(downPanel);

    }

    public void displayNote(String noteID){

        String noteText = "Empty Note";
        String noteIdtext = noteID;

        for(int i = 0; i < currentNotes.length; i++){

            if(noteID.equals(currentNotes[i].getID())){

                noteText = currentNotes[i].getText();
                noteIdtext = currentNotes[i].getID();
                currentNote = currentNotes[i];
                break;

            }

        }

        textArea.setText(noteText);
        noteIDLabel.setText("Note ID: " + noteIdtext);

        //System.out.println(noteText);

    }

    public void addNote(){

        String noteID = "N" + (new Random().nextInt(999-100) + 100);

        textArea.setText("");
        noteIDLabel.setText("Note ID: " + noteID);

        tableModel.addRow(new Object[]{noteID});

        Note[] newArray = new Note[]{};

        if(currentNotes.length != 0){

            newArray = new Note[currentNotes.length + 1];

        }else{

            newArray = new Note[1];

        }

        for(int i = 0; i < currentNotes.length; i++){

            newArray[i] = currentNotes[i];

        }

        Note newNote = new Note(noteID, "");

        currentNote = newNote;

        newArray[newArray.length - 1] = newNote;

        currentNotes = newArray;

        //System.out.println(currentNotes.length);

    }

    public void findNote(){

        String search = JOptionPane.showInputDialog(this,"Please enter the note ID you are looking for:", "");

        if(search != null) {

            boolean found = false;

            for (int i = 0; i < currentNotes.length; i++) {

                if (search.equalsIgnoreCase(currentNotes[i].getID())) {

                    displayNote(currentNotes[i].getID());
                    found = true;
                    break;

                }

            }

            if (!found) {

                JOptionPane.showMessageDialog(this, "The Note " + search + " was not found in the local repository.\nPlease enter a valid note ID.", "Note not found", JOptionPane.ERROR_MESSAGE);

                findNote();

            }

        }

    }

    public void cloneRepo(){

        String userFile = "src\\" + JOptionPane.showInputDialog(this,"Please enter the name of the file you want to clone:", "");

        try {

            cloneRepository(userFile, "src\\commitsRegister.txt", this);

            for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {

                tableModel.removeRow(i);

            }

            for(int i = 0; i < currentNotes.length; i++){

                tableModel.addRow(new Object[]{currentNotes[i].getID()});

            }

            currentFile = userFile;

        }catch (IOException e){

            new NotSuchFileException("Default Repositories").displayError();

        }

    }

}
