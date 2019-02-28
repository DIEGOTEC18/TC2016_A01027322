public class Romboide implements figuras {

    private double ladoA;
    private double ladoB;
    private double altura;

    public Romboide(){}

    public Romboide(double ladoA, double ladoB, double altura){

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;

    }

    public double perimetro(){

        return (ladoB + ladoA) * 2;

    }

    public double area(){

        return ladoA * altura;

    }

    public void setLadoA(double ladoA){

        this.ladoA = ladoA;

    }

    public void setLadoB(double ladoB){

        this.ladoB = ladoB;

    }

    public void setAltura(double altura){

        this.altura = altura;

    }

    public double getLadoA(){

        return ladoA;

    }

    public double getLadoB(){

        return ladoB;

    }

    public double getAltura(){

        return altura;

    }

}
