public abstract class RedSocial {

    protected Usuarios[] listaDeUsuariosFacebook;
    protected Usuarios[] listaDeUsuariosTwitter;
    protected Usuarios[] listaDeUsuariosInstagram;

    protected Usuarios[] loggedFacebook;
    protected Usuarios[] loggedTwitter;
    protected Usuarios[] loggedInstagram;

    protected int userCountF;
    protected int userCountT;
    protected int userCountI;

    public abstract void addUser(Usuarios usuario);
    //public abstract void postMensaje();

}
