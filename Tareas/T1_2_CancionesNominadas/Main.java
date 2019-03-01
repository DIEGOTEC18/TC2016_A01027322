public class Main {

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Shallow", "Lady Gaga & Bradley Cooper");
        Cancion cancion2 = new Cancion("Suspirium", "Thom Yorke");
        Cancion cancion3 = new Cancion("Revelation", "Troye Sivan & Jónsi");
        Cancion cancion4 = new Cancion("All The Stars", "Kendrick Lamar & SZA");
        Cancion cancion5 = new Cancion("The Place Where Lost Things Go", "Emily Blunt");
        Cancion cancion6 = new Cancion("Trip a Little Light Fantastic", "Emily Blunt & Lin-Manuel Miranda");
        Cancion cancion7 = new Cancion("When a Cowboy Trades His Spurs for Wings", "Willie Watson & Tim Blake Nelson");
        Cancion cancion8 = new Cancion("Keep Reachin", "Quincy Jones, Mark Ronson & Chaka Khan");
        Cancion cancion9 = new Cancion("A Place Called Slaughter Race", "Sarah Silverman & Gal Gadot");
        Cancion cancion10 = new Cancion("OYAHYTT", "The Coup");

        CancionesNominadas premiosOscar = new CancionesNominadas();

        premiosOscar.add(cancion1);
        premiosOscar.add(cancion2);
        premiosOscar.add(cancion3);
        premiosOscar.add(cancion4);
        premiosOscar.add(cancion5);
        premiosOscar.add(cancion6);
        premiosOscar.add(cancion7);
        premiosOscar.add(cancion8);
        premiosOscar.add(cancion9);
        premiosOscar.add(cancion10);

        premiosOscar.print();
        premiosOscar.restablecerPosicionActual();

    }
}
