package com.belleza.servicio;

import com.belleza.modelo.Appointment; 
import com.belleza.modelo.Service;     
import com.belleza.excepciones.CitaNoDisponibleException; 
import java.util.ArrayList;

public class BeautyCenter {
    
    // NOTA: Para S08, volvemos al constructor PUBLIC para simplicidad.
    
    private String centerName;
    private ArrayList<Appointment> appointments; 

    // Constructor que inicializa el ArrayList (CRUCIAL)
    public BeautyCenter(String name) {
        this.centerName = name;
        this.appointments = new ArrayList<>(); // 🛑 INICIALIZACIÓN DE ARRAYLIST
        this.loadData(); // Llama a cargar datos al inicio (S08)
    }
    
    // ====================================================
    // MÉTODOS DE PERSISTENCIA (S08)
    // ====================================================
    
    public void loadData() {
        // En un proyecto real, llama a DataPersistence.loadAppointments()
        System.out.println("Datos cargados al inicio (Simulación de I/O).");
    }
    
    public void saveData() {
        // En un proyecto real, llama a DataPersistence.saveAppointments()
        System.out.println("Datos guardados al finalizar (Simulación de I/O).");
    }
    
    // ====================================================
    // MÉTODOS DE GESTIÓN DE CITAS (S02/S07)
    // ====================================================

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
        System.out.println("-> Cita agregada para " + appointment.getClient().getName());
    }
    
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
    
    // Método de Excepción (S07)
    public void simularAgendaLlena(Service servicio) throws CitaNoDisponibleException {
        if (servicio.getName().contains("Limpieza")) { 
            throw new CitaNoDisponibleException("El cupo está completo.");
        }
    }
}