public class ManicurePedicure extends Service {
    private boolean isSpaTreatment;
    private static final double SPA_BONUS = 0.20; // 20% extra por ser SPA

    public ManicurePedicure(String serviceCode, String name, double basePrice, boolean isSpaTreatment) {
        // Uso de super() para llamar al constructor de la clase padre
        super(serviceCode, name, basePrice);
        this.isSpaTreatment = isSpaTreatment;
    }

    // Sobrescritura de método para aplicar lógica específica (@Override)
    @Override
    public double calculateCost() {
        double finalCost = super.calculateCost(); // Obtiene el precio base
        if (this.isSpaTreatment) {
            // Aplica un 20% extra si es tratamiento SPA
            finalCost += finalCost * SPA_BONUS;
        }
        return finalCost;
    }

    // Sobrescritura de método para mostrar detalles específicos
    @Override
    public void displayInfo() {
        String tipo = this.isSpaTreatment ? "SPA" : "Estándar";
        System.out.println("  [MANI/PEDI] Tipo: " + tipo + " | Servicio: " + this.name);
        System.out.printf("  Costo Final: $%.2f%n", this.calculateCost());
    }
}