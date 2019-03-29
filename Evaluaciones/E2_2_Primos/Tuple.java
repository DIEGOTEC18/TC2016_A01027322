public class Tuple <Key, Value> {

    protected Key key;
    protected Value value;

    public Tuple(Key key, Value value){

        this.key = key;
        this.value = value;

    }

    public Key getKey(){

        return key;

    }

    /*public int getFirst(){

        return (int) key;

    }

    public int getSecond(){

        return (int) value;

    }*/

    public Value getValue(){

        return value;

    }

    public String toString(){

        return "(" + key + ", " + value + ")";

    }

}