// Archivo: interfaces/Billable.java
public interface Billable {
    double getBaseCost();
    double calculateTaxes();
    double calculateFinalCost();
}