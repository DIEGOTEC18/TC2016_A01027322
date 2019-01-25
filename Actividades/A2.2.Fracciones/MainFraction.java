import java.util.Scanner;

public class MainFraction {

    public static void main(String[] args){

        Fraction userFraction1 = new Fraction();

        /*
        int[] test = userFraction1.convertToFraction("5.2");
        userFraction1.printAnyFraction(test[0], test[1]);
        */

        Scanner kb = new Scanner(System.in);

        String userResponse;

        System.out.println("Porfavor ingrese su fracción en el formato (numerador/denominador) [EJEMPLO: 2/4]:");
        userResponse = kb.next();

        String[] fractionArray = userResponse.split("/");

        userFraction1.setNewFraction(Integer.parseInt(fractionArray[0]), Integer.parseInt(fractionArray[1]));

        System.out.println("\nSu fracción es:");
        userFraction1.printFraction();

        System.out.println("\nSu fracción simplificada es:");
        userFraction1.simplify();
        userFraction1.printFraction();

        System.out.println("Ingrese un valor que quiera sumar a su fracción:");
        System.out.println(userFraction1.suma(kb.nextDouble()));

        System.out.println("Ingrese un valor que quiera restar a su fracción:");
        System.out.println(userFraction1.resta(kb.nextDouble()));

        System.out.println("Ingrese un valor que quiera multiplicar a su fracción:");
        System.out.println(userFraction1.multiplica(kb.nextDouble()));

        System.out.println("Ingrese un valor que quiera dividir a su fracción:");
        System.out.println(userFraction1.divide(kb.nextDouble()));

    }

}
