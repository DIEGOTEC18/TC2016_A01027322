public class sucursalPolanco extends Pizzeria {

    private sucursalPolanco(){}

    public sucursalPolanco(GerentePolanco gerentePolanco, Chef chef, Ayudante ayudante, Cajero cajero, Repartidor repartidor){

        this.gerentePolanco = gerentePolanco;
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

        gerentePolanco.reportarIngreso(currentPizza.getPrecio());

    }

    @Override
    public void ordenarPizza(String tipo) {

        if(tipo.equalsIgnoreCase("Vegetariana")){

            pizzaActual = tipo;

            ingredientesActuales = cajero.tomarOrden(tipo, ingredientesPolanco);

        } else{

            System.out.println("La sucursal de Polanco solo hace pizzas Vegetarianas");

        }

    }

    public void contarGanancias(){

        gerentePolanco.contarGanancias();

    }
}
