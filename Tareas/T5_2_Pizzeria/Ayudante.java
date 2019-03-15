public class Ayudante extends Persona {

    public Ayudante(String name){

        super(name);

    }

    public void amazar(String pizza){

        System.out.println("Soy el ayudante " + getName() + " y estoy amazando la masa para la pizza " + pizza);

    }

    public void empacar(Pizza pizza){

        System.out.println("Soy el ayudante " + getName() + " y estoy empacando la pizza " + pizza.getTipo());

    }

}
