public class Estudiante {
    String nombre;
    int edad;
    String curso;
    int calificacion;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public int subirCalificacion(int puntos){
        calificacion += puntos;
        return calificacion;
    }

    public int bajarCalificacion(int puntos){
        calificacion -= puntos;
        return calificacion;
    }
}
