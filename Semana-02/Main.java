public class Main {
    public static void main(String[] args) {
        
        System.out.println("===== PRUEBA SISTEMA BELLEZA TOTAL - SEMANA 02 =====");
        
        // 1. Crear objetos (incluyendo BeautyService de S1)
        
        // Esteticista (ID, Nombre, Especialización, TasaComisión 10%)
        Esthetician sofia = new Esthetician(101, "Sofia Rodriguez", "Facial", 0.10);
        Esthetician laura = new Esthetician(102, "Laura Mesa", "Manicure", 0.08);

        // Cliente 1 (con email)
        Client clienteAndrea = new Client(501, "Andrea Gomez", "3001234567", "andrea@mail.com");
        // Cliente 2 (sin email - simula validación)
        Client clienteMarta = new Client(502, "Marta Pérez", "3109876543", ""); 
        
        // Servicios (Asumiendo que BeautyService de S1 está disponible)
        BeautyService facial = new BeautyService("S-001", "Limpieza Facial Profunda", 80000.0);
        BeautyService manicure = new BeautyService("S-002", "Manicure Spa", 45000.0);
        
        // 2. Crear relaciones (Appointment)
        Appointment cita1 = new Appointment(
            clienteAndrea, sofia, facial, "2025-11-20", "15:00");
        
        Appointment cita2 = new Appointment(
            clienteMarta, laura, manicure, "2025-11-20", "17:00");
        
        // 3. Usar ArrayList (Clase Gestora)
        BeautyCenter centro = new BeautyCenter("Belleza Total - Cedritos");
        
        // 4. Agregar relaciones a la colección
        centro.addAppointment(cita1);
        centro.addAppointment(cita2);
        
        // 5. Mostrar resultados y demostrar funcionalidad
        centro.listAppointmentsSummary();
        
        // Demostrar método de negocio de Esthetician
        double comision = sofia.calculateCommission(cita1.getService().getPrice());
        System.out.printf("\nComisión estimada para %s por cita 1: $%.2f%n", sofia.getName(), comision);
        
        System.out.println("===== FIN PRUEBA SEMANA 02 =====");
    }
}