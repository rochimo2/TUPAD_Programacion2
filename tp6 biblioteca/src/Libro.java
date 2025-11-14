public class Libro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro() {
    }

    public String getIsbn() {
        return isbn;
    }


    public Autor getAutor() {
        return autor;
    }


    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor=" + (autor != null ? autor.getNombre() : "null") +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}
