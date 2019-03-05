public class Main {

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        s.value = 10;
        System.out.println(s.value);

        Singleton second = Singleton.getInstance();
        second.value = 12;
        System.out.println(s.value);

    }
}
