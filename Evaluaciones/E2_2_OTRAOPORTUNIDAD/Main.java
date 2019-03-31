public class Main {

    public static void main(String[] args) {

        System.out.println("Twin Prime Numbers-----------------");

        TwinPrimeNumbers twinPrimeNumbers = TwinPrimeNumbers.getInstance();

        Tuple myTwinPrime = twinPrimeNumbers.nPrime(5);

        System.out.println(myTwinPrime.toString());

        try{

            System.out.println(twinPrimeNumbers.isPrime(myTwinPrime));

        } catch (NotPrimeNumberException e){

            System.out.println(e.toString());

        }

        try{

            System.out.println(twinPrimeNumbers.isPrime(new Tuple<>(2, 3)));

        } catch (NotPrimeNumberException e){

            System.out.println(e.toString());

        }

        try{

            System.out.println(twinPrimeNumbers.isPrime(new Tuple<>(137, 139)));

        } catch (NotPrimeNumberException e){

            System.out.println(e.toString());

        }

        System.out.println("\nCousin Prime Numbers-----------------");

        CousinPrimeNumbers cousinPrimeNumbers = CousinPrimeNumbers.getInstance();

        Tuple myCousinPrimeNumbers = cousinPrimeNumbers.nPrime(5);

        System.out.println(myCousinPrimeNumbers);

        try{

            System.out.println(cousinPrimeNumbers.isPrime(new Tuple<>(2, 3)));

        } catch (NotPrimeNumberException e){

            System.out.println(e.toString());

        }

        try{

            System.out.println(cousinPrimeNumbers.isPrime(new Tuple<>(883, 887)));

        } catch (NotPrimeNumberException e){

            System.out.println(e.toString());

        }

        System.out.println("\nPalindromic Prime Numbers-----------------");

        PalindromicPrimeNumbers palindromicPrimeNumbers = PalindromicPrimeNumbers.getInstance();

        Tuple myPalindromicPrimeNumbers = palindromicPrimeNumbers.nPrime(5);

        System.out.println(myPalindromicPrimeNumbers);

        try{

            System.out.println(palindromicPrimeNumbers.isPrime(new Tuple<>(1, 1)));

        } catch (NotPrimeNumberException e){

            System.out.println(e.toString());

        }

        try{

            System.out.println(palindromicPrimeNumbers.isPrime(new Tuple<>(787, 787)));

        } catch (NotPrimeNumberException e){

            System.out.println(e.toString());

        }

    }
}
