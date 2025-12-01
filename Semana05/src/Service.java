public class Service {
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

    // Método polimórfico base (sobrescrito por los hijos)
    public double calculateFinalPrice() {
        return this.basePrice;
    }
    
    // Getters necesarios para la Sobrecarga en BeautyCenter
    public String getServiceCode() { return serviceCode; } 
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
}