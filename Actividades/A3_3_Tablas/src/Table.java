import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Table extends JPanel {

    public Table(){

        super(new GridLayout(1,1));

        String line = "";
        List<String> dataLines = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("file.txt"));

            while((line = br.readLine()) != null){

                dataLines.add(line);

            }

            br.close();

            Object[][] datafields = new Object[dataLines.size()][4];

            for(int i = 0; i < dataLines.size(); i++){

                datafields[i] = dataLines.get(i).split(",");

            }

            String[] titles = new String[]{"Name", "L Name", "Phone Number", "Genre"};

            JTable data = new JTable(datafields, titles);

            JScrollPane scroll = new JScrollPane(data);

            add(scroll);

            repaint();

        }catch (IOException e){

            System.out.println("Not such file\n" + e.toString());

        }

        /*Object[][] datafields = new Object[][]{

                  {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}
                , {"Joahn", "Stevens", 55112244, 'M'}

        };*/

    }

}
