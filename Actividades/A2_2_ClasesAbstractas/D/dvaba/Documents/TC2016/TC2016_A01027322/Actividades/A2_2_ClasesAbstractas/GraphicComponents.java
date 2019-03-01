package D.dvaba.Documents.TC2016.TC2016_A01027322.Actividades.A2_2_ClasesAbstractas;

public abstract class GraphicComponents {

    protected Color background;
    protected Point position;

    public abstract void drawComponent();
    public abstract void setLocation(Point p);
    public abstract void setBackgroundColor(Color c);

}
