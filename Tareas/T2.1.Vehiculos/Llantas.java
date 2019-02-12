public class Llantas {

    private double ancho, altura;

    public Llantas(double ancho, double altura){

        this.ancho = ancho;
        this.altura = altura;

    }

    public Llantas(){

        this.ancho = -1;
        this.altura = -1;

    }

    public void setAncho(double ancho){

        this.ancho = ancho;

    }

    public void setAltura(double altura){

        this.altura = altura;

    }

    public double getAncho(){

        return ancho;

    }

    public double getAltura(){

        return altura;

    }

}
