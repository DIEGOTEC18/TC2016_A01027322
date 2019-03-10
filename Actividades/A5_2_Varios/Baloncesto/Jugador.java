public class Jugador {

    private String nombre;
    private String apellido;
    private int numero;
    private int canastas;

    private Jugador(){}

    public Jugador(String nombre, String apellido, int numero, int canastas){

        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.canastas = canastas;

    }

    public void hacerOrden(String orden){

        System.out.println("Soy " + nombre + " y estoy " + orden);

    }

}
