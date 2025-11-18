public class Appointment {
    // Relaciones (Composición/Agregación)
    private Client client;          
    private Esthetician esthetician; 
    private BeautyService service;  // Clase de Semana 01
    
    private String appointmentDate;
    private String appointmentTime;

    // Constructor que acepta los objetos relacionados (Implementa Relaciones - Ej. 2)
    public Appointment(Client client, Esthetician esthetician, BeautyService service, String date, String time) {
        this.client = client;
        this.esthetician = esthetician;
        this.service = service;
        this.appointmentDate = date;
        this.appointmentTime = time;
    }

    // Método que demuestra la interacción de los objetos
    public double calculateTotalCost() {
        // Método más complejo: Costo del servicio + una pequeña tarifa administrativa.
        double COSTO_SERVICIO = service.getPrice();
        double TARIFA_ADMIN = 5000.0;
        return COSTO_SERVICIO + TARIFA_ADMIN;
    }
    
    // Getters para usar en la clase gestora
    public Client getClient() { return client; }
    public Esthetician getEsthetician() { return esthetician; }
    public BeautyService getService() { return service; }
}