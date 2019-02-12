public class Consecionaria {

    private String nombre;
    private Mecanico[] listaDeMecanicos;
    private Vendedor[] listaDeVendedores;
    private int numMecanicos;
    private int numVendedores;

    private int contMecanicos = 0;
    private int contVendedores = 0;

    public Consecionaria(){

        this.nombre = "Consecionaria sin nombre";
        listaDeMecanicos = new Mecanico[10];
        listaDeVendedores = new Vendedor[10];

    }

    public Consecionaria(String nombre, int numMecanicos, int numVendedores){

        this.nombre = nombre;
        this.numMecanicos = numMecanicos;
        this.numVendedores = numVendedores;
        listaDeMecanicos = new Mecanico[numMecanicos];
        listaDeVendedores = new Vendedor[numVendedores];

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public void setNumMecanicos(int numMecanicos){

        this.numMecanicos = numMecanicos;

    }

    public void setNumVendedores(int numVendedores){

        this.numVendedores = numVendedores;

    }

    public void contratarMecanico(Mecanico mecanico){

        if(contMecanicos < numMecanicos){

            listaDeMecanicos[contMecanicos] = mecanico;

        } else {

            System.out.println("No hay más espacio para mecánicos.");

        }

    }

    public void contratarVendedor(Vendedor vendedor){

        if(contVendedores < numVendedores){

            listaDeVendedores[contVendedores] = vendedor;

        } else {

            System.out.println("No hay más espacio para vendedores.");

        }

    }

    public String getNombre(){

        return nombre;

    }

    public Mecanico[] getListaDeMecanicos(){

        return listaDeMecanicos;

    }

    public Vendedor[] getListaDeVendedores(){

        return listaDeVendedores;

    }

    public void darServicio(Conductor conductor, Vehiculo vehiculo){

        System.out.println("Dando servicio al ");
        vehiculo.descripcionDelVehiculo();
        System.out.print(" de " + conductor.getNombre());

    }

}
