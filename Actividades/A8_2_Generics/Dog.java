public class Dog implements Compare<Dog> {

    protected int age;

    public Dog(int age){

        this.age = age;

    }

    public int getAge(){

        return age;

    }

    public int compare2(Dog object1, Dog object2){

        if(object1.getAge() > object2.getAge()){

            return 1;

        } else if(object1.getAge() < object2.getAge()){

            return -1;

        } else {

            return 0;

        }

    }

}
