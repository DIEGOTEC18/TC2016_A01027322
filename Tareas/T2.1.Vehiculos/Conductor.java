public class Conductor extends Persona {

    public Conductor(){



    }

    public Conductor(String nombre, int edad){

        super(nombre, edad);

    }

    public void agendarServicio(Consecionaria consecionaria, Vehiculo vehiculo){

        System.out.println("Soy " + getNombre());
        System.out.println("Quiero hacerle un servico a mi ");
        vehiculo.descripcionDelVehiculo();
        System.out.print(" en " + consecionaria.getNombre());

        consecionaria.darServicio(this, vehiculo);

    }

}
