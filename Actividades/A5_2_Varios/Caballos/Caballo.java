import java.util.Date;

public class Caballo {

    private String nombre;
    private String color;
    private Date fechaDeNacimiento;

    private Caballo(){}

    public Caballo(String nombre, String color, Date fechaDeNacimiento){

        this.color = color;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;

    }

}
