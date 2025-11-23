
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Rocio Moyano", "Argentina");
        Editorial editorial = new Editorial("Sudamericana", "Sudameria 1322");
        Libro libro = new Libro("Como ser yo", "555-5-55-555555-0", editorial);
        libro.setAutor(autor);

        System.out.print("Libro: " + libro.getTitulo());
        System.out.print(". Autor: " + libro.getAutor().getNombre());
        System.out.print(". Editorial: " + libro.getEditorial().getNombre());
    }
}