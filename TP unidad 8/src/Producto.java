public class Producto implements Pagable{
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public double calcularTotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return String.format("%s (precio=%.2f, cantidad=%d)", nombre, precio, cantidad);
    }

}
