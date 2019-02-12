public class Husband extends Person {

    private Wife wife;

    private Husband(){

    }

    public Husband(String name){

        super(name);

    }

    public void getMarried(Wife wife) {

        if(this.wife == null){

            this.wife = wife;
            wife.getMarried(this);

        }

    }

    public void giveLove(Wife wife){

        System.out.println("Soy " + getName() + " y amo a " + wife.getName());

    }
}