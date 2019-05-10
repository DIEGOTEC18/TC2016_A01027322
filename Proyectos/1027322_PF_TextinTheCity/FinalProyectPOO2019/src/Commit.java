import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Commit {

    private String IDc = null;
    private String date = null;
    private String message = null;
    private Note[] commitedNotes = null;
    private Note[] oldCommitedNotes = null;

    private Commit(){}

    public Commit(String IDc, String date, String message){

        //IDc = "C" + (new Random().nextInt(999-100) + 100);
        //date = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm z").format(new Date(System.currentTimeMillis()));
        this.IDc = IDc;
        this.date = date;
        this.message = message;
        //this.commitedNotes = commitedNotes;
        //this.oldCommitedNotes = oldCommitedNotes;

    }

    public String getIDc(){

        return IDc;

    }

    public String getDate(){

        return date;

    }

    public String getMessage(){

        return message;

    }

}
