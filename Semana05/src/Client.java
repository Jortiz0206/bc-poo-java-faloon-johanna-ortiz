public class Client {
    private int clientId;
    private String name;
    private String phoneNumber;
    private String email; 

    public Client(int clientId, String name, String phoneNumber, String email) {
        this.clientId = clientId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email; 
    }
    public Client(int clientId, String name) {
        this(clientId, name, "N/A", ""); 
    }
    public String getName() { return name; }
}