public interface PriceRelatable {

    int getPrice();
    default boolean isMoreExpensive(PriceRelatable price){

        if(getPrice() > price.getPrice()){

            return true;

        }

        return false;

    }

}
