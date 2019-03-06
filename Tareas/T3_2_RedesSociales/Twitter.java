public class Twitter extends RedSocial implements Sesion {

    public Twitter(){

        listaDeUsuariosTwitter = new Usuarios[10];
        userCountT = 0;
        loggedTwitter = new Usuarios[10];

    }

    public void addUser(Usuarios usuario){

        if(userCountT < 10){

            listaDeUsuariosTwitter[userCountT] = usuario;

        } else{

            System.out.println("No hay mas espacio para usuarios");

        }

    }

    public void login(Usuarios usuario){

        if(searchUser(listaDeUsuariosTwitter, usuario) != -1){

            for(int i = 0; i < 10; i++){

                if(loggedTwitter[i] == null){

                    loggedTwitter[i] = usuario;

                }

            }
            System.out.println("Bienvenido " + usuario.getNombre());

        } else{

            System.out.println("Usuario y (o) contraseña incorrectos.");

        }

    }

    public void logout(Usuarios usuario){

        if(searchUser(loggedTwitter, usuario) != -1){

            Usuarios[] newList = new Usuarios[10];

            for(int i = 0; i < 10; i++){

                if(!loggedTwitter[i].getNombre().equals(loggedTwitter[searchUser(loggedTwitter, usuario)].getNombre())){

                    newList[i] = loggedTwitter[i];

                }

            }

            loggedTwitter = newList;

        }

    }

    public void postMensaje(String mensaje, Usuarios usuario){

        if(searchUser(loggedTwitter, usuario) != -1) {

            String[] characters = mensaje.split("");
            String finalMessage = "";

            for (int i = 0; i < 140; i++) {

                finalMessage += characters[i];

            }

            String formatMensaje = "*****" + finalMessage + "*****";

            byte[] byteString = formatMensaje.getBytes();

            Latency.sendData(byteString);

        } else{

            System.out.println("\nUsuario " + usuario.getNombre() + " no loggeado. No puede mandar mensajes.");

        }

    }

}
