public class Gato extends Animal{
    String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String hacerSonido() {
        return "Miau Miau";
    }

    @Override
    public String describirAnimal() {
        return "Soy un gato, mi nombre es " + nombre;
    }
}
