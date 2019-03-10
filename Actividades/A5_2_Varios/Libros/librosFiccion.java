public class librosFiccion extends Libro {

    public librosFiccion(String autor, String titulo, int año, int edicion){

        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        this.edicion = edicion;
        this.precio = 500;

    }

    public void printDetails() {

        System.out.println("----------------------");
        System.out.println("Categoría: Ficción");
        System.out.println("Título: " +  titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Edición: " + edicion);
        System.out.println("Precio: $" + precio);

    }
}
