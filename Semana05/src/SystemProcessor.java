import java.util.ArrayList;

public class SystemProcessor {
    
    // Método Polimórfico 1: Acepta el tipo Padre (Service)
    public void facturarServicio(Service servicio) {
        // Llama al calculateFinalPrice() SOBRESCRITO (Binding Dinámico)
        double costoFinal = servicio.calculateFinalPrice(); 
        
        System.out.println("--- FACTURA ---");
        System.out.printf("Servicio: %s%n", servicio.getName());
        System.out.printf("Costo Total: $%.2f%n", costoFinal);
    }
    
    // Método Polimórfico 2: Procesa una colección polimórfica
    public void procesarCatalogo(ArrayList<Service> catalogo) {
        System.out.println("\n=== Recalculando Catálogo ===");
        double totalVenta = 0;
        for (Service svc : catalogo) {
            totalVenta += svc.calculateFinalPrice(); 
        }
        System.out.printf("Total de Venta Potencial: $%.2f%n", totalVenta);
    }
}