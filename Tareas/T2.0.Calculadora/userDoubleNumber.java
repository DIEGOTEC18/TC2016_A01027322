public class userDoubleNumber {

    private double doubleNumber;

    public userDoubleNumber(double aNumber){

        doubleNumber = aNumber;

    }

    public double getNumber(){

        return doubleNumber;

    }

    public void printNumber(){

        System.out.println(doubleNumber);

    }

    public userDoubleNumber sumar(userDoubleNumber int1){

        userDoubleNumber result = new userDoubleNumber(doubleNumber + int1.getNumber());
        return result;

    }

    public userDoubleNumber restar(userDoubleNumber int1){

        userDoubleNumber result = new userDoubleNumber(doubleNumber - int1.getNumber());
        return result;
    }

    public userDoubleNumber muliplicar(userDoubleNumber int1){

        userDoubleNumber result = new userDoubleNumber(doubleNumber * int1.getNumber());
        return result;
    }

    public userDoubleNumber dividir(userDoubleNumber int1){

        userDoubleNumber result = new userDoubleNumber(doubleNumber / int1.getNumber());
        return result;
    }

    public userDoubleNumber raiz(){

        // Base cases:
        if (doubleNumber == 0 || doubleNumber == 1) {

            return new userDoubleNumber(doubleNumber);

        }

        double n;

        double squareRoot = doubleNumber / 2;

        do {
            n = squareRoot;
            squareRoot = (n + (doubleNumber / n)) / 2;
        } while ((n - squareRoot) != 0);

        return new userDoubleNumber(squareRoot);

    }

    public userDoubleNumber potencia(int n){

        double currentNumber = doubleNumber;

        for(int i = 1; i < n; i++){

            currentNumber *= doubleNumber;

        }

        return new userDoubleNumber(currentNumber);

    }

}

