public class Esthetician {
    private int employeeId;
    private String name;
    private String specialization;
    private double commissionRate; // Atributo de negocio

    // Constructor completo
    public Esthetician(int employeeId, String name, String specialization, double commissionRate) {
        this.employeeId = employeeId;
        // Implementación de validación básica
        if (commissionRate < 0 || commissionRate > 0.5) {
            throw new IllegalArgumentException("La tasa de comisión debe estar entre 0 y 0.5 (50%).");
        }
        this.name = name;
        this.specialization = specialization;
        this.commissionRate = commissionRate;
    }

    // Método de negocio (interactúa con otra data)
    public double calculateCommission(double servicePrice) {
        return servicePrice * this.commissionRate;
    }

    // Getters
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    // Setters
    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }
    // ... otros setters
}