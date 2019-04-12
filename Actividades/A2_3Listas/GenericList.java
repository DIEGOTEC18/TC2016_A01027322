import java.util.ArrayList;

public class GenericList<Object> implements ListInter<Object> {


    protected Object[] array = new Object[10];
    protected int contElement;

    public GenericList(){

        contElement = 0;

    }

    @Override
    public void add(Object element) {

        if(contElement >= 10){

            return;

        }

        array[contElement++] = element;

    }

    @Override
    public void remove(int index) {

        for(int i = index; i<contElement; i++){

            array[i] = array[i + 1];

        }

        array[contElement] = null;
        contElement--;

    }

    @Override
    public int find(Object element) {

        int cont = 0;
        for(Object ele : array){

            if(ele.equals(element)){

                return cont;

            }
            cont++;

        }

        return -1;
    }

    @Override
    public Object get(int index) {

        if(index > contElement || index < 0){

            return null;

        }

        return array[index];
    }

    @Override
    public Object[] getlist() {

        return array;

    }

    public void print(){

        for(int i = 0; i < contElement; i++){

            System.out.println(array[i].toString());

        }

    }


}
