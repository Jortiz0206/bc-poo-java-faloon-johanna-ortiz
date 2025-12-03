// Archivo: src/Semana06/Billable.java

// COMENTARIO: Esta es una INTERFAZ. Define la CAPACIDAD de un objeto para ser facturado.
// Las clases que la implementan son responsables de definir la lógica de costo.
public interface Billable {
    double getBaseCost();
    double calculateTaxes();
    double calculateFinalCost();
}