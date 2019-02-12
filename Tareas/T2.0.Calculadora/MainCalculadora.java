import java.util.Scanner;

public class MainCalculadora {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Operaciones con enteros (int):");
        System.out.println("Ingrese un valor entero para A:");
        userIntNumber numberA = new userIntNumber(kb.nextInt());
        System.out.println("Ingrese un valor entero para B:");
        userIntNumber numberB = new userIntNumber(kb.nextInt());
        System.out.println("\nLos números iniciales son:");
        System.out.println("A = " + numberA.getNumber() + "\nB = " + numberB.getNumber());

        System.out.println("\nSuma A + B = ");
        numberA.sumar(numberB).printNumber();
        System.out.println("\nResta A - B = ");
        numberA.restar(numberB).printNumber();
        System.out.println("\nMultiplica A * B = ");
        numberA.muliplicar(numberB).printNumber();
        System.out.println("\nDivide A / B = ");
        numberA.dividir(numberB).printNumber();
        System.out.println("\nObtener la raíz cuadrada de A en enteros = ");
        numberA.raiz().printNumber();
        System.out.println("\nObtener la potencia de A a la n = ");
        System.out.println("Ingrese la potencia entera a la que quiera elevar A:");
        numberA.potencia(kb.nextInt()).printNumber();

        System.out.println("Operaciones con decimales (double):");
        System.out.println("Ingrese un valor decimal para A:");
        userDoubleNumber doubleA = new userDoubleNumber(kb.nextDouble());
        System.out.println("Ingrese un valor decimal para B:");
        userDoubleNumber doubleB = new userDoubleNumber(kb.nextDouble());
        System.out.println("\nLos números iniciales son:");
        System.out.println("A = " + doubleA.getNumber() + "\nB = " + doubleB.getNumber());

        System.out.println("\nSuma A + B = ");
        doubleA.sumar(doubleB).printNumber();
        System.out.println("\nResta A - B = ");
        doubleA.restar(doubleB).printNumber();
        System.out.println("\nMultiplica A * B = ");
        doubleA.muliplicar(doubleB).printNumber();
        System.out.println("\nDivide A / B = ");
        doubleA.dividir(doubleB).printNumber();
        System.out.println("\nObtener la raíz cuadrada de A en decimales = ");
        doubleA.raiz().printNumber();
        System.out.println("\nObtener la potencia de A a la n = ");
        System.out.println("Ingrese la potencia entera a la que quiera elevar A:");
        doubleA.potencia(kb.nextInt()).printNumber();

    }
}
