// Archivo: src/Semana05/Product.java
// Se modifica la firma para usar 'implements'
public class Product implements IProcessable {
    private String productId;
    private String name;
    private double unitPrice;
    private int stockQuantity;

    public Product(String productId, String name, double unitPrice, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockQuantity = stockQuantity;
    }
    
    // Implementación obligatoria de IProcessable
    @Override
    public double calculateTax(double taxRate) {
        return this.unitPrice * taxRate;
    }

    // Implementación obligatoria de IProcessable
    @Override
    public String getProcessingDetails() {
        return "Producto: " + this.name + ", Precio sin IVA: $" + this.unitPrice;
    }
    
    public double getUnitPrice() { return unitPrice; }
    // ... otros métodos de S02
}