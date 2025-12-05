package com.belleza.modelo;
public public class Appointment {
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
    
    // Método de negocio: Calcula la duración total de la cita
    public int calculateAppointmentDuration() {
        return this.service.getDurationMinutes() + 15; // 15 minutos extra de limpieza/transición
    }
    
    // Getters esenciales para la clase gestora
    public Client getClient() { return client; }
    public Esthetician getEsthetician() { return esthetician; }
    public Service getService() { return service; } 
} {
    
}
