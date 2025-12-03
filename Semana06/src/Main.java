import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CENTRO DE BELLEZA: ABSTRACCIÓN E INTERFACES ===\n");
        
        // 1. Crear objetos concretos
        // NOTA: FacialTreatment ahora cumple con 3 tipos: ServiceElement, Billable, Schedulable
        FacialTreatment detox = new FacialTreatment("Detox Anti-Acné", "F102", 150000.0, 90);
        Esthetician sofia = new Esthetician("Sofia Rodriguez", "E201", "Dermatología");
        
        // --- Sección 1: Polimorfismo con Clase Abstracta (ServiceElement) ---
        System.out.println("--- Sección 1: Polimorfismo Abstracto ---");
        
        // COMENTARIO: Lista polimórfica de tipo ServiceElement (la clase ABSTRACTA).
        // Podemos almacenar Esthetician y FacialTreatment en la misma lista.
        ArrayList<ServiceElement> elementos = new ArrayList<>();
        elementos.add(sofia); 
        elementos.add(detox); 
        
        for (ServiceElement elem : elementos) {
            elem.printBaseInfo();
            // Llama al método abstracto implementado en cada clase (getRoleDescription)
            System.out.println("   Rol Específico: " + elem.getRoleDescription()); 
        }
        
        // --- Sección 2: Uso de Interfaces (Billable y Schedulable) ---
        System.out.println("\n--- Sección 2: Facturación y Agenda ---");
        
        // COMENTARIO: El objeto 'detox' se trata como un Billable para facturación.
        Billable itemFacturable = detox; 
        System.out.printf("1. Facturación: %s%n", detox.getName());
        System.out.printf("   Costo Base: $%.2f%n", itemFacturable.getBaseCost());
        System.out.printf("   Impuestos:  $%.2f%n", itemFacturable.calculateTaxes());
        System.out.printf("   Costo Final: $%.2f%n", itemFacturable.calculateFinalCost());
        
        // COMENTARIO: El mismo objeto 'detox' se trata como un Schedulable para agenda.
        Schedulable itemAgendable = detox;
        System.out.printf("\n2. Agenda: %s%n", detox.getName());
        System.out.printf("   Duración: %d minutos%n", itemAgendable.getDurationMinutes());
        itemAgendable.logProcess("agendado en el sistema"); 

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}