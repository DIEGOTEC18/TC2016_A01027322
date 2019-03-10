public class Main {

    public static void main(String[] args) {

        Vela velaNormal = new Vela("verde", 8);

        VelasAromaticas velaAromatica = new VelasAromaticas("naranja", 10);

        velaNormal.printPrecio();

        velaAromatica.printPrecio();

    }
}
