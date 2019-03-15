public class Main {

    public static void main(String[] args) {

        Animal[] arr= new Animal[3];

        //Static binding:

        Bird birdy = new Bird();

        //Dynamic Binding:

        Animal tweety = new Bird();

        //tweety = new Bear(); //Dynamic Binding

        //Arreglo Polimórfico

        arr[0] = birdy;
        arr[1] = tweety;
        arr[2] = new Bear();

        ((Bird) arr[1]).sing("Hey");

        if(tweety instanceof Bird){

            ((Bird) tweety).sing("Hee hee");

        } else{

            tweety.doHisStuff();

        }

        birdy.eat();
        tweety.eat();

    }
}
