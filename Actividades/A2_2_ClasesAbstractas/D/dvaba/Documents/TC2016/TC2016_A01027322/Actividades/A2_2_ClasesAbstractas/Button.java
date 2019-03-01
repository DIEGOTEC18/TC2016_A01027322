package D.dvaba.Documents.TC2016.TC2016_A01027322.Actividades.A2_2_ClasesAbstractas;

import sun.font.GraphicComponent;

public class Button extends GraphicComponents implements Clickable {

    public void click(int x, int y){

        System.out.println("dando click en " + x + " " + y);

    }

    public void setLocation(Point p){

        position = p;

    }

    public void setBackgroundColor(Color c){

        background = c;

    }

    public void drawComponent() {

        System.out.println("Estoy dibujadno un boton en la posicion " + position.x + " " + position.y);

    }
}
