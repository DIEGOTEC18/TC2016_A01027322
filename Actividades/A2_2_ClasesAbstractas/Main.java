import D.dvaba.Documents.TC2016.TC2016_A01027322.Actividades.A2_2_ClasesAbstractas.Button;
import D.dvaba.Documents.TC2016.TC2016_A01027322.Actividades.A2_2_ClasesAbstractas.Color;
import D.dvaba.Documents.TC2016.TC2016_A01027322.Actividades.A2_2_ClasesAbstractas.Point;

public class Main {

    public static void main(String[] args) {

        Button B = new Button();

        B.click(100, 100);

        B.setLocation(new Point(200, 200));

        B.setBackgroundColor(new Color(30, 30, 30));

        B.drawComponent();

    }

}
