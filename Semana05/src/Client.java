public class Client {
    // Encapsulación: Atributos privados
    private int clientId;
    private String name;
    private String phoneNumber;
    private String email; 

    // Constructor 1: Completo (4 parámetros)
    public Client(int clientId, String name, String phoneNumber, String email) {
        this.clientId = clientId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        // Asumiendo que setEmail está definido con validación
        this.email = email; 
    }

    // Constructor 2: Sobrecargado (Mínimo - 2 parámetros)
    public Client(int clientId, String name) {
        this(clientId, name, "N/A", ""); 
    }
    
    public String getName() { return name; }
    // ... otros getters y setters
}