public class Cuadrado implements figuras{

    private double lado;

    public  Cuadrado(){}

    public  Cuadrado(double lado){

        this.lado = lado;

    }

    public double perimetro(){

        return lado * 4;

    }

    public double area(){

        return lado * lado;

    }

    public void setLado(double lado){

        this.lado = lado;

    }

    public double getLado(){

        return lado;

    }

}
