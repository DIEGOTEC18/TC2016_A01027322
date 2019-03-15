import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Cajero extends Persona {

    public Cajero(String name){

        super(name);

    }

    public String[] tomarOrden(String tipo, String[] ingredientesDisponibles){

        System.out.println("Soy " + getName() + " y tomé la orden para una pizza " + tipo);

        String[] ingredientes = new String[]{"Sin ingredientes"};

        if(tipo.equalsIgnoreCase("TuCreacion")){

            ingredientes = new String[0];

            Scanner kb = new Scanner(System.in);

            String userResponse = "si";

            while(userResponse.equalsIgnoreCase("si")){

                String userIngredient;

                System.out.println("Ingrese alguno de los siguientes ingredientes: " + Arrays.toString(ingredientesDisponibles));
                userIngredient = kb.next();

                String[] newArray = new String[ingredientes.length + 1];

                for(int i = 0; i < ingredientes.length; i++){

                    newArray[i] = ingredientes[i];

                }

                newArray[newArray.length -1] = userIngredient;

                ingredientes = newArray;

                System.out.println("¿Quiere agregar otro ingrediente? (si/no)");
                userResponse = kb.next();

            }

        } else{

            switch (tipo){

                case "Hawaiana":

                    ingredientes = new String[]{"Queso", "Piña"};

                    break;

                case "Mexicana":

                    ingredientes = new String[]{"Queso", "Chorizo", "Frijoles"};

                    break;

                case "Vegetariana":

                    ingredientes = new  String[]{"Vegetales", "Queso bajo en grasa"};

                    break;

            }

        }

        return ingredientes;

    }

    public Pizza pedirPreparacion(Chef chef, String tipo, String[] ingredientes){

        double precio = 0;

        for(int i = 0; i < ingredientes.length; i++){

            switch (ingredientes[i]){

                case "Queso bajo en grasa":

                    precio += 40;
                    break;

                case "Queso":

                    precio += 30;
                    break;

                case "Chorizo":

                    precio += 25;
                    break;

                case "Frijoles":

                    precio += 20;
                    break;

                case "Vegetales":

                    precio += 15;
                    break;

                case "Piña":

                    precio += 10;
                    break;

                default:

                    precio += 5;
                    break;

            }

        }

       return chef.crearPizza(tipo, ingredientes, precio);

    }

    public void pedirRepartir(Repartidor repartidor, String pizza){

        repartidor.repartir(pizza);

    }

}
