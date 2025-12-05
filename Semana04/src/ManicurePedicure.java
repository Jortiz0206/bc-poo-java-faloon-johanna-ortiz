public class ManicurePedicure extends Service { // Usa 'extends'
    private boolean includesNailArt;
    private static final double NAIL_ART_SURCHARGE = 15000.0; 

    public ManicurePedicure(String serviceCode, String name, double basePrice, int durationMinutes, boolean includesNailArt) {
        // super() llama al constructor del padre (Service)
        super(serviceCode, name, basePrice, durationMinutes);
        this.includesNailArt = includesNailArt;
    }

    // Polimorfismo: Sobrescritura (@Override)
    @Override
    public double calculateFinalPrice() {
        double finalPrice = super.basePrice;
        
        // Aplica recargo si incluye Nail Art
        if (includesNailArt) {
            finalPrice += NAIL_ART_SURCHARGE;
        }
        return finalPrice;
    }
}