public class PalindromicPrimeNumbers implements Primo {

    int value;

    private static PalindromicPrimeNumbers ourInstance = new PalindromicPrimeNumbers();

    public static PalindromicPrimeNumbers getInstance() {
        return ourInstance;
    }

    private PalindromicPrimeNumbers(){

        //this.value = value;

    }



    public Tuple nPrime(int n){

        Tuple<Integer, Integer>[] numberList = new Tuple[n];

        int step = 0;

        int current = 0;

        for(int i = 1; i < (n + 1) + step; i++){

            String[] primeStringList = (Integer.toString(getNPrime(i))).split("");

            String newNumberString = "";

            //System.out.println(primeStringList[0]);

            for(int a = primeStringList.length - 1; a >= 0; a--){

                //System.out.println(primeStringList[a]);

                newNumberString += primeStringList[a];

            }

            int inverted = Integer.parseInt(newNumberString);

            if(inverted == getNPrime(i)){

                //System.out.println("(" + getNPrime(i) + "," + (getNPrime(i) + 2) + ")");

                int second = getNPrime(i);

                //System.out.println(second);

                numberList[current] = new Tuple<>(getNPrime(i), second);

                current++;

            } else {

                step++;

            }

        }

        return numberList[n - 1];

    }

    public boolean isPrime(Tuple prime) throws NotPrimeNumberException {

        int primes = (int) prime.getKey();

        String[] primeStringList = (Integer.toString(primes)).split("");

        String newNumberString = "";

        //System.out.println(primeStringList[0]);

        for(int a = primeStringList.length - 1; a >= 0; a--){

            //System.out.println(primeStringList[a]);

            newNumberString += primeStringList[a];

        }

        int reversed = Integer.parseInt(newNumberString);

        if(checkPrime(primes) && primes == reversed && primes != 1){

            return true;

        }

        throw new NotPrimeNumberException(primes, reversed, "Palindromic Prime Numbers");
    }
}
