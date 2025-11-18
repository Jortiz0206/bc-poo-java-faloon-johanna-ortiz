public class Service {
    // Atributos protected para ser compartidos con las clases hijas
    protected String serviceCode;
    protected String name;
    protected double basePrice;

    // Constructor completo
    public Service(String serviceCode, String name, double basePrice) {
        this.serviceCode = serviceCode;
        this.name = name;
        this.basePrice = basePrice;
    }

    // Método que se hereda y se sobrescribirá para calcular el costo
    public double calculateCost() {
        // Costo base sin impuestos ni extras
        return this.basePrice;
    }

    // Método que se hereda para mostrar la información básica
    public void displayInfo() {
        System.out.printf("  [BASE] %s (Cód: %s) - Precio Base: $%.2f%n", 
                           this.name, this.serviceCode, this.basePrice);
    }
}