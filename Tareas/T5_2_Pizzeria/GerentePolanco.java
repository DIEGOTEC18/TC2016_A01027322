public class GerentePolanco extends Persona{

    private double ganancias;

    private static GerentePolanco instance = new GerentePolanco();

    public static GerentePolanco getInstance() {
        return instance;
    }

    private GerentePolanco() {

        super("Gerente de Polanco");
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
