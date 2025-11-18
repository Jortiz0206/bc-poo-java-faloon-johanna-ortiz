public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA SEMANA 04: HERENCIA Y POLIMORFISMO =====");

        // 1. Array Polimórfico: Se declara como tipo Service (Clase Padre)
        Service[] catalogo = new Service[3];
        
        // 2. Instanciación: Guardamos objetos de las subclases en el array del Padre
        catalogo[0] = new FacialTreatment("F-001", "Limpieza Profunda", 80000.0, "Mixta");
        catalogo[1] = new ManicurePedicure("M-001", "Manicure Básico", 30000.0, false);
        catalogo[2] = new ManicurePedicure("M-002", "Pedicure SPA", 55000.0, true);
        
        System.out.println("\n--- Catálogo de Servicios (Polimorfismo en acción) ---");
        
        // 3. Polimorfismo en acción
        for (Service servicio : catalogo) {
            System.out.println("------------------------------------");
            // Java llama automáticamente al método displayInfo() correcto
            // (el que fue SOBRESCRITO en la clase hija).
            servicio.displayInfo(); 
        }
        System.out.println("------------------------------------");
    }
}