public class ManicurePedicure extends Service {
    private boolean includesNailArt;
    private static final double NAIL_ART_SURCHARGE = 15000.0; 

    public ManicurePedicure(String serviceCode, String name, double basePrice, int durationMinutes, boolean includesNailArt) {
        super(serviceCode, name, basePrice, durationMinutes);
        this.includesNailArt = includesNailArt;
    }

    // Sobrescritura: Implementa lógica de precio con recargo por nail art
    @Override
    public double calculateFinalPrice() {
        double finalPrice = super.basePrice;
        
        if (includesNailArt) {
            finalPrice += NAIL_ART_SURCHARGE;
        }
        return finalPrice;
    }
}
