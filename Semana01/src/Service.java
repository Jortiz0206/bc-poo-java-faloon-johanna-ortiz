package Semana01;

public class Service {
    private String serviceCode;
    private String name;
    private double price;
    private int duration;

    public Service(String serviceCode, String name, double price, int duration) {
        this.serviceCode = serviceCode;
        this.name = name;
        this.price = price;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Service: " + name);
        System.out.println("Code: " + serviceCode);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration + " min");
    }
}
