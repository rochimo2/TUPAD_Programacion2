//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Rocio Moyano", "LIC12345");
        Motor motor = new Motor("Diesel", "MTR98765");
        Vehiculo vehiculo = new Vehiculo("AE 123 EA", "Fiat 600", motor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Licencia: " + vehiculo.getConductor().getLicencia());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}