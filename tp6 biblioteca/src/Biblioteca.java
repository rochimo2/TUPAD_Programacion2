import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();


    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Libro> listarLibros() {
        return libros;
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn() != null && libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libaborrar = buscarLibroPorIsbn(isbn);
        if (libaborrar != null) {
            libros.remove(libaborrar);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }

    public ArrayList<String> mostrarAutoresDisponibles() {
        ArrayList<String> autores = new ArrayList<>();
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (autor != null && !autores.contains(autor.getNombre())) {
                autores.add(autor.getNombre());
            }
        }
         return autores;

    }
}
