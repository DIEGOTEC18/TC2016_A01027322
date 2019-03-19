public class Main {

    public static void main(String[] args) {

        Tuple1<Integer, String> intString = new Tuple1<>(1, "Dave");

        Tuple1<String, String> stringString = new Tuple1<>("2", "Juan");

        Tuple1[] array1 = new Tuple1[3];

        array1[0] = intString;
        array1[1] = stringString;


        for(int i = 0; i < 2; i++){

            System.out.println(array1[i].toString());

        }

    }



}
