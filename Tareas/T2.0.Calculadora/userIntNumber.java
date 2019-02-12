public class userIntNumber {

    private int intNumber;

    public userIntNumber(int aNumber){

        intNumber = aNumber;

    }

    public int getNumber(){

        return intNumber;

    }

    public void printNumber(){

        System.out.println(intNumber);

    }

    public userIntNumber sumar(userIntNumber int1){

        userIntNumber result = new userIntNumber(intNumber + int1.getNumber());
        return result;

    }

    public userIntNumber restar(userIntNumber int1){

        userIntNumber result = new userIntNumber(intNumber - int1.getNumber());
        return result;
    }

    public userIntNumber muliplicar(userIntNumber int1){

        userIntNumber result = new userIntNumber(intNumber * int1.getNumber());
        return result;
    }

    public userIntNumber dividir(userIntNumber int1){

        userIntNumber result = new userIntNumber(intNumber / int1.getNumber());
        return result;
    }

    public userIntNumber raiz(){

        // Base cases:
        if (intNumber == 0 || intNumber == 1) {

            return new userIntNumber(intNumber);

        }

        // Staring from 1, try all numbers until i*i is greater than or equal to x:
        int i = 1, result = 1;

        while (result <= intNumber) {
            i++;
            result = i * i;
        }
        return new userIntNumber(i - 1);

    }

    public userIntNumber potencia(int n){

        int currentNumber = intNumber;

        for(int i = 1; i < n; i++){

            currentNumber *= intNumber;

        }

        return new userIntNumber(currentNumber);

    }

}
