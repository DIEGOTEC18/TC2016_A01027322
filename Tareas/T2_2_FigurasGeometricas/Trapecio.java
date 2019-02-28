public class Trapecio implements figuras{

    private double ladoA, ladoB, ladoC, ladoD, altura;

    public Trapecio(){}

    public Trapecio(double ladoA, double ladoB, double ladoC, double ladoD, double altura){

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
        this.altura = altura;

    }

    public double perimetro(){

        return  ladoD + ladoB + ladoA + ladoC;

    }

    public double area(){

        return altura * ((ladoA + ladoB) / 2);

    }

    public void setLadoA(double ladoA){

        this.ladoA = ladoA;

    }

    public void setLadoB(double ladoB){

        this.ladoB = ladoB;

    }

    public void setLadoC(double ladoC){

        this.ladoC = ladoC;

    }

    public void setLadoD(double ladoD){

        this.ladoD = ladoD;

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

    public double getLadoC(){

        return ladoC;

    }

    public double getLadoD(){

        return ladoD;

    }

    public double getAltura(){

        return altura;

    }

}
