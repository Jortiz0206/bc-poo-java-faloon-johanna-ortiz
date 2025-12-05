public class FacialTreatment extends Service { // Usa 'extends'
    private double luxuryIngredientCost;
    private static final double TAX_RATE = 0.05; // 5% de impuesto extra

    public FacialTreatment(String serviceCode, String name, double basePrice, int durationMinutes, double luxuryIngredientCost) {
        // super() llama al constructor del padre (Service)
        super(serviceCode, name, basePrice, durationMinutes);
        this.luxuryIngredientCost = luxuryIngredientCost;
    }

    // Polimorfismo: Sobrescritura (@Override)
    @Override
    public double calculateFinalPrice() {
        // Precio base + impuesto + costo extra (accede a basePrice directamente)
        return super.basePrice * (1 + TAX_RATE) + this.luxuryIngredientCost;
    }
}