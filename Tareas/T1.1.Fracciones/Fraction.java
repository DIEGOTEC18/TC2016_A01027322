import java.math.BigDecimal;

public class Fraction {

 private int numerador, denominador;

 public void setNewFraction(int numerador, int denominador){

     this.numerador = numerador;
     this.denominador = denominador;

 }

 public void printFraction(){

     System.out.println(numerador + "/" + denominador);

 }

 public String printAnyFraction(int num, int den){

     return (num + "/" + den);

 }

 //Gets the GCD (Greates Common Denominator):
 public int GCD(int numerador, int denominador){

     if (denominador==0) {

         return numerador;

     }else{

         //Recursive Call: (A cheap way to make a loop)
         return GCD(denominador, (numerador % denominador));

     }

 }

 //Simplifies the current fraction attributes.
 public void simplify(){

     int gcd = GCD(numerador, denominador);

     numerador = (numerador / gcd);
     denominador = (denominador / gcd);

 }

 //Reduces fraction elements by separate:
 public int[] reduceFraction(int num, int den){

     int gcd = GCD(num, den);

     int[] fractionElements = {(num / gcd), (den / gcd)};

     return fractionElements;

 }

 //Converts any number to a fraction (Uses BigDecimal which is essentially a class double that holds its real fractional value and not an approximation):

    public int[] convertToFraction(String numberStr) {
        String[] parts = null;

        //parse the string to convert to a number
        BigDecimal number = new BigDecimal(numberStr);
        //Splits the number by the decimal point:
        parts = number.toString().split("\\.");

        // determine the denominator:
        BigDecimal den = BigDecimal.TEN.pow(parts[1].length());

        // determine the numerator:
        BigDecimal num = (new BigDecimal(parts[0]).multiply(den)).add(new BigDecimal(parts[1]));
        return reduceFraction(num.intValue(), den.intValue());
    }

    public String suma(double number){

     double realValue = ((this.numerador + 0.0) / (this.denominador + 0.0)); //To avoid a floating point.

     int[] operations = convertToFraction(String.valueOf(realValue + number));

     String result = this.numerador + "/" + this.denominador + " + " + number + " = " + (printAnyFraction(operations[0], operations[1]));

     return result;
    }

    public String resta(double number){

        double realValue = ((this.numerador + 0.0) / (this.denominador + 0.0)); //To avoid a floating point.

        int[] operations = convertToFraction(String.valueOf(realValue - number));

        String result = this.numerador + "/" + this.denominador + " - " + number + " = " + (printAnyFraction(operations[0], operations[1]));

        return result;
    }

    public String multiplica(double number){

        double realValue = ((this.numerador + 0.0) / (this.denominador + 0.0)); //To avoid a floating point.

        int[] operations = convertToFraction(String.valueOf(realValue * number));

        String result = this.numerador + "/" + this.denominador + " * " + number + " = " + (printAnyFraction(operations[0], operations[1]));

        return result;
    }

    public String divide(double number){

        double realValue = ((this.numerador + 0.0) / (this.denominador + 0.0)); //To avoid a floating point.

        int[] operations = convertToFraction(String.valueOf(realValue / number));

        String result = this.numerador + "/" + this.denominador + " / " + number + " = " + (printAnyFraction(operations[0], operations[1]));

        return result;
    }

}
