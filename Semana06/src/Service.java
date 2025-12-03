public class Service {
    private String serviceCode;
    private String name;
    protected double basePrice; 
    private int durationMinutes;

    // CONSTRUCTOR
    public Service(String serviceCode, String name, double basePrice, int durationMinutes) {
        this.serviceCode = serviceCode;
        this.name = name;
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
    }

    public double calculateFinalPrice() {
        return this.basePrice;
    }
    
    public String getServiceCode() { return serviceCode; } 
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
    

    public int getDurationMinutes() { 
        return durationMinutes;
    }
    
} 