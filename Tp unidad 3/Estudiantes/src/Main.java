//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Rocio Moyano";
        estudiante.edad = 38;
        estudiante.curso = "Java";
        estudiante.calificacion = 5;
        estudiante.mostrarInfo();

        System.out.println("Subir calificación a: " + estudiante.subirCalificacion(5));
        estudiante.mostrarInfo();

        System.out.println("Bajar calificación a: " + estudiante.bajarCalificacion(3));
        estudiante.mostrarInfo();

        // Mascota
        Mascota mascota = new Mascota();
        mascota.nombre = "Firulais";
        mascota.especie = "Perro";
        mascota.edad = 3;
        mascota.mostrarInfo();

        mascota.cumplirAnios();
        System.out.println("Después de cumplir años:");
        mascota.mostrarInfo();

        // Libro
        Libro libro = new Libro();
        libro.setAnioPublicacion(-2);
        libro.getAnioPublicacion();
        libro.setAnioPublicacion(2025);
        libro.getAnioPublicacion();

        // Gallinas

        Gallina cocoroco = new Gallina();
        cocoroco.idGallina = 1;
        Gallina tita = new Gallina();
        tita.idGallina = 2;

        cocoroco.ponerHuevo();
        cocoroco.envejecer();
        cocoroco.ponerHuevo();
        cocoroco.envejecer();
        cocoroco.envejecer();

        tita.ponerHuevo();
        tita.ponerHuevo();
        tita.ponerHuevo();
        tita.envejecer();
        tita.ponerHuevo();
        tita.envejecer();

        cocoroco.mostrarEstado();

        tita.mostrarEstado();

         //Nave espacial

        NaveEspacial nabucodonosor = new NaveEspacial();
        nabucodonosor.nombre = "Nabucodonosor";
        nabucodonosor.combustible = 50;

        nabucodonosor.avanzar(500);

        nabucodonosor.recargarCombustible(500);

        nabucodonosor.avanzar(500);

        }

    }
