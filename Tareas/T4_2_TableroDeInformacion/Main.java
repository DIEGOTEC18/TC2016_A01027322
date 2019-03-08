public class Main {

    public static void main(String[] args) {

        Pizarron pizarron = Pizarron.getInstance();

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        Alumno alumno5 = new Alumno();

        Institucion tec = new Institucion();

        tec.postMensaje(pizarron, "Hoy ceremónia de graduación", "18/04/2019");

        alumno1.getMessage(pizarron);
        alumno2.getMessage(pizarron);
        alumno3.getMessage(pizarron);

        tec.postMensaje(pizarron, "Cancelada la ceremonía", "03/05/2019");

        alumno4.getMessage(pizarron);

        alumno5.printHistory(pizarron);

        alumno1.printMessageByDate(pizarron, "18/04/2019");

    }
}
