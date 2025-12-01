package semana02;

public class Main {
    public static void main(String[] args) {

        // Create a customer
        Customer customer = new Customer("Ana", "ana@example.com", "3001234567");

        // Create a service
        BeautyService service = new BeautyService("Facial Cleaning", 45, 70000);

        // Create an appointment
        Appointment appointment = new Appointment("2025-03-10", "10:30 AM", customer, service);

        // Show all information
        appointment.showInfo();
    }
}
