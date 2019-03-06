import java.util.Arrays;

public interface Sesion {
    
    void login(Usuarios usuario);
    void logout(Usuarios usuario);

    default int searchUser(Usuarios[] usuarios, Usuarios usuario){

        for(int i = 0; i < usuarios.length; i++){

            //System.out.println(Arrays.toString(usuarios));

            //System.out.println("Si entra");

            if(usuarios[i] != null) {

                //System.out.println(usuarios[i].getNombre());

                if (usuarios[i].getNombre().equals(usuario.getNombre()) && usuarios[i].getPassword().equals(usuario.getPassword())) {

                    //System.out.println("Si entra");

                    return i;

                }
            }

        }

        return -1;

    }

}
