//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente= new Contribuyente("Rocio Moyano","27-32765432-1");
        Impuesto impuesto= new Impuesto(75000.0,contribuyente);
        Calculadora calculadora= new Calculadora();
        calculadora.calcular(impuesto);
    }
}