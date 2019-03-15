public class GerenteSantaFe extends Persona{

    private double ganancias;

    private static GerenteSantaFe instance = new GerenteSantaFe();

    public static GerenteSantaFe getInstance() {
        return instance;
    }

    private GerenteSantaFe() {

        super("Gerente de Santa Fe");

        ganancias = 0;

    }

    public void contarGanancias(){

        System.out.println("Soy el " + getName() + " y las ganancias de la sucursal son: " +  ganancias);

    }

    public void reportarIngreso(Double ingreso){

        ganancias += ingreso;

    }

    public void coordinar(){

        System.out.println("Soy el " + getName() + " y estoy coordinando que todo esté bien.");

    }

}
