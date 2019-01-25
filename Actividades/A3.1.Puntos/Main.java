public class Main {

    public static void main(String[] args) {

        Point a = new Point(2.33, 3.46);
        Point b = new Point(4.55, 6.34);

        System.out.println(a.getX());
        System.out.println(a.getY());

        System.out.println(a.getDistance(b));
        System.out.println(b.getDistance(a));

    }
}
