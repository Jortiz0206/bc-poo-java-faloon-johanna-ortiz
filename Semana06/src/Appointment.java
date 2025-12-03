public class Appointment {
    private Client client;          
    private Esthetician esthetician; 
    private Service service;        
    
    private String appointmentDate;
    private String appointmentTime;

    // Constructor que recibe los objetos de las clases de S01
    public Appointment(Client client, Esthetician esthetician, Service service, String date, String time) {
        this.client = client;
        this.esthetician = esthetician;
        this.service = service;
        this.appointmentDate = date;
        this.appointmentTime = time;
    }
    
    // Método de negocio (Usa un getter del objeto Service)
    public int calculateAppointmentDuration() {
        // Incluye el tiempo del servicio más 15 minutos para la limpieza/transición
        return this.service.getDurationMinutes() + 15; 
    }
    
    // Getters esenciales
    public Client getClient() { return client; }
    public Esthetician getEsthetician() { return esthetician; }
    public Service getService() { return service; } 
}
