//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Trabajo final integrador", 15);
        EditorVideo editor = new EditorVideo();
        editor.exportar("youtube", proyecto);

    }
}