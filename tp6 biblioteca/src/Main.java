public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombia");
        Autor autor2 = new Autor("A2", "Isabel Allende", "Chile");
        Autor autor3 = new Autor("A3", "Jorge Luis Borges", "Argentina");


        Libro libro1 = new Libro("978-8437604947", "Cien años de soledad", autor1, 1967);
        Libro libro2 = new Libro("978-8437604954", "El amor en los tiempos del cólera", autor1, 1985);
        Libro libro3 = new Libro("978-8408240242", "La casa de los espíritus", autor2, 1982);
        Libro libro4 = new Libro("978-9500400016", "Ficciones", autor3, 1944);
        Libro libro5 = new Libro("978-9500395730", "El Aleph", autor3, 1949);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);


        System.out.println("Listado de libros en la biblioteca");
        for (Libro l : biblioteca.listarLibros()) {
            System.out.println(l);
            System.out.println("    Autor completo: " + (l.getAutor() != null ? l.getAutor() : "N/A"));
        }



        String isbnBuscar = "978-8408240242";
        System.out.println("Buscar libro por ISBN: " + isbnBuscar);
        Libro encontrado = biblioteca.buscarLibroPorIsbn(isbnBuscar);
        if (encontrado != null) {
            System.out.println("Libro encontrado: " + encontrado);
            System.out.println("Autor: " + encontrado.getAutor());
        } else {
            System.out.println("No se encontró ningún libro con ISBN " + isbnBuscar);
        }


        int anioFiltro = 1944;
        System.out.println("Libros publicados en el año " + anioFiltro);
        for (Libro l : biblioteca.filtrarLibrosPorAnio(anioFiltro)) {
            System.out.println(l);
        }

        String isbnEliminar = "978-8437604954";
        System.out.println("Eliminando libro con ISBN " + isbnEliminar );
        biblioteca.eliminarLibro(isbnEliminar);
        System.out.println("Libros restantes:");
        for (Libro l : biblioteca.listarLibros()) {
            System.out.println(l);
        }

        System.out.println("Total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());


        System.out.println("Autores disponibles en la biblioteca");
        for (String autorNombre : biblioteca.mostrarAutoresDisponibles()) {
            System.out.println(autorNombre);
        }
    }
}
