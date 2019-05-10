import javax.swing.*;
import java.awt.*;

public class LogScreen extends JFrame {

    public Commit[] commits = null;

    public JTextArea textArea = new JTextArea(5,10);

    private LogScreen(){}

    public LogScreen(Commit[] commits){

        this.commits = commits;

        initializeLog();

    }

    private void initializeLog(){

        setTitle("Commits Log");
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

        JLabel label = new JLabel("Commits:");

        label.setFont(new Font("Arial", Font.BOLD, 24));

        label.setForeground(Color.WHITE);

        textArea.setEditable(false);

        JScrollPane scroll = new JScrollPane(textArea);

        pane.add(label);
        pane.add(scroll);

        pane.setBackground(new Color(32, 142, 80));

        //Render Commits:

        String displayText = "";

        for(int i = 0; i < commits.length; i++){

            displayText += "----------\nID: " + commits[i].getIDc() + "\nMessage: " + commits[i].getMessage() + "\nDate: " + commits[i].getDate() + "\n";

        }

        textArea.setText(displayText);

    }

}
