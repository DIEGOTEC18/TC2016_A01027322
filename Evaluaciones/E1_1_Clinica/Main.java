public class Main {

    public static void main(String[] args) {

        //Juanito:

        Cabeza cabezaJuanito = new Cabeza("Castaño", "redonda", new Ceja("negra", 2), new Ceja("negra", 2), new Mejilla(false, true), new Mejilla(false, true), new Boca(new Labio(2, "delgado"), new Labio(2, "delgado"), false), new Ojo("verde", "delgadas"), new Ojo("verde", "delgadas"), new Oreja("medianas", false), new Oreja("medianas", false), new Nariz("delgada", false));
        Persona Juanito = new Persona("Juanito", "Heterosexual", cabezaJuanito);

    }
}
