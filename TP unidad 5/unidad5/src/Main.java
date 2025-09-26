//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ejercicio 1
        Foto foto = new Foto();

        Pasaporte pasaporte = new Pasaporte("123456", "2024-06-01", foto, null);

        Titular titular = new Titular("Juan Pérez","32766753", pasaporte);

        pasaporte.setTitular(titular);

        System.out.println("Titular: " + titular);
        System.out.println("Pasaporte número: " + pasaporte.getNumero());

    }
}