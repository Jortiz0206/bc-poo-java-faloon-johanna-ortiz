// Archivo: src/com/belleza/servicio/BeautyCenter.java
package com.belleza.servicio;

import com.belleza.modelo.Service; // IMPORTA Service desde el paquete modelo
import com.belleza.excepciones.CitaNoDisponibleException; // IMPORTA la excepción personalizada
import com.belleza.modelo.Appointment; // IMPORTA Appointment desde el paquete modelo
import java.util.ArrayList;

public class BeautyCenter {
    private String centerName;
    private ArrayList<Appointment> appointments; // Declaración de la colección
    
    public BeautyCenter(String centerName) {
        this.centerName = centerName;
        this.appointments = new ArrayList<>(); // Inicializa el ArrayList
    }
    
    // Método para agregar la relación (Appointment) a la colección
    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }
    
    // Método para mostrar el contenido de la colección
    public void listAppointmentsSummary() {
        System.out.println("\n===== Citas programadas en " + this.centerName + " =====");
        if (appointments.isEmpty()) {
            System.out.println("No hay citas programadas.");
            return;
        }
        for (Appointment appointment : appointments) {
            System.out.printf("Cita para %s con %s (Servicio: %s)%n", 
                              appointment.getClient().getName(), 
                              appointment.getEsthetician().getName(),
                              appointment.getService().getName());
        }
    }
    
    // Método de negocio (contar citas)
    public int countTotalAppointments() {
        return this.appointments.size();
    }
}


