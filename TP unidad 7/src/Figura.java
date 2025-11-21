public abstract class Figura {
    private String nombre;

    public abstract double calcularArea();

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
