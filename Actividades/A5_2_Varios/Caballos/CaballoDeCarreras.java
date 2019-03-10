import java.util.Date;

public class CaballoDeCarreras extends Caballo{

    private int carrerasParticipadas;
    private int carrerasGanadas;

    public CaballoDeCarreras(String nombre, String color, Date fechaDeNacimiento, int carrerasGanadas, int carrerasParticipadas){

        super(nombre, color, fechaDeNacimiento);

        this.carrerasGanadas = carrerasGanadas;
        this.carrerasParticipadas = carrerasParticipadas;


    }

}
