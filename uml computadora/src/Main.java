//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Rocío Fernández", "33445566");
        Computadora computadora = new Computadora("Dell", "SN654321", "MSI Pro", "Z490");
        propietario.setComputadora(computadora);
        System.out.print("Propietario: " + computadora.getPropietario().getNombre());
        System.out.print(". Placa Madre: " + computadora.getPlacaMadre().getModelo());
    }
}