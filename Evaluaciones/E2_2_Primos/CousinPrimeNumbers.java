public class CousinPrimeNumbers implements Primo{

    int value;

    private static CousinPrimeNumbers ourInstance = new CousinPrimeNumbers();

    public static CousinPrimeNumbers getInstance() {
        return ourInstance;
    }

    private CousinPrimeNumbers(){

        //this.value = value;

    }


    @Override
    public Tuple nPrime(int n) {
        return null;
    }

    @Override
    public boolean isPrime(Tuple primes) throws NotPrimeNumberException {
        return false;
    }
}
