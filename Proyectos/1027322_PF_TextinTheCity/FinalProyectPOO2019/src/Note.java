public class Note {

    private String ID;
    private String text;

    private Note(){}

    public Note(String ID, String text){

        this.ID = ID;
        this.text = text;

    }

    public String getID(){

        return ID;

    }

    public String getText(){

        return text;

    }

    public void setText(String text){

        this.text = text;

    }

}
