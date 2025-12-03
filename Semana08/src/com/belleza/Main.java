package com.belleza;

import com.belleza.modelo.*; 
import com.belleza.servicio.BeautyCenter; 
import com.belleza.servicio.ServiceFactory;
import com.belleza.excepciones.ServicioInvalidoException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BELLEZA TOTAL - SEMANA 08 (Persistencia) ===\n");
        
        // 1. Inicialización (Patrón Singleton)
        BeautyCenter gestor = BeautyCenter.getInstance("Sede Principal"); 
        
        // 2. Crear objetos y citas (Trabajo del día)
        try {
            Client cliente1 = new Client(501, "Andrea Gomez", "3001234567", "");
            Esthetician sofia = new Esthetician(101, "Sofia Rodriguez", "Facial", 0.10);
            
            // Usamos el Factory Method
            Service nuevoFacial = ServiceFactory.createService("FACIAL", "F003", "Microdermoabrasión", 150000.0, 75);
            
            Appointment cita = new Appointment(cliente1, sofia, nuevoFacial, "2026-01-15", "10:00");
            
            System.out.println("--- 2. Agregando Nuevos Datos ---");
            gestor.addAppointment(cita);
            gestor.listAppointmentsSummary();
            
        } catch (ServicioInvalidoException e) {
            System.err.println("❌ ERROR: La creación del servicio falló la validación: " + e.getMessage());
        }
        
        // 3. Guardar Datos (Crucial S08)
        System.out.println("\n--- 3. Persistiendo Datos ---");
        gestor.saveData(); 
        
        System.out.println("\n✅ Semana 08 completada. Datos guardados en archivo.");
    }
}