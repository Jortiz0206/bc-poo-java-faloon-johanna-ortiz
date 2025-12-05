// Archivo: src/Semana05/Service.java
// Se modifica la firma para usar 'implements'
public class Service implements IProcessable { 
    private String serviceCode;
    private String name;
    protected double basePrice;
    private int durationMinutes;

    public Service(String serviceCode, String name, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.name = name;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
    }

    // Metodo de S04 (Polimórfico)
    public double calculateFinalPrice() {
        return this.basePrice;
    }

    // Implementación obligatoria de IProcessable
    @Override
    public double calculateTax(double taxRate) {
        // Calcula el IVA sobre el precio final (después de la lógica de S04)
        return this.calculateFinalPrice() * taxRate;
    }

    // Implementación obligatoria de IProcessable
    @Override
    public String getProcessingDetails() {
        return "Servicio: " + this.name + ", Precio Base: $" + this.basePrice;
    }

    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
}