public class Main {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(2, 3, "isosceles");
        System.out.println("Triangulo:");
        System.out.println("Perimetro: " + triangulo.perimetro());
        System.out.println("Área: " + triangulo.area());

        Cuadrado cuadrado = new Cuadrado(2);
        System.out.println("\nCuadrado:");
        System.out.println("Perimetro: " + cuadrado.perimetro());
        System.out.println("Área: " + cuadrado.area());

        Rectangulo rectangulo = new Rectangulo(5, 2);
        System.out.println("\nRectangulo:");
        System.out.println("Perimetro: " + rectangulo.perimetro());
        System.out.println("Área: " + rectangulo.area());

        Rombo rombo = new Rombo(4, 2);
        System.out.println("\nRombo:");
        System.out.println("Perimetro: " + rombo.perimetro());
        System.out.println("Área: " + rombo.area());

        Romboide romboide = new Romboide(3, 5, 4);
        System.out.println("\nRomboide:");
        System.out.println("Perimetro: " + romboide.perimetro());
        System.out.println("Área: " + romboide.area());

        Trapecio trapecio = new Trapecio(2, 3, 4, 2, 5);
        System.out.println("\nTrapecio:");
        System.out.println("Perimetro: " + trapecio.perimetro());
        System.out.println("Área: " + trapecio.area());

    }

}
