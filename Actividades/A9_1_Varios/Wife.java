public class Wife extends Person {

    private Husband husband;

    //Es private para impedir que se cree sin nombre:
    private Wife(){

    }

    public Wife(String name){

        super(name);

    }

    public void getMarried(Husband husband){

        if(this.husband == null){

            this.husband = husband;
            husband.getMarried(this);

        }

    }

    public void giveLove(Husband husband){

        System.out.println("Soy " + getName() + " y amo a " + husband.getName());

    }

}
