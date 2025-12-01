package semana02;

public class Appointment {
    public String date;
    public String time;
    public Customer customer;
    public BeautyService service;

    // Constructor using composition
    public Appointment(String date, String time, Customer customer, BeautyService service) {
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.service = service;
    }

    // Method to show appointment info
    public void showInfo() {
        System.out.println("Appointment Details:");
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        
        System.out.println("\n--- Customer ---");
        customer.showInfo();
        
        System.out.println("--- Service ---");
        service.showInfo();
    }
}
