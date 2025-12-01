package Semana01;

public class Esthetician {
    private int employeeId;
    private String name;
    private String specialization; 

    // Constructor de 3 parámetros
    public Esthetician(int employeeId, String name, String specialization) {
        this.employeeId = employeeId;
        this.name = name;
        this.specialization = specialization;
    }
    
    // Getter esencial
    public String getName() { return name; }
    public int getEmployeeId() { return employeeId; }
}