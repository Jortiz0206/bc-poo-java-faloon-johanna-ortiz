import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CENTRO DE BELLEZA: ABSTRACCIÓN E INTERFACES ===\n");
        
        // 1. Crear objetos concretos
        FacialTreatment detox = new FacialTreatment("Detox Anti-Acné", "F102", 150000.0, 90);
        Esthetician sofia = new Esthetician("Sofia Rodriguez", "E201", "Dermatología");
        
        // --- Sección 1: Polimorfismo con Clase Abstracta ---
        System.out.println("--- Sección 1: Polimorfismo Abstracto ---");
        
        // Lista polimórfica de tipo ServiceElement
        ArrayList<ServiceElement> elementos = new ArrayList<>();
        elementos.add(sofia); 
        elementos.add(detox);  
        
        for (ServiceElement elem : elementos) {
            elem.printBaseInfo();
            System.out.println("   Rol Específico: " + elem.getRoleDescription());
        }
        
        // --- Sección 2: Uso de Interfaces (Múltiple Implementación) ---
        System.out.println("\n--- Sección 2: Facturación y Agenda ---");
        
        // Usar referencia de tipo Interfaz: Billable
        Billable itemFacturable = detox; 
        System.out.printf("1. %s | Costo Final: $%.2f%n", detox.getName(), itemFacturable.calculateFinalCost());
        
        // Usar referencia de tipo Interfaz: Schedulable
        Schedulable itemAgendable = detox;
        System.out.printf("   Duración Agendada: %d minutos%n", itemAgendable.getDurationMinutes());
        itemAgendable.logProcess("iniciado"); 

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}