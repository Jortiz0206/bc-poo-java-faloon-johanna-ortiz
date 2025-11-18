public class FacialTreatment extends Service {
    private String skinType;
    private static final double EXFOLIANT_FEE = 15000.0; // Tarifa fija por insumo

    public FacialTreatment(String serviceCode, String name, double basePrice, String skinType) {
        // Uso de super() para llamar al constructor de la clase padre
        super(serviceCode, name, basePrice);
        this.skinType = skinType;
    }

    // Sobrescritura de método para aplicar lógica específica (@Override)
    @Override
    public double calculateCost() {
        // Costo heredado + Tarifa fija por insumos de exfoliación
        return super.calculateCost() + EXFOLIANT_FEE;
    }

    // Sobrescritura de método para mostrar detalles específicos
    @Override
    public void displayInfo() {
        // Llama al método del padre para la info básica y añade la específica
        System.out.println("  [FACIAL] Tratamiento: " + this.name);
        System.out.println("  Tipo de Piel: " + this.skinType);
        System.out.printf("  Costo Final: $%.2f%n", this.calculateCost());
    }
}