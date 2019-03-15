public class Pizza {

    private String tipo;
    private String[] ingredientes;

    private double precio;

    private Pizza(){}

    public Pizza(String tipo, double precio){

        this.tipo = tipo;
        this.precio = precio;

    }

    public String getTipo(){

        return tipo;

    }

    public void agregarIngredientes(String[] ingredientes){

        this.ingredientes = ingredientes;

    }

    public void hornear(){

        System.out.println("La pizza " + tipo + " se está horneando");

    }

    public double getPrecio(){

        return precio;

    }

}
