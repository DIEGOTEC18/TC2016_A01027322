public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(){

        numerator = 0;
        denominator = 1;

    }

    public Fraction(int numRes, int denRes) {

        this.numerator = numRes;
        this.denominator = denRes;

    }

    public int getNumerator(){

        return numerator;

    }

    public int getDenominator(){

        return denominator;

    }

    public Fraction multiply(Fraction f2){

        int numRes = numerator * f2.getNumerator();
        int denRes = denominator * f2.getDenominator();

        Fraction result = new Fraction(numRes, denRes);

        return result;

    }

    public void printFraction(){

        if(denominator == 1){

            System.out.println(numerator);

        }else {

            System.out.println(numerator + "/" + denominator);

        }

    }

    public void simplify(){

        int i = 2;
        while(i <= denominator){

            if(numerator % i == 0 && denominator % i == 0){

                numerator = numerator / i;
                denominator /= i;
                i = 2;

            } else{i++;}

        }

    }

}
