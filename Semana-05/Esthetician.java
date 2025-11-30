public class Esthetician {
    private int employeeId;
    private String name;
    private String specialization;
    private double commissionRate; 

    public Esthetician(int employeeId, String name, String specialization, double commissionRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.specialization = specialization;
        this.commissionRate = commissionRate;
    }
    public Esthetician(int employeeId, String name) {
        this(employeeId, name, "General", 0.05); 
    }
    public String getName() { return name; }
}