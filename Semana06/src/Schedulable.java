// Archivo: src/Semana06/Schedulable.java

// COMENTARIO: Esta es una INTERFAZ. Define la CAPACIDAD de un objeto de ser agendado.
// Esta separación permite que tanto los Servicios como el Personal puedan ser agendables.
public interface Schedulable {
    int getDurationMinutes();
    void logProcess(String action);
}