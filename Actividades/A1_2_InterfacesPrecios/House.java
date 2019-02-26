public class House implements PriceRelatable{

    protected int numRecamaras;

    public House(int numRecamaras){

        this.numRecamaras = numRecamaras;

    }

    public int getPrice(){

        return 100000 * numRecamaras;

    }

}
