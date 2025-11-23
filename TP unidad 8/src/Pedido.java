import java.util.ArrayList;

public class Pedido implements Pagable, PagoConDescuento{
    private ArrayList<Producto> productos;
    private MetodoPago metodoPago;
    private Notificable cliente;

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        total = aplicarDescuento(total);
        return total;
    }

    public Pedido(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
        this.productos = new ArrayList<>();
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
        if (cliente != null) {
            cliente.notificarAddProducto(producto);
        }
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setCliente(Notificable cliente) {
        this.cliente = cliente;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double porcentaje = this.metodoPago.getDescuento();
        double conDescuento = monto * (1 - porcentaje);

        if (cliente != null) {
            cliente.notificarAplicarDescuento(monto, conDescuento);
        }
        return conDescuento;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de: $" + monto + " mediante " + metodoPago);
        double totaldelpedido= calcularTotal();
        System.out.println("Total del pedido con descuento aplicado: $" + totaldelpedido);
        if (cliente != null) {
            cliente.notificarProcesarPago(totaldelpedido);
        }
    }
}
