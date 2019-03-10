public class Main {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Manuel", "Alcantara", 13, 43);
        Jugador jugador2 = new Jugador("Antia", "Rodriguez", 33, 60);
        Jugador jugador3 = new Jugador("Rodrigo", "Benavente", 12, 80);
        Jugador jugador4 = new Jugador("Mariano", "Soliz", 69, 20);

        Capitan capitan = Capitan.getInstance();

        Capitan capitan2 = Capitan.getInstance();

    }
}
