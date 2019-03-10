public class VelasAromaticas extends Vela {

    private double precio;

    public VelasAromaticas(String color, double altura){

        super(color, altura);

    }

    public void setAltura(double altura){

        precio = altura * 8;

    }

    public void printPrecio(){

        System.out.println(precio);

    }

}
