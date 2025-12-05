// Archivo: src/com/belleza/Main.java (Versión S08)
package com.belleza;

import com.belleza.modelo.*; 
import com.belleza.servicio.BeautyCenter; 
import com.belleza.excepciones.ServicioInvalidoException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BELLEZA TOTAL - SEMANA 08 (Colecciones) ===\n");
        
        BeautyCenter gestor = new BeautyCenter("Sede Principal"); 
        
        // --- PREPARACIÓN DE DATOS (Usando objetos de S01-S04) ---
        try {
            Client c1 = new Client(1, "Ana Pérez", "311");
            Client c2 = new Client(2, "Luis Gómez", "322");
            Esthetician e1 = new Esthetician(10, "Sofia", "Facial", 0.1);
            
            // Asumiendo que el Service Factory o el constructor de Service de S04/S05 existen
            Service s1 = new Service("F001", "Facial Lifting", 100000.0, 90);
            Service s2 = new Service("M001", "Manicure SPA", 50000.0, 45);
            Service s3 = new Service("F002", "Limpieza Básica", 70000.0, 50);
            
            // Citas
            gestor.addAppointment(new Appointment(c1, e1, s1, "2026-03-10", "14:00")); // CITA-A
            gestor.addAppointment(new Appointment(c2, e1, s2, "2026-03-10", "15:00")); // CITA-B
            gestor.addAppointment(new Appointment(c1, e1, s3, "2026-03-11", "10:00")); // CITA-C
            
        } catch (Exception e) {
            System.err.println("❌ ERROR al inicializar: " + e.getMessage());
        }
        
        // =========================================================
        // 1. DEMOSTRACIÓN DE HASHMAP (Búsqueda O(1))
        System.out.println("\n--- 1. Búsqueda Rápida (HashMap) ---");
        
        // El código de la cita 1 se generó en Appointment como FECHA-HORA
        String codigoBuscado = "2026-03-10-14:00"; 
        Appointment resultado = gestor.buscarCitaPorCodigo(codigoBuscado);
        
        System.out.printf("Buscando código '%s': %s%n", 
            codigoBuscado, 
            resultado != null ? "ENCONTRADA (" + resultado.getClient().getName() + ")" : "NO ENCONTRADA");

        // 2. DEMOSTRACIÓN DE FILTRADO Y ESTADÍSTICAS
        System.out.println("\n--- 2. Filtrado y Estadísticas ---");
        
        // Filtrado por Servicio (Ej. Filtra todas las citas que contengan "Limpieza")
        List<Appointment> faciales = gestor.filtrarPorNombreServicio("Limpieza");
        System.out.printf("Citas con Limpieza: %d (Ej. %s)%n", 
            faciales.size(), 
            faciales.isEmpty() ? "Ninguna" : faciales.get(0).getClient().getName());

        // Estadística de Total de Ventas
        double total = gestor.calcularTotalVentas();
        System.out.printf("Total de Ingresos Potenciales: $%.2f%n", total);
        
        System.out.println("\n✅ Semana 08 completada: Colecciones funcionando.");
    }
}