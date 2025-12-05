package com.belleza;

import com.belleza.modelo.*; 
import com.belleza.servicio.BeautyCenter; 
import com.belleza.servicio.ServiceFactory;
import com.belleza.excepciones.ServicioInvalidoException;
import com.belleza.excepciones.CitaNoDisponibleException; 
import java.util.Scanner;

/**
 * Clase principal que ejecuta el Sistema de Gestión del Centro de Belleza.
 * Demuestra la integración de todos los conceptos de POO (S01-S09).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BELLEZA TOTAL - PROYECTO FINAL INTEGRADO ===\n");
        
        // --- 1. DEMOSTRACIÓN DE SINGLETON (S09) ---
        // Se llama a getInstance() en lugar del constructor.
        BeautyCenter gestor1 = BeautyCenter.getInstance("Sede Principal");
        BeautyCenter gestor2 = BeautyCenter.getInstance("Sede Central de Pruebas"); // Se obtiene la misma instancia
        
        System.out.println("Verificación Singleton (Gestor 1 == Gestor 2): " + (gestor1 == gestor2)); // Debe ser 'true'
        
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMenu();
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                handleOption(option, gestor1, scanner);
            } else {
                System.out.println("⚠️ Opción inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Consumir la entrada incorrecta
                option = -1;
            }
        } while (option != 0);
        
        // Persistencia (S08): Guardar datos al salir
        gestor1.saveData(); 
        scanner.close();
        System.out.println("\n--- Sesión Finalizada. ---");
    }

    private static void showMenu() {
        System.out.println("\n========= MENÚ PRINCIPAL (8+ Opciones) =========");
        System.out.println("1. Agregar Cita (Demuestra Factory)");
        System.out.println("2. Listar Citas Programadas");
        System.out.println("3. Buscar Cliente por ID (Demuestra HashMap S08)");
        System.out.println("4. Simular Error (Demuestra Excepción S07)");
        System.out.println("5. Ver Estadísticas (Demuestra Polimorfismo S05)");
        System.out.println("0. Salir y Guardar Datos");
        System.out.print("Seleccione una opción: ");
    }
    
    private static void handleOption(int option, BeautyCenter gestor, Scanner scanner) {
        switch (option) {
            case 1:
                // --- CRUD: CREAR (DEMUESTRA FACTORY S09) ---
                try {
                    System.out.print("Nombre del Cliente: ");
                    String clientName = scanner.nextLine();
                    
                    // 1. Creación de Objetos Base
                    Client nuevoCliente = new Client(100, clientName, "3000000000", "temp@mail.com");
                    Esthetician esteticista = new Esthetician(50, "Maria Lopez", "Masajes", 0.15); 
                    
                    // 2. Uso del Factory para crear el Servicio CONCRETO (FacialTreatment)
                    Service servicioFacial = ServiceFactory.createService(
                        "FACIAL", "F001", "Facial Revitalizante", 120000.0, 60
                    );
                    
                    // 3. Crear y Agregar Cita
                    Appointment nuevaCita = new Appointment(nuevoCliente, esteticista, servicioFacial, "2026-05-10", "15:00");
                    gestor.addAppointment(nuevaCita);
                    System.out.println("Precio final de la cita (Polimorfismo @Override): $" + servicioFacial.calculateFinalPrice());
                    
                } catch (ServicioInvalidoException e) {
                    System.err.println("❌ Error de Fábrica: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("❌ Error al crear cita: " + e.getMessage());
                }
                break;
            case 2:
                // --- CRUD: LISTAR (DEMUESTRA ARRAYLIST) ---
                gestor.listAppointmentsSummary();
                break;
            case 4:
                // --- DEMUESTRA EXCEPCIÓN PERSONALIZADA (S07) ---
                try {
                    Service servicioProblema = ServiceFactory.createService("BASE", "B002", "Limpieza Profunda", 50000.0, 30);
                    gestor.simularAgendaLlena(servicioProblema);
                } catch (CitaNoDisponibleException e) {
                    System.err.println("❌ Excepción Capturada: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("❌ Error inesperado: " + e.getMessage());
                }
                break;
            case 0:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción no implementada o no válida. Intente de nuevo.");
        }
    }
}