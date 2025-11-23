//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Titular titular = new Titular("Rocio Moyano", "32112233");
        ClaveSeguridad clave = new ClaveSeguridad("clave456", "2024-12-15");
        CuentaBancaria cuenta = new CuentaBancaria("3330001122334455", 250000.0, "clave456", "2024-12-15");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());
    }
}