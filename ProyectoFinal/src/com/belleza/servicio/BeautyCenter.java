package com.belleza.servicio;

import com.belleza.modelo.Appointment; 
import com.belleza.modelo.Client;
import com.belleza.modelo.Service;     
import com.belleza.excepciones.CitaNoDisponibleException; 
import java.util.ArrayList;
import java.util.HashMap; 


public class BeautyCenter {
    // 1. ATRIBUTO SINGLETON: Única instancia de la clase.
    private static BeautyCenter instance; 
    
    private String centerName;
    private ArrayList<Appointment> appointments; 
    private HashMap<String, Client> clientsById; // Colección profesional (S08)

    // 2. CONSTRUCTOR PRIVADO: No permite la creación de instancias externas.
    private BeautyCenter(String name) {
        this.centerName = name;
        this.appointments = new ArrayList<>();
        this.clientsById = new HashMap<>();
        this.loadData(); // Carga datos al inicio (Persistencia S08)
    }
    
    // 3. MÉTODO PÚBLICO ESTÁTICO: Único punto de acceso a la instancia.
    public static BeautyCenter getInstance(String name) {
        if (instance == null) {
            instance = new BeautyCenter(name);
            System.out.println("--- Singleton: Creando ÚNICA instancia de " + name + " ---");
        }
        return instance;
    }
    
    // --- MÉTODOS DE SERVICIO Y PERSISTENCIA (S08) ---
    public void loadData() {
        // En un proyecto real, se cargaría desde un archivo.
        System.out.println("✅ Datos cargados: Iniciando con listas vacías.");
    }
    
    public void saveData() {
        // En un proyecto real: DataPersistence.saveAppointments(this.appointments);
        System.out.println("💾 Datos guardados (Persistencia S08).");
    }
    
    // Método CRUD (Crear)
    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
        System.out.println("-> Cita agregada para " + appointment.getClient().getName());
    }

    // Método de Excepción (S07)
    public void simularAgendaLlena(Service servicio) throws CitaNoDisponibleException {
        if (servicio.getName().contains("Limpieza")) { 
            throw new CitaNoDisponibleException("❌ Lo sentimos, la agenda para Limpieza Profunda está completa.");
        }
    }
    
    // Método de Listado (S02)
    public void listAppointmentsSummary() {
        // Implementación...
    }
  
}