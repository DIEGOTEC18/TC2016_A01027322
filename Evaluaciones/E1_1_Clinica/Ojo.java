public class Ojo {

    private String color;
    private String tamanoPestanas;

    public Ojo(){}

    public Ojo(String color, String tamanoPestanas){

        this.color = color;
        this.tamanoPestanas = tamanoPestanas;

    }

    public void parpadear(String parpareador){

        System.out.println("Soy " + parpareador + " y estoy parpadeando");

    }

    public void mirar(Persona mirador, Persona mirado){

        System.out.println("Soy " + mirador.getNombre() + " y estoy viendo a " + mirado.getNombre());

    }

}
