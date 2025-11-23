public enum MetodoPago {
    EFECTIVO(0.15), TARJETA(0.0), TRANSFERENCIA(0.10), PAYPAL(0.05);

    private final double descuento;

    MetodoPago(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}

