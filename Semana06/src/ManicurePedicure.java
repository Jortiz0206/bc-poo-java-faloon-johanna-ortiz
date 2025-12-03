
// Archivo: implementaciones/ManicurePedicure.java
public class ManicurePedicure extends ServiceElement implements Billable {
    private double basePrice;

    public ManicurePedicure(String name, String code, double basePrice, int durationMinutes) {
        super(name, code, "Manicure/Pedicure"); // Llama al constructor de ServiceElement
        this.basePrice = basePrice;
    }

    // Implementación de Billable
    @Override
    public double getBaseCost() { return this.basePrice; }
    @Override
    public double calculateTaxes() { return 0; } 
    @Override
    public double calculateFinalCost() { return this.basePrice; }
    
    // Implementación del método abstracto de ServiceElement
    @Override
    public String getRoleDescription() {
        return "Servicio Manicure/Pedicure";
    }
}