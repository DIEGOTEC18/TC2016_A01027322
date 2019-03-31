public interface Primo {

    Tuple nPrime(int n);

    boolean isPrime(Tuple primes) throws NotPrimeNumberException;

    default boolean checkPrime(int number){

        boolean prime = true;

        for(int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {

                prime = false;

                break;
            }

        }

        return prime;

    }

    default int getNPrime(int n){

        int prime = 1;

        int current = 0;

        int step = 2;

        for (int ix=3; ix <= n + step; ix++){

            if (checkPrime(prime)){
                current = prime;
                prime+=2;
            }
            else {
                step++;
                prime+=2;
            }
        }

        return current;

    }

}
