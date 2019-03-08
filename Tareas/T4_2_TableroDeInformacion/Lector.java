import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public interface Lector {

    default void getMessage(Pizarron pizarron){

        System.out.println("\n----------\nMensaje Actual: " + pizarron.mensajeActual.getMensaje() + "\nFecha: [" + pizarron.mensajeActual.getStringFecha() + "]");

    }

    default void printHistory(Pizarron pizarron){

        System.out.println("\nHISTORIAL:");

        //System.out.println(Arrays.toString(pizarron.historial));

        for(int i = 0; i < pizarron.historial.length; i++){
            if(pizarron.historial[i] != null) {
                System.out.println("\n----------\nMensaje: " + pizarron.historial[i].getMensaje() + "\nFecha: [" + pizarron.historial[i].getStringFecha() + "]");
            }
        }

        System.out.println("\n----------\nMensaje: " + pizarron.mensajeActual.getMensaje() + "\nFecha: [" + pizarron.mensajeActual.getStringFecha() + "]");

    }

    default void printMessageByDate(Pizarron pizarron, String userDate){

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{

            date = sdf.parse(userDate);
            //System.out.println(date.getTime());

        } catch (Exception e){

            System.out.println("Fecha ingresada en el formato incorrecto [dd/MM/yyyy]");

        }

        //System.out.println(date);

        boolean found = false;

        for(int i = 0; i < pizarron.historial.length; i++){

            if(pizarron.historial[i] != null) {

                if (pizarron.historial[i].getFecha().getTime() == date.getTime()) {

                    System.out.println("\nRESULTADO DE BÚSQUEDA:\n----------\nMensaje: " + pizarron.historial[i].getMensaje() + "\nFecha: [" + pizarron.historial[i].getStringFecha() + "]");

                    found = true;

                    break;
                }
            }

        }

        if(!found) {
            System.out.println("No se encontraron mensajes para la fecha " + userDate);
        }

    }

}
