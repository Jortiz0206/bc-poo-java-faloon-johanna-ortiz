public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA SEMANA 03: ENCAPSULACIÓN Y SOBRECARGA =====");

        // 1. Demostración de Sobrecarga de Constructores en Cliente
        System.out.println("\n--- Prueba de Constructores de Cliente ---");
        
        // Constructor Completo
        Client cliente1 = new Client(1, "Andrea Ramírez", "3001112233", "andrea@mail.com");
        System.out.println("C1 (Completo): " + cliente1.getName() + " | " + cliente1.getContactInfo());
        
        // Constructor Mínimo (usando valores por defecto)
        Client cliente2 = new Client(2, "Juan Pérez");
        System.out.println("C2 (Mínimo): " + cliente2.getName() + " | " + cliente2.getContactInfo());

        // 2. Demostración de Sobrecarga de Constructores en Estetician
        System.out.println("\n--- Prueba de Constructores de Esteticista ---");
        
        // Constructor Completo
        Esthetician est1 = new Esthetician(10, "Sofía Mesa", "Facial", 0.15);
        System.out.println("E1 (Completo): " + est1.getName() + " | Comisión: " + est1.getCommissionRate());

        // Constructor Parcial (usa comisión por defecto 0.05)
        Esthetician est2 = new Esthetician("Laura Gómez", "Manicure");
        System.out.println("E2 (Parcial): " + est2.getName() + " | Comisión: " + est2.getCommissionRate());

        // 3. Demostración de Validación con Setter
        System.out.println("\n--- Prueba de Validación con Setter ---");
        try {
            est1.setCommissionRate(0.80); // Intenta establecer 80% (inválido)
        } catch (IllegalArgumentException e) {
            System.out.println("Error Capturado: " + e.getMessage());
            System.out.println("La comisión de E1 no cambió y sigue en: " + est1.getCommissionRate());
        }
        
        System.out.println("========================================================");
    }
}