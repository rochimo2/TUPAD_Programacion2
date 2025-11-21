public class Perro extends Animal{
    String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String hacerSonido() {
        return "Guau Guau";
    }

    @Override
    public String describirAnimal() {
        return "Soy un perro, mi nombre es " + nombre;
    }
}
