public class Facebook extends RedSocial implements Sesion {

    public Facebook(){

        listaDeUsuariosFacebook = new Usuarios[10];
        userCountF = 0;
        loggedFacebook = new Usuarios[10];

    }

    public void addUser(Usuarios usuario){

        if(userCountF < 10){

            listaDeUsuariosFacebook[userCountF] = usuario;

        } else{

            System.out.println("No hay mas espacio para usuarios");

        }

    }

    public void login(Usuarios usuario){

        if(searchUser(listaDeUsuariosFacebook, usuario) != -1){

            for(int i = 0; i < 10; i++){

                if(loggedFacebook[i] == null){

                    loggedFacebook[i] = usuario;

                }

            }
            System.out.println("Bienvenido " + usuario.getNombre());

        } else{

            System.out.println("Usuario y (o) contraseña incorrectos.");

        }

    }

    public void logout(Usuarios usuario){

        if(searchUser(loggedFacebook, usuario) != -1){

            Usuarios[] newList = new Usuarios[10];

            for(int i = 0; i < 10; i++){

                if(!loggedFacebook[i].getNombre().equals(loggedFacebook[searchUser(loggedFacebook, usuario)].getNombre())){

                    newList[i] = loggedFacebook[i];

                }

            }

            loggedFacebook = newList;

        }

    }

    public void postMensaje(String mensaje, Usuarios usuario){

        if(searchUser(loggedFacebook, usuario) != -1){

        String formatMensaje = "******************FACEBOOK****************\n" +
                "*                                                                 *\n" +
                "*    " + mensaje + "       *\n" +
                "*                                                                 *\n" +
                "************************************************\n";

        byte[] byteString = formatMensaje.getBytes();

        Latency.sendData(byteString);

        } else{

            System.out.println("\nUsuario " + usuario.getNombre() + " no loggeado. No puede mandar mensajes.");

        }

    }



}
