public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Laura Gómez", "laura@mail.com", "3001234567");
        BeautyService s1 = new BeautyService("SRV-01", "Facial Cleaning", 80000);

        Appointment ap1 = new Appointment(c1, s1, "2025-02-15");

        BeautyCenter center = new BeautyCenter("Belleza Total");
        center.addAppointment(ap1);

        System.out.println("Appointments registered: " + center.totalAppointments());
    }
}
