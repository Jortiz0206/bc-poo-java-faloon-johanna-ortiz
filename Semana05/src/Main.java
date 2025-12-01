import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA SEMANA 05: POLIMORFISMO EN ACCIÓN =====");

        // Clases de utilidad
        SystemProcessor processor = new SystemProcessor();
        BeautyCenter centro = new BeautyCenter("Belleza Total S.A.S");
        
        // 1. Crear objetos específicos (Hijos de Service)
        FacialTreatment limpieza = new FacialTreatment("F-001", "Limpieza Detox", 90000.0, 60, 15000.0);
        ManicurePedicure spaPedi = new ManicurePedicure("M-002", "Pedicure Completo", 60000.0, 60, true);
        
        // 2. Agregar al ArrayList (polimorfismo estructural)
        centro.addService(limpieza); 
        centro.addService(spaPedi);
        
        System.out.println("\n--- 3. Demostración de Sobrecarga (Búsqueda) ---");
        
        // Sobrecarga 1: (String)
        Service svcByCode = centro.findService("F-001");
        System.out.printf("Búsqueda por Código (F-001): %s%n", svcByCode != null ? svcByCode.getName() : "No encontrado");

        // Sobrecarga 2: (double, double)
        ArrayList<Service> svcByPrice = centro.findService(50000.0, 100000.0);
        System.out.printf("Búsqueda por Rango ($50k-$100k): %d resultados%n", svcByPrice.size());
        
        System.out.println("\n--- 4. Demostración de Sobrescritura y Dinámica ---");
        
        // El procesador ejecuta la lógica de cálculo de precios del objeto real
        processor.facturarServicio(limpieza); // Llama al cálculo de FacialTreatment
        processor.facturarServicio(spaPedi);   // Llama al cálculo de ManicurePedicure
        
        // Procesar la colección polimórfica
        processor.procesarCatalogo(centro.getServices());
        
        System.out.println("=====================================================");
    }
}
