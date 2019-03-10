public class librosNovelaRomantica extends Libro {

    public librosNovelaRomantica(String autor, String titulo, int año, int edicion){

        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        this.edicion = edicion;
        this.precio = 300;

    }

    public void printDetails() {

        System.out.println("----------------------");
        System.out.println("Categoría: Novela Romántica");
        System.out.println("Título: " +  titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Edición: " + edicion);
        System.out.println("Precio: $" + precio);

    }
}
