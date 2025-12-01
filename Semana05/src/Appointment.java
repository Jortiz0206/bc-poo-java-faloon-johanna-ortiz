public class Appointment {
    private Client client;          
    private Esthetician esthetician; 
    private Service service;        
    private String appointmentDate;
    private String appointmentTime;

    public Appointment(Client client, Esthetician esthetician, Service service, String date, String time) {
        this.client = client;
        this.esthetician = esthetician;
        this.service = service;
        this.appointmentDate = date;
        this.appointmentTime = time;
    }
}