public class Auto extends Vehiculo{
    Integer cantidadPuertas;

    public Auto(String marca, String modelo, Integer cantidadPuertas ) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}
