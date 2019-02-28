public class Rombo implements figuras {

    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(){}

    public Rombo(double diagonalMayor, double diagonalMenor){

        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;

    }

    public double perimetro(){

        double lado = Math.sqrt(((Math.pow((diagonalMayor / 2), 2)) + (Math.pow((diagonalMenor / 2), 2))));

        return lado * 4;

    }

    public double area(){

        return (diagonalMenor * diagonalMayor) / 2;

    }

    public void setDiagonalMayor(double D){

        diagonalMayor = D;

    }

    public void setDiagonalMenor(double d){

        diagonalMenor = d;

    }

    public double getDiagonalMayor(){

        return diagonalMayor;

    }

    public double getDiagonalMenor(){

        return diagonalMenor;

    }

}
