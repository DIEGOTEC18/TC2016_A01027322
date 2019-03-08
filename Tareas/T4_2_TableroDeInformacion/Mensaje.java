import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensaje {

    private String mensaje;
    private Date fecha;

    private Mensaje(){}

    public Mensaje(String mensaje, String fecha){

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{

            date = sdf.parse(fecha);
            //System.out.println(date.getTime());

        } catch (Exception e){

            System.out.println("Fecha ingresada en el formato incorrecto [dd/MM/yyyy]");

        }

        this.mensaje = mensaje;
        this.fecha = date;

    }

    public String getMensaje(){

        return mensaje;

    }

    public Date getFecha(){

        return fecha;

    }

    public String getStringFecha(){

        String[] parts = fecha.toString().split(" ");

        return parts[0] + " " + parts[2] + "/" + parts[1] + "/" + parts[5];

    }

}
