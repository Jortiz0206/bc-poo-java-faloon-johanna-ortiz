// Archivo: abstractas/ServiceElement.java
public abstract class ServiceElement {
    protected String name;
    protected String internalCode;
    protected String type; 
    
    public ServiceElement(String name, String internalCode, String type) {
        this.name = name;
        this.internalCode = internalCode;
        this.type = type;
    }
    
    public abstract String getRoleDescription();
    
    public void printBaseInfo() {
        System.out.printf("Elemento: %s (%s) - Cód: %s%n", this.name, this.type, this.internalCode);
    }
    
    public String getName() { return name; }
}