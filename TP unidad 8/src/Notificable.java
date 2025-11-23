public interface Notificable {

    void notificarAplicarDescuento(double montoOriginal, double montoConDescuento);

    void notificarProcesarPago(double montoPagado);

    void notificarAddProducto(Producto producto);
}
