import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Tablita");
        Table dataTable = new Table();

        window.setContentPane(dataTable);
        window.pack();

        window.setVisible(true);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
