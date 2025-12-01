package semana02;

public class BeautyService {
    public String serviceName;
    public int duration;   // in minutes
    public double price;

    // Constructor
    public BeautyService(String serviceName, int duration, double price) {
        this.serviceName = serviceName;
        this.duration = duration;
        this.price = price;
    }

    // Method to show service info
    public void showInfo() {
        System.out.println("Service Information:");
        System.out.println("Service: " + serviceName);
        System.out.println("Duration: " + duration + " min");
        System.out.println("Price: $" + price);
        System.out.println("------------------------------");
    }
}


