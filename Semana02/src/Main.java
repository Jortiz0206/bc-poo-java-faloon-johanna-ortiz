import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA SEMANA 02: RELACIONES Y ARRAYS =====");
        
        // 1. Crear objetos base (S01)
        Esthetician sofia = new Esthetician(101, "Sofia Rodriguez", "Facial");
        Client cliente1 = new Client(501, "Andrea Gomez", "3001234567"); 
        Service servicioFacial = new Service("SER-001", "Limpieza Facial", 80000.0, 60); 
        
        // 2. Crear objetos nuevos (Ejercicio 1)
        Product serum = new Product("P-001", "Serum Vitamina C", 120000.0, 3);
        CustomerRecord record1 = new CustomerRecord("CR-501", cliente1, "Piel Mixta", 600000.0);
        
        // 3. Crear la relación (Appointment - Ejercicio 2)
        Appointment cita1 = new Appointment(
            cliente1, 
            sofia, 
            servicioFacial, 
            "2025-11-20", 
            "15:00"
        );
        
        // 4. Usar el gestor (BeautyCenter - Ejercicio 3)
        BeautyCenter centro = new BeautyCenter("Belleza Total - Cedritos"); 
        centro.addAppointment(cita1); 
        
        // 5. Demostración de objetos adicionales
        Esthetician laura = new Esthetician(102, "Laura Mesa", "Manicure");
        Client cliente2 = new Client(502, "Marta Pérez", "3109876543");
        Service servicioManicure = new Service("SER-002", "Manicure Spa", 45000.0, 45);
        Appointment cita2 = new Appointment(cliente2, laura, servicioManicure, "2025-11-20", "17:00");
        centro.addAppointment(cita2);

        // 6. Demostración de métodos de negocio y ArrayList
        System.out.println("\n--- Demostración de Funcionalidades ---");
        System.out.printf("Producto %s: Stock %d. ¿Necesita reordenar? %s%n", serum.getName(), serum.getStockQuantity(), serum.needsReorder());
        System.out.printf("Cliente %s: Gasto total $%.2f. ¿Es elegible para lealtad? %s%n", 
            cliente1.getName(), record1.getTotalSpent(), record1.isLoyaltyEligible());
        
        // 7. Mostrar resultados del ArrayList
        centro.listAppointmentsSummary();
        System.out.println("Total de citas agendadas: " + centro.countTotalAppointments());
        
        System.out.println("===================================================");
    }
}