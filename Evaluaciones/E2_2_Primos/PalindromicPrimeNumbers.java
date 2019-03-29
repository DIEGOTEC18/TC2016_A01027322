public class PalindromicPrimeNumbers implements Primo {

    int value;

    private static PalindromicPrimeNumbers ourInstance = new PalindromicPrimeNumbers();

    public static PalindromicPrimeNumbers getInstance() {
        return ourInstance;
    }

    private PalindromicPrimeNumbers(){

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
