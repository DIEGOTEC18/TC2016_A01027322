public class Sucursal {

    private String name;

    public Sucursal(){

    }

    public Sucursal(String name){

        this.name = name;

    }

    public void retiro(double cantidad, Cliente cliente){

        System.out.println("Sucursal: " + name + " dando la cantidad de " + cantidad + " al cliente " + cliente.getName());

    }

}
