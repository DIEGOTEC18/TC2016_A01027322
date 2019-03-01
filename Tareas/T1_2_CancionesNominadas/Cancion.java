public class Cancion {

    private String nombre;
    private String autor;

    public Cancion(){}

    public Cancion(String nombre, String autor){

        this.nombre = nombre;
        this.autor = autor;

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public void setAutor(String autor){

        this.autor = autor;

    }

    public String getNombre(){

        return nombre;

    }

    public String getAutor(){

        return autor;

    }

    public void print(){

        System.out.println("\n-----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);

    }

}
