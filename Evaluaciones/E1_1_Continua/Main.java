public class Main {

    public static void main(String[] args) {

        //Juanito:

        Cabeza cabezaJuanito = new Cabeza("Castaño", "redonda", new Ceja("negra", 2), new Ceja("negra", 2), new Mejilla(false, true), new Mejilla(false, true), new Boca(new Labio(2, "delgado"), new Labio(2, "delgado"), false), new Ojo("verde", "delgadas"), new Ojo("verde", "delgadas"), new Oreja("medianas", false), new Oreja("medianas", false), new Nariz("delgada", false));
        Persona Juanito = new Persona("Juanito", "Heterosexual", cabezaJuanito);

        //Marianita:

        Cabeza cabezaMarianita = new Cabeza("Pelirrojo", "delgada", new Ceja("cafe", 2), new Ceja("cafe", 2), new Mejilla(true, false), new Mejilla(true, true), new Boca(new Labio(5, "grueso"), new Labio(3, "grueso"), true), new Ojo("verde", "largas"), new Ojo("verde", "largas"), new Oreja("medianas", true), new Oreja("medianas", true), new Nariz("delgada", false));
        Persona Marianita = new Persona("Marianita", "Heterosexual", cabezaMarianita);

        //Lucecita:

        Cabeza cabezaLucecita = new Cabeza("Guero", "fina", new Ceja("guera", 2), new Ceja("guera", 2), new Mejilla(false, false), new Mejilla(false, false), new Boca(new Labio(5, "grueso"), new Labio(3, "grueso"), true), new Ojo("azul", "largas"), new Ojo("azul", "largas"), new Oreja("medianas", true), new Oreja("medianas", true), new Nariz("delgada", true));
        Persona Lucecita = new Persona("Lucecita", "Asexual", cabezaLucecita);

        Juanito.mirar(Marianita);
        Juanito.pedirBeso(Marianita);
        Juanito.pedirBeso(Lucecita); //ingresar false para que Lucecita lo rechaze.

    }
}
