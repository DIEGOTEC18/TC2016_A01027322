public class Main {

    public static void main(String[] args) {

        Fraction f1 = new Fraction(30, 18);
        Fraction f2 = new Fraction(15,0);

        f1.multiply(f2).printFraction();

        f1.simplify();
        f1.printFraction();

    }
}
