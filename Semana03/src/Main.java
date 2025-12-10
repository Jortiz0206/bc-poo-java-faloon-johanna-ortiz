// Archivo: src/Semana03/Main.java

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA SEMANA 03: HERENCIA Y POLIMORFISMO =====");
        
        // 1. Crear objetos usando la nueva estructura de Herencia
        
        // Esthetician (Hereda de Person)
        Esthetician sofia = new Esthetician(101, "Sofia Rodriguez", "Facial");
        
        // LoyaltyClient (Hereda de Client, que hereda de Person)
        LoyaltyClient clienteLeal = new LoyaltyClient(505, "Marta Leal", "3205558899", 750);
        
        // Client normal (Hereda de Person)
        Client clienteNormal = new Client(501, "Andrea Gomez", "3001234567"); 
        
        Service servicioFacial = new Service("SER-001", "Limpieza Facial", 80000.0, 60); 
        
        // 2. Demostración de Herencia y Polimorfismo
        System.out.println("\n--- Demostración de Herencia ---");
        
        // a. Uso del método heredado getInfo()
        System.out.println("Esteticista: " + sofia.getInfo());
        System.out.println("Cliente Normal: " + clienteNormal.getInfo());
        System.out.println("Cliente Leal: " + clienteLeal.getInfo());
        
        // b. Uso del método especializado
        clienteLeal.applyLoyaltyDiscount();
        
        // c. Demostración de Polimorfismo (Appointment acepta el objeto LoyaltyClient como si fuera un Client)
        Appointment citaLeal = new Appointment(
            clienteLeal, // Tipo LoyaltyClient asignado a Client en Appointment.java
            sofia, 
            servicioFacial, 
            "2026-01-10", 
            "16:00"
        );
        
        // 3. Uso del gestor (BeautyCenter - Semana 02)
        BeautyCenter centro = new BeautyCenter("Belleza Total - Cedritos"); 
        centro.addAppointment(citaLeal); 
        
        System.out.println("\n--- Resumen de Citas (con objeto polimórfico) ---");
        centro.listAppointmentsSummary();
        System.out.println("===================================================");
    }
}
