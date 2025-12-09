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
        System.out.println("=== SISTEMA BELLEZA TOTAL===\n");
        
        // --- 1. DEMOSTRACIÓN DE SINGLETON (S09) ---
        BeautyCenter gestor1 = BeautyCenter.getInstance("Sede Principal");
        BeautyCenter gestor2 = BeautyCenter.getInstance("Sede Central de Pruebas");
        
        System.out.println("Verificación Singleton (Gestor 1 == Gestor 2): " + (gestor1 == gestor2)); 
        
        // --- 2. Preparación inicial de datos para la demo (Simulación) ---
        try {
            Client c1 = new Client(101, "Sofia Pérez", "3111111111", "sofia@mail.com");
            Esthetician e1 = new Esthetician(50, "Maria Lopez", "Masajes", 0.15);
            Service s1 = ServiceFactory.createService("FACIAL", "F001", "Facial Revitalizante", 120000.0, 60);
            
            // Aquí se usaría un método en BeautyCenter para cargar/agregar clientes y citas al HashMap/ArrayList
            gestor1.addClient(c1); 
            gestor1.addAppointment(new Appointment(c1, e1, s1, "2026-05-10", "15:00"));
        } catch (Exception e) {
            System.err.println("Error inicializando datos: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMenu();
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();
                handleOption(option, gestor1, scanner);
            } else {
                System.out.println("⚠️ Opción inválida. Por favor, ingrese un número.");
                scanner.nextLine();
                option = -1;
            }
        } while (option != 0);
        
        gestor1.saveData(); 
        scanner.close();
        System.out.println("\n--- Sesión Finalizada. ---");
    }

    private static void showMenu() {
        System.out.println("\n========= MENÚ PRINCIPAL (8+ Opciones) =========");
        System.out.println("1. Agregar Cita (Demuestra Factory)");
        System.out.println("2. Listar Citas Programadas");
        System.out.println("3. Buscar Cliente por ID (Demuestra HashMap O(1))"); // Implementado
        System.out.println("4. Simular Error (Demuestra Excepción S07)");
        System.out.println("5. Ver Estadísticas (Demuestra Polimorfismo S05)"); // Implementado
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
                    
                    Client nuevoCliente = new Client(100, clientName, "3000000000", "temp@mail.com");
                    Esthetician esteticista = new Esthetician(50, "Maria Lopez", "Masajes", 0.15);
                    
                    // Factory Method
                    Service servicioFacial = ServiceFactory.createService(
                        "FACIAL", "F001", "Facial Revitalizante", 120000.0, 60
                    );
                    
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
            case 3:
                // --- DEMOSTRACIÓN DE HASHMAP (S08) ---
                System.out.print("Ingrese ID del cliente a buscar: ");
                int clientId = scanner.nextInt();
                scanner.nextLine();
                
                Client c = gestor.findClientById(clientId); // Asume que este método existe en BeautyCenter
                if (c != null) {
                    System.out.println("✅ Cliente Encontrado (Búsqueda O(1)): " + c.getName());
                } else {
                    System.out.println("❌ Cliente no encontrado.");
                }
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
            case 5:
                // --- DEMOSTRACIÓN DE ESTADÍSTICAS (POLIMORFISMO S05) ---
                double totalVentas = gestor.calculateTotalRevenue(); // Asume que este método existe en BeautyCenter
                System.out.printf("💰 Total de Ingresos (Polimorfismo en calculateFinalPrice()): $%.2f%n", totalVentas);
                break;
            case 0:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción no implementada o no válida. Intente de nuevo.");
        }
    }
}
