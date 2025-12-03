// Archivo: src/Semana03/LoyaltyClient.java

public class LoyaltyClient extends Client { // HEREDA DE CLIENT
    private int loyaltyPoints;

    public LoyaltyClient(int id, String name, String phone, int points) {
        super(id, name, phone); // Llama al constructor de Client, que a su vez llama al de Person
        this.loyaltyPoints = points;
    }

    // NUEVO: Método específico para clientes de lealtad
    public void applyLoyaltyDiscount() {
        if (this.loyaltyPoints >= 500) {
            System.out.println("¡Descuento del 15% aplicado por ser Cliente Leal!");
            this.loyaltyPoints -= 500; // Consume los puntos
        } else {
            System.out.println("Puntos insuficientes para descuento. Puntos actuales: " + this.loyaltyPoints);
        }
    }
    
    // Polimorfismo: Sobreescritura de método
    @Override
    public String getInfo() {
        // Usamos el getInfo() de Client y le añadimos la información de lealtad
        return super.getInfo() + ", Tipo: Leal, Puntos: " + this.loyaltyPoints;
    }
}