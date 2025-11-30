// Archivo: Esthetician.java
public class Esthetician extends ServiceElement { 
    private String specialization;
    
    public Esthetician(String name, String idCode, String specialization) {
        super(name, idCode, "Personnel"); // Llama al constructor de ServiceElement
        this.specialization = specialization;
    }

    // Método de ServiceElement (Implementación de método abstracto)
    @Override
    public String getRoleDescription() {
        return "Esteticista - Especialista en " + this.specialization;
    }
}