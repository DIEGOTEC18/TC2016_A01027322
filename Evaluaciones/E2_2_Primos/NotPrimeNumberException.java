public class NotPrimeNumberException extends Exception {

    private int firstNumber;
    private int secondNuber;
    private String type;

    public NotPrimeNumberException(int firstNumber, int secondNumber, String type){

        this.firstNumber = firstNumber;
        this.secondNuber = secondNumber;
        this.type = type;

    }

    public String toString(){

        return "El número <" +  firstNumber + "," + secondNuber + "> no corresponde a un " + type;

    }

}
