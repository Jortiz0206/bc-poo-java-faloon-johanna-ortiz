public class Esthetician {
    private int employeeId;
    private String name;
    private String specialization;
    private double commissionRate; 

    // Constructor 1: Completo (4 parámetros)
    public Esthetician(int employeeId, String name, String specialization, double commissionRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.specialization = specialization;
        this.commissionRate = commissionRate;
    }

    // Constructor 2: Sobrecargado (Mínimo - 2 parámetros)
    public Esthetician(int employeeId, String name) {
        this(employeeId, name, "General", 0.05); 
    }
    
    public String getName() { return name; }
    // ... otros getters y setters
}