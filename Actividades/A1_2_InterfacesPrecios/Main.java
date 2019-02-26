public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("advanced");
        Car car2 = new Car("standards");
        House house1 = new House(3);
        House house2 = new House(5);
        Hamburger burgerWithCheese = new Hamburger(true);
        Hamburger burgerSimple = new Hamburger(false);

        System.out.println(car1.isMoreExpensive(house1));


    }
}
