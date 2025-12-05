
package com.belleza.modelo;
public class FacialTreatment extends ServiceElement implements Billable, Schedulable {
    private double basePrice;
    private int durationMinutes;
    private static final double TAX_RATE = 0.19; 
    
    // El constructor debe ser ajustado para reflejar que FacialTreatment ya no extiende Service (S04)
    public FacialTreatment(String name, String code, double basePrice, int durationMinutes) {
        super(name, code, "Facial"); // Llama al constructor de ServiceElement (Clase Abstracta)
        this.basePrice = basePrice;
        this.durationMinutes = durationMinutes;
    }

    // Implementación de Billable
    @Override
    public double getBaseCost() { return this.basePrice; }
    @Override
    public double calculateTaxes() { return this.basePrice * TAX_RATE; }
    @Override
    public double calculateFinalCost() { return this.basePrice + calculateTaxes(); }
    
    // Implementación de Schedulable
    @Override
    public int getDurationMinutes() { return this.durationMinutes; }
    @Override
    public void logProcess(String action) {
        System.out.printf("   [LOG]: Servicio '%s' ha sido %s.%n", this.name, action);
    }
    
    // Implementación del método abstracto de ServiceElement
    @Override
    public String getRoleDescription() {
        return "Tratamiento Facial - Duracion: " + this.durationMinutes + " min";
    }
}