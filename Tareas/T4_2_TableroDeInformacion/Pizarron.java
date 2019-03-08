import java.util.Arrays;

public class Pizarron {

    public Mensaje mensajeActual = null;
    public Mensaje[] historial;

    private static Pizarron instance = null;

    private Pizarron(){

        historial = new Mensaje[0];

    }

    public static Pizarron getInstance(){

        if(instance != null){

            return instance;

        }

        instance = new Pizarron();

        return instance;

    }

    public void addMensaje(Mensaje mensaje){

        //System.out.println(Arrays.toString(historial));

        if(mensajeActual != null) {

            Mensaje[] newHistorial = new Mensaje[historial.length + 1];

            for (int i = 0; i < historial.length; i++) {

                if (historial[i] != null) {
                    newHistorial[i] = historial[i];
                }

            }

            newHistorial[newHistorial.length - 1] = mensajeActual;

            historial = newHistorial;

        }

        mensajeActual = mensaje;



        //System.out.println(Arrays.toString(historial));

    }

}
