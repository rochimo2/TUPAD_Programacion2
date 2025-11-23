//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rocio Moyano", "32333333");
        Banco banco = new Banco("Banco Español", "32-99999999-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("123456", "01/30", banco);
        cliente.setTarjeta(tarjeta);
        System.out.print("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.print(". Banco: " + tarjeta.getBanco().getNombre());
    }
}