public class Hamburger implements PriceRelatable{

    protected boolean cheese;

    public Hamburger(boolean cheese){

        this.cheese = cheese;

    }

    public int getPrice(){

        if(cheese){

            return 20;

        }

        return 15;

    }

}
