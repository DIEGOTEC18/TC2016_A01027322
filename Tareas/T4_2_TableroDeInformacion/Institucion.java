public class Institucion implements Lector {

    public Institucion(){}

    public void postMensaje(Pizarron pizarron, String mensaje, String fecha){

        Mensaje newMensaje = new Mensaje(mensaje, fecha);

        pizarron.addMensaje(newMensaje);

    }

}
