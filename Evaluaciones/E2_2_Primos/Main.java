public class Main {

    public static void main(String[] args) {


        TwinPrimeNumbers twinPrimeNumbers = TwinPrimeNumbers.getInstance();

        Tuple myTwinPrime = twinPrimeNumbers.nPrime(6);

        System.out.println(myTwinPrime.toString());

    }
}
