public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void getAnioPublicacion() {
        System.out.println("Año de publicación: " + anioPublicacion);
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año de publicación establecido a: " + anioPublicacion);
        }
    }
}
