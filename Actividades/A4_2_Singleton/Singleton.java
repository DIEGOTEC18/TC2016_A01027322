public class Singleton {

    public int value;
    protected static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){

        if(instance != null){

            return instance;

        }

        instance = new Singleton();

        return instance;

    }

}
