public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rocío");
        Pedido pedido = new Pedido(MetodoPago.EFECTIVO);
        pedido.setCliente(cliente);

        pedido.addProducto(new Producto("Libro", 100.0, 2));
        pedido.addProducto(new Producto("Lapiz", 10.0, 3));
        pedido.procesarPago(0.0);
    }
}

