public class Boca {

    private Labio[] labios;
    private boolean pintados;

    public Boca(){}

    public Boca(Labio superior, Labio inferior, boolean pintados){

        labios = new Labio[]{superior, inferior};
        this.pintados = pintados;

    }

    public void hablar(){



    }

    public void besar(Persona besador, Persona besado){

        System.out.println("Soy " + besador.getNombre() + " y estoy besando a " + besado.getNombre());

    }

}
