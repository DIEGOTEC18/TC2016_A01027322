public class Chef extends Persona {

    public Chef(String name){

        super(name);

    }

    public Pizza crearPizza(String tipo, String[] ingredientes, double precio){

        Pizza pizza = new Pizza(tipo, precio);

        System.out.println("Soy el Chef " + getName() + " y estoy creando una pizza " + pizza.getTipo() + " agregando los siguientes ingredientes:" );

        for(int i = 0; i < ingredientes.length; i++){

            System.out.println("- " + ingredientes[i]);

        }

        pizza.agregarIngredientes(ingredientes);

        return pizza;

    }



}
