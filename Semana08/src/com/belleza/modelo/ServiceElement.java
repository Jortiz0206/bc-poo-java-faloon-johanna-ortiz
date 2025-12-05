// Archivo: src/Semana06/ServiceElement.java 
package com.belleza.modelo;
public abstract class ServiceElement {
    protected String name;
    protected String internalCode;
    protected String type; 
    
    // AÑADE ESTE BLOQUE DE CONSTRUCTOR EXACTO:
    public ServiceElement(String name, String internalCode, String type) {
        this.name = name;
        this.internalCode = internalCode;
        this.type = type;
    }
    // FIN DEL BLOQUE AÑADIDO
    
    public abstract String getRoleDescription();
    
    public void printBaseInfo() {
        System.out.printf("Elemento: %s (%s) - Cód: %s%n", this.name, this.type, this.internalCode);
    }
    
    public String getName() { return name; }
}