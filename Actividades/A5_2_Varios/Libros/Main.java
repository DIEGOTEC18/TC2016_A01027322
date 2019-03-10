public class Main {

    public static void main(String[] args) {

        librosFiccion robots = new librosFiccion("Isaac Asimov", "Los Robots Del Amanecer", 1983, 8);
        librosNovelaRomantica fuego = new librosNovelaRomantica("Niall Leonard", "Jugando Con Fuego", 2012, 2);

        robots.printDetails();
        fuego.printDetails();

    }
}
