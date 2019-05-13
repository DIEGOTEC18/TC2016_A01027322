public class Flotantes {

    private float value;

    private Flotantes(){}

    public Flotantes(float value){

        this.value = value;

    }

    public void setValue(float value){

        this.value = value;

    }

    public float getValue(){

        return value;

    }

    public void printValue(){

        System.out.println(value);

    }

}
