// Archivo: src/com/belleza/Main.java
package com.belleza; // <--- DECLARACIÓN OBLIGATORIA DEL PAQUETE (Paquete raíz del dominio)

import com.belleza.modelo.Service; // Importa la clase de modelo
import com.belleza.modelo.Client; // Importa la clase de modelo
import com.belleza.servicio.BeautyCenter; // Importa la clase Gestora
import com.belleza.excepciones.ServicioInvalidoException; // Importa las excepciones
import com.belleza.excepciones.CitaNoDisponibleException; 
import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BELLEZA TOTAL - SEMANA 07 ===\n");
        
        BeautyCenter gestor = new BeautyCenter("Belleza Total");

        // --- Caso 1: Operación exitosa ✅ ---
        System.out.println("--- Caso 1: Servicio Válido (Éxito) ---");
        try {
            // Service se crea exitosamente (precio > 0, duración > 15)
            Service facial = new Service("F001", "Facial Revitalizante", 120000.0, 90);
            System.out.println("✅ Servicio agregado: " + facial.getName());
        } catch (ServicioInvalidoException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }

        // --- Caso 2: Precio Inválido (Validación con Excepción Estándar) ❌ ---
        System.out.println("\n--- Caso 2: Precio Inválido (Falla de Validación) ---");
        try {
            // Lanza ServicioInvalidoException porque el precio es 0
            Service manicure = new Service("M001", "Manicure", 0.0, 30);
            System.out.println("No debería ejecutarse si hay error.");
        } catch (ServicioInvalidoException e) {
            System.err.println("❌ ERROR (Validación de Negocio): " + e.getMessage());
        }

        // --- Caso 3: Excepción Personalizada (Cita No Disponible) ❌ ---
        System.out.println("\n--- Caso 3: Cita No Disponible (Agenda Llena) ---");
        try {
            Service servicioParaSimular = new Service("S002", "Limpieza", 100000.0, 60);
            // Llama al método de servicio que lanzará la excepción (simulando agenda llena)
            gestor.simularAgendaLlena(servicioParaSimular); 
        } catch (CitaNoDisponibleException e) {
            System.err.println("❌ ERROR (Personalizada - Agenda): " + e.getMessage());
        } catch (ServicioInvalidoException e) {
             System.err.println("❌ Error: El servicio de prueba falló la validación.");
        }
        
        // --- Caso 4: Recuperación después de error ✅ ---
        System.out.println("\n--- Caso 4: Recuperación (Creando un Cliente Válido) ---");
        try {
            Client cliente = new Client(1, "Laura", "310", "laura@mail.com");
            System.out.println("✅ Cliente creado exitosamente después del fallo.");
        } catch (Exception e) {
            System.err.println("❌ Error inesperado.");
        }
        
        // --- Caso 5: Demostración de finally (Recursos) ✅ ---
        System.out.println("\n--- Caso 5: Uso de finally ---");
        BufferedReader reader = null;
        try {
             // Simulación de una operación de archivo
             reader = new BufferedReader(new FileReader("archivo_config.txt"));
             // Si el archivo no existe, salta al catch y luego al finally
             System.out.println("Línea leída: " + reader.readLine());
        } catch (IOException e) {
            System.err.println("⚠️ ERROR IO: Archivo no encontrado. Se procede al cierre.");
        } finally {
            // El bloque 'finally' se ejecuta SIEMPRE (hayan errores o no)
            if (reader != null) {
                try {
                    reader.close(); // Se cierra el recurso
                } catch (IOException e) {
                    // ...
                }
            }
            System.out.println("✅ Bloque 'finally' ejecutado (Recursos cerrados).");
        }
        
        System.out.println("\n✅ Semana 07: Paquetes y Excepciones Demostrados.");
    }
}