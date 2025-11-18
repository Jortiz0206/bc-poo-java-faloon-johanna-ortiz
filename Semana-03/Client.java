public class Client {
    // 1. Encapsulación completa: Atributos privados
    private int clientId;
    private String name;
    private String phoneNumber;
    private String email;

    // 2. Sobrecarga de Constructores - Constructor Completo
    public Client(int clientId, String name, String phoneNumber, String email) {
        this.clientId = clientId;
        this.name = name;
        // Las validaciones se manejan en los setters
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    // 2. Sobrecarga de Constructores - Constructor Mínimo (Solo nombre y ID)
    public Client(int clientId, String name) {
        // Llama al constructor completo, asignando valores por defecto o nulos
        this(clientId, name, "N/A", null);
    }
    
    // Método de Negocio
    public String getContactInfo() {
        String contact = "Teléfono: " + phoneNumber;
        if (email != null && !email.isEmpty()) {
            contact += ", Email: " + email;
        }
        return contact;
    }

    // 3. Getters
    public int getClientId() { return clientId; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    // 3. Setters con Validación
    public void setPhoneNumber(String phoneNumber) {
        // Validación: Verifica que el número tenga al menos 7 dígitos (validación básica)
        if (phoneNumber == null || phoneNumber.length() < 7 || phoneNumber.equals("N/A")) {
            // No lanza excepción si es N/A (valor por defecto del constructor mínimo)
            this.phoneNumber = phoneNumber; 
            return;
        }
        this.phoneNumber = phoneNumber;
    }
    
    public void setEmail(String email) {
        // 3. Agregar validación: Verifica el formato básico del email
        if (email != null && !email.isEmpty() && !email.contains("@")) {
            throw new IllegalArgumentException("El formato del email es inválido.");
        }
        this.email = email;
    }
}