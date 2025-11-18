import java.util.ArrayList;

public class BeautyCenter {
    private String centerName;
    // Uso de ArrayList para gestionar colecciones de citas (Ejercicio 3)
    private ArrayList<Appointment> appointments; 
    
    public BeautyCenter(String centerName) {
        this.centerName = centerName;
        this.appointments = new ArrayList<>();
    }
    
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("-> Cita agregada para " + appointment.getClient().getName());
    }
    
    // Método que interactúa con la colección
    public void listAppointmentsSummary() {
        System.out.println("\n--- Citas del Centro " + this.centerName + " ---");
        for (Appointment cita : appointments) {
            double total = cita.calculateTotalCost();
            System.out.printf("Cita de %s con %s. Total a pagar: $%.2f%n", 
                               cita.getClient().getName(), 
                               cita.getEsthetician().getName(), total);
            
            if (cita.getClient().needsAppointmentReminder()) {
                System.out.println("   (Requiere recordatorio telefónico urgente)");
            }
        }
    }
}