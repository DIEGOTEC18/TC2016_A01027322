import java.util.Scanner;

public class Persona {

    private Cabeza cabeza;
    private String nombre;
    private String orientacionSexual;
    private Persona[] personasBesadas;

    private int countBesos = 0;

    public Persona(){}

    public Persona(String nombre, String orientacionSexual, Cabeza cabeza){

        this.nombre = nombre;
        this.orientacionSexual = orientacionSexual;
        this.cabeza = cabeza;
        personasBesadas = new Persona[20];

    }

    public String getNombre(){

        return nombre;

    }

    public void mirar(Persona persona){

        cabeza.getOjo(1).mirar(this, persona);

    }

    public void pedirBeso(Persona persona){

        boolean respuesta = false;

        System.out.println(this.getNombre() + " dice: " + persona.getNombre() + " me das un beso?");

        respuesta = persona.aceptarBeso(this);

        if(respuesta = false){

            System.out.println("Soy " + nombre + " y " + persona.getNombre() + "no se deja besuquear.");

        } else{

            besar(persona);

        }


    }

    public boolean aceptarBeso(Persona persona){

        Scanner kb = new Scanner(System.in);
        boolean aceptar = false;

        System.out.println(nombre + "¿Quieres besar a " + persona.getNombre() + "? (Ingrese true/false)");
        aceptar = kb.nextBoolean();
        if(aceptar = true){

            personasBesadas[countBesos] = persona;

        }

        return aceptar;

    }

    public void besar(Persona persona){

        cabeza.getBoca().besar(this, persona);

    }

}
