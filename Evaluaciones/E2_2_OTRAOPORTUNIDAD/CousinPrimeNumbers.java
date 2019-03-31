public class CousinPrimeNumbers implements Primo{

    int value;

    private static CousinPrimeNumbers ourInstance = new CousinPrimeNumbers();

    public static CousinPrimeNumbers getInstance() {
        return ourInstance;
    }

    private CousinPrimeNumbers(){

        //this.value = value;

    }


    public Tuple nPrime(int n){

        Tuple<Integer, Integer>[] numberList = new Tuple[n];

        int step = 0;

        int current = 0;

        for(int i = 1; i < (n + 1) + step; i++){

            if(checkPrime(getNPrime(i) + 4) && getNPrime(i) != 1){

                //System.out.println("(" + getNPrime(i) + "," + (getNPrime(i) + 2) + ")");

                int second = getNPrime(i) + 4;

                //System.out.println(second);

                numberList[current] = new Tuple<>(getNPrime(i), second);

                current++;

            } else {

                step++;

            }

        }

        return numberList[n - 1];

    }

    @Override
    public boolean isPrime(Tuple primes) throws NotPrimeNumberException {

        if(checkPrime((int)primes.getKey()) && checkPrime((int)primes.getValue()) && (((int)primes.getValue()) - ((int)primes.getKey())) == 4 && (int)primes.getKey() != 1){

            return true;

        }

        throw new NotPrimeNumberException((int)primes.getKey(), (int)primes.getValue(), "Cousin Prime Numbers");
    }
}
