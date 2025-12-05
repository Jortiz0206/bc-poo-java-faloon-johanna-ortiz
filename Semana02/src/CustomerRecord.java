public class CustomerRecord {
    private String recordId;
    private Client client; // Relación con la clase Client de S01
    private String skinDiagnosis;
    private double totalSpent;
    
    public CustomerRecord(String recordId, Client client, String skinDiagnosis, double totalSpent) {
        this.recordId = recordId;
        this.client = client;
        this.skinDiagnosis = skinDiagnosis;
        this.totalSpent = totalSpent;
    }
    
    // Método de Negocio: Determina si es elegible para descuento de lealtad
    public boolean isLoyaltyEligible() {
        return this.totalSpent >= 500000.0;
    }

    // Getters
    public Client getClient() { return client; }
    public double getTotalSpent() { return totalSpent; }
}