public class Car implements PriceRelatable{

    protected String model;

    public Car(String model){

        this.model = model;

    }

    public int getPrice(){


        if(model.equals("advanced")){

            return 100000;

        }

        return 50000;

    }

}
