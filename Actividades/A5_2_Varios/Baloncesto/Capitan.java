import java.util.Scanner;

public class Capitan extends Jugador {

    //private Capitan(){}

    private Capitan(String nombre, String apellido, int numero, int canastas){

        super(nombre, apellido, numero, canastas);

    }

    private static Capitan instance = null;

    public static Capitan getInstance(){

        if(instance != null){

            return instance;

        }

        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese el nombre del nuevo capitán:");
        String nombre = kb.next();
        System.out.println("Ingrese el apellido del nuevo capitán:");
        String apellido = kb.next();
        int numero;

        do {
            System.out.println("Ingrese el número del nuevo capitán (0 a 100):");
            numero = kb.nextInt();

        } while(!(numero >= 0 && numero <= 100 ));

        System.out.println("Ingrese el número de canastas que ha encestado el nuevo capitán:");
        int canastas = kb.nextInt();

        instance = new Capitan(nombre, apellido, numero, canastas);

        return instance;

    }

    public void darOrden(String oreden, Jugador jugador){

        jugador.hacerOrden(oreden);

    }

}
