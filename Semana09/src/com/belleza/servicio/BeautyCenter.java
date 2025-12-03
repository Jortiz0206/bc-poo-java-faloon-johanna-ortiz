// Archivo: src/com/belleza/servicio/BeautyCenter.java
package com.belleza.servicio; // Asume el paquete servicio

import com.belleza.modelo.Appointment; // Clase de modelo
import com.belleza.modelo.Service;     // Clase de modelo
import com.belleza.excepciones.CitaNoDisponibleException; // Clase de excepción
import java.util.ArrayList;

public class BeautyCenter {
    // 1. Singleton: Atributo estático y privado para la única instancia
    private static BeautyCenter instance; 
    
    private String centerName;
    private ArrayList<Appointment> appointments; 

    // 2. Singleton: Constructor PRIVADO (Evita el uso de 'new' desde fuera)
    private BeautyCenter(String name) {
        this.centerName = name;
        this.appointments = new ArrayList<>();
        // Llama a cargar datos si usaste S08
        // this.loadData(); 
    }
    
    // 3. Singleton: Método estático público para obtener la única instancia
    public static BeautyCenter getInstance(String name) {
        if (instance == null) {
            instance = new BeautyCenter(name);
            System.out.println("--- Singleton: Creando ÚNICA instancia de " + name + " ---");
        }
        return instance;
    }

    // MÉTODOS DE GESTIÓN (S02/S07/S08)
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
    
    // Métodos de Persistencia Simulada (S08)
    public void loadData() { System.out.println("Datos cargados (Simulación)."); }
    public void saveData() { System.out.println("Datos guardados (Simulación)."); }
    
    // Método de Excepción (S07)
    public void simularAgendaLlena(Service servicio) throws CitaNoDisponibleException {
        if (servicio.getName().contains("Limpieza")) { 
            throw new CitaNoDisponibleException("El cupo está completo.");
        }
    }
}