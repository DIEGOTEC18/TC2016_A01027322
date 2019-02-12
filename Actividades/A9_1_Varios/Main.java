public class Main {

    public static void main(String[] args) {

        Husband h = new Husband("Manuel");
        Wife w = new Wife("Manuela");

        w.getMarried(h);
        h.giveLove(w);

        Cliente cliente = new Cliente("Daniel");
        Sucursal sucursal = new Sucursal("INBURSA");

        cliente.retirar(18000.12, sucursal);

    }
}
