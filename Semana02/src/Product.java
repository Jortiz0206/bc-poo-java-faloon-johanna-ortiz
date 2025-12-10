public class Product {
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

  
    public boolean needsReorder() {
        return this.stockQuantity < 5; // Reordenar si hay menos de 5 unidades
    }
    
    // Getters
    public String getName() { return name; }
    public int getStockQuantity() { return stockQuantity; }

}
