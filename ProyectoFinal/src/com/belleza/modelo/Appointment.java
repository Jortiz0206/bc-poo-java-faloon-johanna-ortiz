package com.belleza.modelo;
public public class Appointment {
    private Client client;          
    private Esthetician esthetician; 
    private Service service;        
    
    private String appointmentDate;
    private String appointmentTime;

    public Appointment(Client client, Esthetician esthetician, Service service, String date, String time) {
        this.client = client;
        this.esthetician = esthetician;
        this.service = service;
        this.appointmentDate = date;
        this.appointmentTime = time;
    }
    

    public int calculateAppointmentDuration() {
        return this.service.getDurationMinutes() + 15; // 15 minutos extra de limpieza/transición
    }
    
 
    public Client getClient() { return client; }
    public Esthetician getEsthetician() { return esthetician; }
    public Service getService() { return service; } 
} {
    
}

public String getCodigoCita() {
        return this.appointmentDate + "-" + this.appointmentTime; 
}

