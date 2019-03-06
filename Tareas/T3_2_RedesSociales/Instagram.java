public class Instagram extends RedSocial implements Sesion {

    public Instagram(){

        listaDeUsuariosInstagram = new Usuarios[10];
        userCountI = 0;
        loggedInstagram = new Usuarios[10];

    }

    public void addUser(Usuarios usuario){

        if(userCountI < 10){

            listaDeUsuariosInstagram[userCountI] = usuario;

        } else{

            System.out.println("No hay mas espacio para usuarios");

        }

    }

    public void login(Usuarios usuario){

        if(searchUser(listaDeUsuariosInstagram, usuario) != -1){

            for(int i = 0; i < 10; i++){

                //System.out.println(loggedInstagram[i]);

                if(loggedInstagram[i] == null){

                    loggedInstagram[i] = usuario;

                }

            }
            System.out.println("Bienvenido " + usuario.getNombre());

        } else{

            System.out.println("Usuario y (o) contraseña incorrectos.");

        }

    }

    public void logout(Usuarios usuario){

        if(searchUser(loggedInstagram, usuario) != -1){

            //System.out.println("Si entra logout");

            //System.out.println(loggedInstagram[searchUser(loggedInstagram, usuario)].getNombre());

            //loggedInstagram[searchUser(loggedInstagram, usuario)] = null;

            Usuarios[] newList = new Usuarios[10];

            for(int i = 0; i < 10; i++){

                if(!loggedInstagram[i].getNombre().equals(loggedInstagram[searchUser(loggedInstagram, usuario)].getNombre())){

                    newList[i] = loggedInstagram[i];

                }

            }

            loggedInstagram = newList;

        }

    }

    public void postMensaje(String mensaje, Usuarios usuario){

        if(searchUser(loggedInstagram, usuario) != -1) {

            String formatMensaje = "\n-----------------------------\nInstagram\nUsuario " + usuario.getNombre() + " publicó:\n" + mensaje;

            byte[] byteString = formatMensaje.getBytes();

            Latency.sendData(byteString);

        } else{

            System.out.println("\nUsuario " + usuario.getNombre() + " no loggeado. No puede mandar mensajes.");

        }

    }

}
