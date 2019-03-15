public class Repartidor extends Persona {

    public Repartidor(String name){

        super(name);

    }

    public void repartir(String pizza){

        System.out.println("Soy " + getName() + "y estoy repartiendo la pizza " + pizza);

    }

}
