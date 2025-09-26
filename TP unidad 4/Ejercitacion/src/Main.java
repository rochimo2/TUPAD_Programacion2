//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, "Juan Perez", "Desarrollador", 50000);
        Empleado emp2 = new Empleado("Marcos Gomez", "Diseñador");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("-----------------------");

        emp1.actualizarSalario(5000);
        emp2.actualizarSalario(2.5);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("-----------------------");

        Empleado.mostrarTotalEmpleados();
    }
}