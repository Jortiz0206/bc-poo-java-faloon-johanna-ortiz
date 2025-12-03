public class PruebaSemana01 { 
    public static void main(String[] args) {
        System.out.println("--- Prueba Semana 01 - Base ---");
        
        // Creación de objetos Service
        Service facial = new Service("S-001", "Limpieza Facial Profunda", 80000.0, 60);
        
        // Creación de objeto Client
        Client johanna = new Client(101, "Johanna Ortiz", "3105556677");
        
        // Creación de objeto Esthetician
        Esthetician sofia = new Esthetician(10, "Sofia Mesa", "Facial");
        
        // Llamada a métodos
        facial.displayDetails();
        johanna.displayClientInfo();
        System.out.println("Empleado asignado: " + sofia.getName());
    }
}