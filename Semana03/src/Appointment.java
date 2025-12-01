public class Appointment {
    private Client client;
    private BeautyService service;
    private String date;

    // Constructor completo
    public Appointment(Client client, BeautyService service, String date) {
        setClient(client);
        setService(service);
        setDate(date);
    }

    // Constructor sin fecha (coloca una por defecto)
    public Appointment(Client client, BeautyService service) {
        this(client, service, "No date assigned");
    }

    // Getters
    public Client getClient() { return client; }
    public BeautyService getService() { return service; }
    public String getDate() { return date; }

    // Setters con validación
    public void setClient(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Client cannot be null");
        }
        this.client = client;
    }

    public void setService(BeautyService service) {
        if (service == null) {
            throw new IllegalArgumentException("Service cannot be null");
        }
        this.service = service;
    }

    public void setDate(String date) {
        if (date == null || date.length() < 5) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.date = date;
    }
}
