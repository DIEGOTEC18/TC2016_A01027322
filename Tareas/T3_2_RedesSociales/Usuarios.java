public class Usuarios {

    private String nombre;
    private String password;

    private Usuarios(){}

    public Usuarios(String nombre, String password){

        this.nombre = nombre;
        this.password = password;

    }

    public String getNombre(){

        return nombre;

    }

    public String getPassword(){

        return password;

    }

}
