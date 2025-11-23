public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de: " + impuesto.getContribuyente().getNombre() + ". Usted tiene que pagar: $" + impuesto.getMonto());

    }
}
