import javax.swing.*;
import java.io.IOException;

public class NotSuchFileException extends IOException {

    protected String filename;

    public NotSuchFileException(String filename){

        this.filename = filename;

    }

    public void displayError(){

        JOptionPane.showMessageDialog(null, "The file " + filename + " was not found.\nPlease enter a valid filename.", "Not Such File", JOptionPane.ERROR_MESSAGE);

    }

}
