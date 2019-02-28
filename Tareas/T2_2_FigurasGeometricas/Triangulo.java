import java.util.Scanner;

public class Triangulo implements figuras{

    private double base;
    private double altura;
    private String tipo;

    public Triangulo(double base, double altura, String tipo){

        this.base = base;
        this.altura = altura;
        this.tipo = tipo;

    }

    public Triangulo(){

    }

    public double area(){

        return (base * altura) / 2;

    }

    public double perimetro(){

        if(tipo.equalsIgnoreCase("equilatero")){

            return base * 3;

        }else if(tipo.equalsIgnoreCase("isosceles")){

            return (2 * altura) + base;

        } else{
            //escaleno

            System.out.println("Porfavor ingrese el valor del tercer lado para un tríangulo escaleno / rectángulo:");
            double c = new Scanner(System.in).nextDouble();

            return base + altura + c;

        }

    }

    public void setBase(double base){

        this.base = base;

    }

    public void setAltura(double altura){

        this.altura = altura;

    }

    public void setTipo(String tipo){

        this.tipo = tipo;

    }

    public double getBase(){

        return base;

    }

    public double getAltura(){

        return altura;

    }

    public String getTipo(){

        return tipo;

    }

}
