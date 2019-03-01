public class CancionesNominadas implements Iterador {

    private Cancion[] listaDeCanciones;
    private int i = 0;

    public int getPosition(){

        return i;

    }

    public void setPosition(int position){

        i = position;

    }

    public void restablecerPosicionActual(){

        i = 0;

    }

    public CancionesNominadas(){

        listaDeCanciones = new Cancion[10];

    }

    public Cancion[] getArray(){

        return listaDeCanciones;

    }

    public void add(Cancion cancion){

        int count = 0;

        while(listaDeCanciones[count] != null){

            count++;

        }

        if(count == 10){

            System.out.println(count);
            System.out.println("No hay espacio para más canciones.");

        } else{

            listaDeCanciones[count] = cancion;

        }

    }

    public void print(){

        while (hasNext()){

            next().print();

        }

    }

}
