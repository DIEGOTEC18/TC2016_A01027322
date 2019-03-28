//Clase genérica:
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

    public Value getValue(){

        return value;

    }

    public String toString(){

        return "(" + key + ", " + value + ")";

    }

}