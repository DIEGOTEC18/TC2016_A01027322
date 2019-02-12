public class Persona {

    private String nombre;
    private int edad;

    public Persona(){

        this.nombre = "Sin nombre";
        this.edad = -1;

    }

    public Persona(String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre(){

        return nombre;

    }

}
