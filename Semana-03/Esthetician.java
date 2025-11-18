public class Esthetician {
    // 1. Encapsulación completa: Atributos privados
    private int employeeId;
    private String name;
    private String specialization;
    private double commissionRate;
    private final int MIN_COMMISSION = 0;
    private final int MAX_COMMISSION = 50; // 50%

    // 2. Sobrecarga de Constructores - Constructor Completo (30%)
    public Esthetician(int employeeId, String name, String specialization, double commissionRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.specialization = specialization;
        // La validación se llama desde el constructor
        setCommissionRate(commissionRate); 
    }

    // 2. Sobrecarga de Constructores - Constructor Parcial (Solo nombre y especialidad)
    public Esthetician(String name, String specialization) {
        // Llama al constructor completo, asignando un ID temporal y la comisión mínima
        this(0, name, specialization, 0.05); // Comisión base del 5%
    }
    
    // Método auxiliar privado
    private String formatCommission() {
        return String.format("%.0f%%", this.commissionRate * 100);
    }
    
    // Método de Negocio
    public double calculateCommission(double servicePrice) {
        return servicePrice * this.commissionRate;
    }

    // 3. Getters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public double getCommissionRate() { return commissionRate; }

    // 3. Setters con Validación
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    
    public void setCommissionRate(double commissionRate) {
        double ratePercent = commissionRate * 100;
        // 3. Agregar validación: Asegura que la tasa esté dentro de un rango
        if (ratePercent < MIN_COMMISSION || ratePercent > MAX_COMMISSION) {
            throw new IllegalArgumentException("La tasa de comisión debe estar entre " + MIN_COMMISSION + "% y " + MAX_COMMISSION + "%.");
        }
        this.commissionRate = commissionRate;
    }
}