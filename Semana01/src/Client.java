package Semana01;

public class Client {
    private int clientId;
    private String name;
    private String phoneNumber;
    
    // CONSTRUCTOR: 3 PARÁMETROS (int, String, String)
    public Client(int clientId, String name, String phoneNumber) {
        this.clientId = clientId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public void displayClientInfo() {
        System.out.println("Client: " + name + " (ID: " + clientId + ")");
        System.out.println("Contact Phone: " + phoneNumber);
    }
    
    public String getName() { return name; } // <-- ¡CRUCIAL para S02!
}