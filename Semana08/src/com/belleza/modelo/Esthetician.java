// Archivo: src/Semana03/Esthetician.java
package com.belleza.modelo;
public class Esthetician extends Person { // AHORA HEREDA DE PERSON
    private String specialty;

    // El constructor llama al constructor de la clase padre (Person) usando super()
    public Esthetician(int id, String name, String specialty) {
        super(id, name); 
        this.specialty = specialty;
    }

    // Método de negocio propio de Esthetician
    public String getSpecialty() {
        return this.specialty;
    }
    
    // Sobrecarga del método getInfo()
    @Override
    public String getInfo() {
        return super.getInfo() + ", Especialidad: " + this.specialty;
    }
}