public class sucursalSantaFe extends Pizzeria {

    public sucursalSantaFe(GerenteSantaFe gerenteSantaFe, Chef chef, Ayudante ayudante, Cajero cajero, Repartidor repartidor){

        this.gerenteSantaFe = gerenteSantaFe;
        this.chef = chef;
        this.ayudante = ayudante;
        this.cajero = cajero;
        this.repartidor = repartidor;

    }

    public void crearPizza() {

        ayudante.amazar(pizzaActual);
        currentPizza = cajero.pedirPreparacion(chef, pizzaActual, ingredientesActuales);
        currentPizza.hornear();
        ayudante.empacar(currentPizza);
        cajero.pedirRepartir(repartidor, pizzaActual);

        //System.out.println(currentPizza.getPrecio());

        gerenteSantaFe.reportarIngreso(currentPizza.getPrecio());

    }

    @Override
    public void ordenarPizza(String tipo) {

        if(!tipo.equalsIgnoreCase("Vegetariana")){

            pizzaActual = tipo;

            ingredientesActuales = cajero.tomarOrden(tipo, ingredientesSantaFe);

        } else{

            System.out.println("La sucursal de Santa Fe no hace pizzas Vegetarianas");

        }

    }

    public void contarGanancias(){

        gerenteSantaFe.contarGanancias();

    }
}
