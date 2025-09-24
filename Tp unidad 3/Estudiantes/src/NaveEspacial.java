public class NaveEspacial {
    String nombre;
    int combustible;

    public void despegar(){
        System.out.println("La nave " + nombre + " ha despegado.");
    }

    public void avanzar(int distancia){
        if (combustible <= 50) {
            System.out.println("No hay suficiente combustible para avanzar.");
            return;
        }
        System.out.println("La nave " + nombre + " ha avanzado " + distancia + " kilómetros.");
        combustible -= distancia / 20; // Supongamos que consume 1 unidad de combustible por cada 10 km
    }

    public void recargarCombustible(int cantidad) {
        if (combustible == 500) {
            System.out.println("El tanque de combustible ya está lleno.");
        }
        if (combustible + cantidad > 500) {
            combustible += cantidad;
            System.out.println("La nave " + nombre + " ha recargado " + cantidad + " unidades de combustible.");
        }
    }
}
