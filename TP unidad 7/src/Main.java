import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Auto miAuto = new Auto("Toyota", "Corolla", 5);
        miAuto.mostrarInfo();

        // Ejercicio 2
        ArrayList <Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo("Circulo1", 3));
        figuras.add(new Rectangulo("Rectangulo1", 4, 5));
        figuras.add(new Circulo("Circulo2", 2.5));
        figuras.add(new Rectangulo("Rectangulo2", 6, 7));

        for (Figura figura : figuras) {
            System.out.println("Área de " + figura.getNombre() + ": " + figura.calcularArea());
        }

        // Ejercicio 3
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Planta",3000));
        empleados.add(new EmpleadoTemporal("Temporal",20, 100));
        empleados.add(new EmpleadoPlanta("Planta",3500));

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                EmpleadoPlanta p = (EmpleadoPlanta) e;
            } else if (e instanceof EmpleadoTemporal) {
                EmpleadoTemporal t = (EmpleadoTemporal) e;
            } else {
                System.out.println("Tipo de empleado desconocido");
            }

            double sueldo = e.CalcularSueldo();
            System.out.println("Sueldo de empleado" + e.getTipoEmpleado() +" : " + sueldo);

        }
        // Ejercicio 4
        ArrayList <Animal> animales = new ArrayList<>();
        animales.add(new Perro("Morgan"));
        animales.add(new Gato("Kirara"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            System.out.print(a.describirAnimal());
            System.out.print(" y hago ");
            System.out.println(a.hacerSonido());
        }

    }
}