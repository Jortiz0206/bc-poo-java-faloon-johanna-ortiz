public class Client {
    private int clientId;
    private String name;
    private String phoneNumber;
    private String email;

    // Constructor completo
    public Client(int clientId, String name, String phoneNumber, String email) {
        this.clientId = clientId;
        this.name = name;
        // Implementación de validación básica
        if (phoneNumber == null || phoneNumber.length() < 7) {
            throw new IllegalArgumentException("El número de teléfono debe ser válido.");
        }
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Método de negocio (interactúa con otra data)
    public boolean needsAppointmentReminder() {
        // Regla de negocio simple: Si el cliente no tiene email, siempre necesita recordatorio por teléfono.
        return this.email == null || this.email.isEmpty();
    }

    // Getters
    public String getName() { return name; }
    // ... otros getters
}