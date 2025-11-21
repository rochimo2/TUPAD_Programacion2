public class Vaca extends Animal{
    private String nombre;

    public Vaca(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String hacerSonido() {
        return "Muu Muu";   }

    @Override
    public String describirAnimal() {
        return "Soy una vaca, mi nombre es " + nombre;
    }
}
