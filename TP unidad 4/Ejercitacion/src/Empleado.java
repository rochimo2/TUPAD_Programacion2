public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000;
        totalEmpleados++;
        this.id = totalEmpleados;
    }

    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            salario += salario * (porcentajeAumento / 100);
        }
    }

    public void actualizarSalario(int cantidadFija) {
        if (cantidadFija > 0) {
            salario += cantidadFija;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados: " + totalEmpleados);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
