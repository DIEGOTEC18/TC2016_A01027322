public abstract class Pizzeria {

    protected GerentePolanco gerentePolanco;
    protected GerenteSantaFe gerenteSantaFe;
    protected Chef chef;
    protected Ayudante ayudante;
    protected Cajero cajero;
    protected Repartidor repartidor;
    protected String pizzaActual;
    protected Pizza currentPizza;
    protected String[] ingredientesActuales;

    protected String[] ingredientesPolanco = {"Vegetales", "Queso bajo en grasa"};
    protected String[] ingredientesSantaFe = {"Queso", "Frijoles", "Piña", "Chorizo"};

    public abstract void crearPizza();

    public abstract void ordenarPizza(String tipo);

}
