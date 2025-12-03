// Archivo: src/com/belleza/Main.java
package com.belleza; // Asume el paquete raíz

import com.belleza.modelo.*; 
import com.belleza.servicio.BeautyCenter; 
import com.belleza.servicio.ServiceFactory;
import com.belleza.excepciones.ServicioInvalidoException;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BELLEZA TOTAL - PROYECTO FINAL (Patrones) ===\n");
        
        // --- 1. PATRÓN SINGLETON ---
        // Se llama a getInstance() en lugar de 'new'
        BeautyCenter gestor1 = BeautyCenter.getInstance("Sede Principal");
        BeautyCenter gestor2 = BeautyCenter.getInstance("Sede Principal"); 
        
        // Comprobación de Singleton
        System.out.println("Gestor 1 y Gestor 2 son el mismo objeto: " + (gestor1 == gestor2));
        
        // --- 2. PATRÓN FACTORY METHOD Y DEMOSTRACIÓN ---
        try {
            // Creamos servicios usando el Factory
            Service nuevoFacial = ServiceFactory.createService("FACIAL", "F003", "Microdermoabrasión", 150000.0, 75);
            Service nuevoBase = ServiceFactory.createService("BASE", "CONS-01", "Consulta Inicial", 30000.0, 30);
            
            Client clientePrincipal = new Client(501, "Ana García", "3101234567", "ana@mail.com");
            Esthetician sofia = new Esthetician(101, "Sofia Rodriguez", "Dermatología", 0.10); 
            
            // Crear cita con objeto creado por Factory
            Appointment citaFacial = new Appointment(clientePrincipal, sofia, nuevoFacial, "2026-01-15", "10:00");
            
            // Agregamos al gestor Singleton
            gestor1.addAppointment(citaFacial);
            
            System.out.println("\n--- Resumen de Agenda (Usando Singleton) ---");
            gestor2.listAppointmentsSummary(); // Accede a los datos a través de la misma instancia
            
        } catch (ServicioInvalidoException e) {
            System.err.println("❌ Error de Validación en Factory: " + e.getMessage());
        }
        
        // Guardamos los datos antes de salir (S08)
        gestor1.saveData(); 
        
        System.out.println("\n✅ Proyecto Finalizado: Patrones implementados.");
    }
}