package com.belleza.modelo;

public class Esthetician extends Person { 
    private String specialty;

    public Esthetician(int id, String name, String specialty) {
        super(id, name); 
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return this.specialty;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Especialidad: " + this.specialty;
    }

}
