public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarAplicarDescuento(double montoOriginal, double montoConDescuento) {
        System.out.println("[" + nombre + "] Se aplicó un descuento: original=$" + montoOriginal + ", con descuento=$" + montoConDescuento);
    }

    @Override
    public void notificarProcesarPago(double montoPagado) {
        System.out.println("[" + nombre + "] Pago procesado por: $" + montoPagado);
    }

    @Override
    public void notificarAddProducto(Producto producto) {
        System.out.println("[" + nombre + "] Se agregó el producto: " + producto);
    }
}
