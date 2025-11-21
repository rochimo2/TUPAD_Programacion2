public class EmpleadoPlanta extends Empleado {
    private double salario;

    public EmpleadoPlanta(String tipoEmpleado, double salario) {
        super(tipoEmpleado);
        this.salario = salario;
    }

    @Override
    public double CalcularSueldo() {
        return salario;
    }
}
