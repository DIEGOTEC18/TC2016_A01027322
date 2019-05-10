import javax.swing.*;
import java.awt.*;

public class oldVersionDisplay extends JFrame {

    public Note oldVersionNote = null;

    public JTextArea textArea = new JTextArea(5,10);

    public JLabel label = null;

    private oldVersionDisplay(){}

    public oldVersionDisplay(Note oldNote){

        this.oldVersionNote = oldNote;

        label = new JLabel("Old version of " + oldNote.getID());

        initializeDisplay();

    }

    private void initializeDisplay(){

        setTitle("Check old version");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        ImageIcon icon = new ImageIcon("src\\icon.png");
        setIconImage(icon.getImage());

        renderWindow();

    }

    private void renderWindow(){

        Container pane = getContentPane();

        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        label.setFont(new Font("Arial", Font.BOLD, 24));

        label.setForeground(Color.WHITE);

        textArea.setEditable(false);

        JScrollPane scroll = new JScrollPane(textArea);

        pane.add(label);
        pane.add(scroll);

        pane.setBackground(new Color(61, 99, 99));

        textArea.setText(oldVersionNote.getText());

    }

}
