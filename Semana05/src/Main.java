// Archivo: src/Semana05/Main.java

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA SEMANA 05: INTERFACES Y ACOPLAMIENTO BAJO =====");

        // Clases de S04 (Hijos de Service, ya implementan IProcessable por herencia)
        FacialTreatment facialDiamante = new FacialTreatment("F-02", "Facial Diamante", 150000.0, 120, 50000.0);
        ManicurePedicure spaArt = new ManicurePedicure("M-01", "Spa Manicure", 40000.0, 60, true);
        
        // Clase de S02 (Implementa IProcessable directamente)
        Product serum = new Product("P-001", "Serum Vitamina C", 120000.0, 3);
        
        // Crear el procesador
        SystemProcessor processor = new SystemProcessor();
        
        // Demostración de Polimorfismo: El procesador acepta diferentes tipos de objetos
        System.out.println("\n--- Procesando Tratamiento Facial (es IProcessable) ---");
        processor.processSale(facialDiamante); 
        
        System.out.println("\n--- Procesando Producto (es IProcessable) ---");
        processor.processSale(serum);
        
        System.out.println("\n--- Procesando Manicure (es IProcessable) ---");
        processor.processSale(spaArt);
        
        System.out.println("==========================================================");
    }
}