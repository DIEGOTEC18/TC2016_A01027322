public class Rectangulo implements figuras {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura){

        this.base = base;
        this.altura = altura;

    }

    public Rectangulo(){

    }

    public double area(){

        return (base * altura);

    }

    public double perimetro(){

        return (base * 2) + (altura * 2);

    }

    public void setBase(double base){

        this.base = base;

    }

    public void setAltura(double altura){

        this.altura = altura;

    }

    public double getBase(){

        return base;

    }

    public double getAltura(){

        return altura;

    }

}
