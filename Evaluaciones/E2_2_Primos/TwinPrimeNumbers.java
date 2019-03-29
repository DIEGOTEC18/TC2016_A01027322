public class TwinPrimeNumbers implements Primo {

    int value;

    private static TwinPrimeNumbers ourInstance = new TwinPrimeNumbers();

    public static TwinPrimeNumbers getInstance() {
        return ourInstance;
    }

    private TwinPrimeNumbers(){

        //this.value = value;

    }


     public Tuple nPrime(int n){

         int prime = 1;

         int step = 0;

         for (int i=3; i <= n + 1; i++){

             if (prime % i == 0){
                 prime+=2;
             }
             else {
                 step++;
                 prime+=2;
             }
         }

         return new Tuple<>(prime, prime + 2);

     }

    @Override
    public boolean isPrime(Tuple primes) throws NotPrimeNumberException {

        if((int)primes.getKey() % 2 != 0 && (int)primes.getKey() != 1 && (int)primes.getKey() + 2 == (int)primes.getKey()){

            return true;

        }

        throw new NotPrimeNumberException((int)primes.getKey(), (int)primes.getKey(), "Twin Prime Numbers");
    }
}
