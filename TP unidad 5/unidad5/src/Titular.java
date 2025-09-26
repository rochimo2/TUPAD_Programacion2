public class Titular {
    private String dni;
    private String nombre;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni, Pasaporte pasaporte) {
        this.nombre = nombre;
        this.dni = dni;
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pasaporte=" + pasaporte.getNumero() +
                '}';
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
}
