public abstract class Empleado {
    private String tipoEmpleado;

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public Empleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public abstract double CalcularSueldo();
}
