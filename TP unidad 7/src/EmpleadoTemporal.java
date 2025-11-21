public class EmpleadoTemporal extends  Empleado{
    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String tipoEmpleado, double valorHora, int horasTrabajadas) {
        super(tipoEmpleado);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double CalcularSueldo() {
        return valorHora * horasTrabajadas;
    }
}
