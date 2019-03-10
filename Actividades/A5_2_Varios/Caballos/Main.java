import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Caballo caballoNormal = new Caballo("CaballoDeCampo", "café", new Date());

        CaballoDeCarreras caballoVeloz = new CaballoDeCarreras("CaballoManuel", "negro", new Date(), 3, 10);

    }
}
