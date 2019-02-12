public class Ventanas {

    private boolean electricas;
    private double alto, ancho;

    public Ventanas(){

        this.electricas = false;
        this.alto = -1;
        this.ancho = -1;

    }

    public Ventanas(boolean electricas, double alto, double ancho){

        this.electricas = electricas;
        this.alto = alto;
        this.ancho = ancho;

    }

    public void setElectricas(boolean electricas){

        this.electricas = electricas;

    }

    public void setAlto(double alto){

        this.alto = alto;

    }

    public void setAncho(double ancho){

        this.ancho = ancho;

    }

    public boolean getElectricas(){

        return electricas;

    }

    public double getAlto(){

        return alto;

    }

    public double getAncho(){

        return ancho;

    }

}
