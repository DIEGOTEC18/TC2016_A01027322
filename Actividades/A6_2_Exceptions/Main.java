public class Main {

    public static void main(String[] args) {

        Banco Inbursa = new Banco(2400);

        Inbursa.depositar(325.40);

        try{

            Inbursa.reirar(3000);

        } catch (InsufficientFundsException e){

            System.out.println(e.toString());

        }

        int[] array = new int[5];

        try {

            array[6] = 20;

        } catch (IndexOutOfBoundsException e){

            System.out.println(e.toString());

        }
    }
}
