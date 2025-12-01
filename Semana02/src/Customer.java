package semana02;

public class Customer {
    public String name;
    public String email;
    public String phone;

    // Full constructor
    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Method to show customer info
    public void showInfo() {
        System.out.println("===== Customer Information =====");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("================================");
    }
}
