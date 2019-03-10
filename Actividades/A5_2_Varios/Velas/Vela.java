public class Vela {

    private String color;
    private double altura;
    private double precio;

    public Vela(){}

    public Vela(String color, double altura){

        this.color = color;

        setAltura(altura);

    }

    public void setAltura(double altura){

        this.altura = altura;

        precio = altura * 6.25;

    }

    public void printPrecio(){

        System.out.println(precio);

    }

}
