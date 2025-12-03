// Archivo: src/Semana05/IProcessable.java

public interface IProcessable {
    
    // Método que calcula el impuesto para el item
    double calculateTax(double taxRate); 
    
    // Método para obtener una descripción unificada del item
    String getProcessingDetails(); 
}