public class FacialTreatment extends Service {
    private double luxuryIngredientCost;
    private static final double TAX_RATE = 0.05; 

    public FacialTreatment(String serviceCode, String name, double basePrice, int durationMinutes, double luxuryIngredientCost) {
        super(serviceCode, name, basePrice, durationMinutes);
        this.luxuryIngredientCost = luxuryIngredientCost;
    }

    // Sobrescritura: Implementa lógica de precio con impuesto y costo extra
    @Override
    public double calculateFinalPrice() {
        return super.basePrice * (1 + TAX_RATE) + this.luxuryIngredientCost;
    }
}