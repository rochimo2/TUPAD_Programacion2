//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Paciente paciente = new Paciente("Rocio Moyano", "Omint");
        Profesional profesional = new Profesional("Dra. Maria Lopez", "Pediatría");
        CitaMedica cita = new CitaMedica("202-12-12", "15:00");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Cita programada para el " + cita.getFecha() + " a las " + cita.getHora());
    }
}