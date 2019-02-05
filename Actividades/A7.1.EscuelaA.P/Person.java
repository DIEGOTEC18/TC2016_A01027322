public class Person {

    private String name;

    private Person(){

        name = "John Doe";

    }

    private Person(String name){

        this.name = name;

    }

    public void print(){

        System.out.println("soy " + name);

    }

}
