//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Usuario usuario = new Usuario("Rocio Moyano", "rochi@examplemail.com");
        Documento doc = new Documento("Boleto de compra", "Rocio Moyano ha adquirido en sus sueños una casa", "asfd4564", "2245-01-01", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario que firma: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash de firma: " + doc.getFirma().getCodigoHash());

    }
}