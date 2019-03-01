public interface Iterador {

    Object[] getArray();

    int getPosition();
    void setPosition(int position);
    void restablecerPosicionActual();

    default boolean hasNext(){

        if(getArray().length == getPosition()){

            return false;

        }

        if(getArray()[getPosition()] != null){

            return true;

        }

        return false;

    }

    default Cancion next(){

        int i = getPosition() + 1;
        int b = getPosition();
        setPosition(i);
        return (Cancion) getArray()[b];

    }

    default void remove(){

        getArray()[getPosition()] = null;

    }


}
