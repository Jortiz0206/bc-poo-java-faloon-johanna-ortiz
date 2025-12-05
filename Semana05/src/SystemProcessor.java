// Archivo: src/Semana05/SystemProcessor.java
public class SystemProcessor {
    private static final double GENERAL_TAX = 0.19; // IVA general del 19%

    // Método que acepta CUALQUIER objeto que implemente IProcessable
    public void processSale(IProcessable item) {
        double finalPrice = 0.0;
        double taxAmount = item.calculateTax(GENERAL_TAX);

        // Se usa 'instanceof' y Downcasting para obtener el precio final correcto
        if (item instanceof Service) {
            Service service = (Service) item; 
            finalPrice = service.calculateFinalPrice();
        } else if (item instanceof Product) {
            Product product = (Product) item;
            finalPrice = product.getUnitPrice();
        } else {
             // Caso base para cualquier otro IProcessable simple
             finalPrice = 0; 
        }

        double grandTotal = finalPrice + taxAmount;

        System.out.println("\n--- Procesando Venta ---");
        System.out.println(item.getProcessingDetails());
        System.out.printf("  Precio Final (sin IVA): $%.2f%n", finalPrice);
        System.out.printf("  IVA (%.0f%%): $%.2f%n", GENERAL_TAX * 100, taxAmount);
        System.out.printf("  TOTAL A PAGAR: $%.2f%n", grandTotal);
    }
}