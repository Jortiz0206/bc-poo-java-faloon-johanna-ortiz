public class Service {
    private String serviceCode;
    private String name;
    protected double basePrice; // CAMBIADO A PROTECTED para herencia
    private int durationMinutes;

    public Service(String serviceCode, String name, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.name = name;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
    }

    // Método polimórfico (Sobrescrito por los hijos)
    public double calculateFinalPrice() {
        return this.basePrice;
    }
    
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
}