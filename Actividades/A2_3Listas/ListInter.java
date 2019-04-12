public interface ListInter <T>{

    void add(T element);
    void remove(int index);
    int find(T value);
    T get(int index);

    T[] getlist();

    default void print(){



    }

}
