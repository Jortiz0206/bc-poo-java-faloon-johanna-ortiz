package semana04;

public class BeautyProfessional {

    protected String name;
    protected String id;
    protected double baseSalary;

    // Full constructor
    public BeautyProfessional(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    // Method inherited by subclases
    public void showInfo() {
        System.out.println("Professional Name: " + name);
        System.out.println("ID: " + id);
    }

    // Method to be overridden
    public double calculateSalary() {
        return baseSalary;
    }
}
