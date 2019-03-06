public class Main {

    public static void main(String[] args) {

        Usuarios Diego = new Usuarios("Diego Velázquez", "password1");
        Usuarios Javier = new Usuarios("Javier Vega", "password2");
        Usuarios Eduardo = new Usuarios("Eduardo Piña", "password3");

        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();
        Instagram instagram = new Instagram();

        facebook.addUser(Diego);
        twitter.addUser(Javier);
        twitter.addUser(Eduardo);
        instagram.addUser(Eduardo);

        twitter.login(Diego);

        instagram.login(Eduardo); //+

        instagram.postMensaje("Me encanta la clase de programación orientada a objetos", Eduardo);

        instagram.logout(Eduardo);

        instagram.postMensaje("\nEste mensaje no debe de aparecer", Eduardo);

        facebook.postMensaje("Dejaste las intermitentes prendidas hermano.", Diego);

        facebook.login(Diego);

        facebook.postMensaje("Dejaste las intermitentes prendidas hermano.", Diego);

        facebook.logout(Diego);

        facebook.postMensaje("LOL XD", Diego);

    }
}
