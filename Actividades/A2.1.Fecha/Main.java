import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Date myDate = new Date();

        Date separateDate = new Date();

        Scanner kb = new Scanner(System.in);

        String userDate;

        System.out.println("Ingrese una fecha en el siguiente formato: (dd/mm/yyyy)");
        userDate = kb.nextLine();

        myDate.setDate(userDate);

        System.out.println(myDate.getDate());

        System.out.println("Ingrese una fecha por separado.");
        System.out.println("Día");
        int newDay =kb.nextInt();
        separateDate.setDay(newDay);

        System.out.println("Mes");
        int newMonth =kb.nextInt();
        separateDate.setMonth(newMonth);

        System.out.println("Año");
        int newYear =kb.nextInt();
        separateDate.setYear(newYear);

        System.out.println("Su fecha ingresada por separado es: " + separateDate.getDate());

        System.out.println("Obtener los valores de la fecha por separado.");
        System.out.println("Día: " + separateDate.getDay());
        System.out.println("Fecha: " + separateDate.getMonth());
        System.out.println("Año: " + separateDate.getYear());

        System.out.println("------------------------------------------------------------------------------------------");

        Hour myHour = new Hour();

        System.out.println("Ingresar hora por partes:");
        System.out.println("Horas:");
        myHour.setHours(kb.nextInt());

        System.out.println("Minutos:");
        myHour.setMinutes(kb.nextInt());

        System.out.println("Segundos:");
        myHour.setSeconds(kb.nextInt());

        System.out.println(myHour.getTime());

        System.out.println("Ingresar hora completa en formato: (hh:mm.ss)");
        myHour.setTime(kb.next());

        System.out.println(myHour.getTime());

        System.out.println("Obtener hora por partes:");
        System.out.println("Horas: " + myHour.getData(1));
        System.out.println("Minutos: " + myHour.getData(2));
        System.out.println("Segundos: " + myHour.getData(3));

    }
}
