package com.belleza.modelo;
public class Client extends Person { 
    private String phone;

    
    public Client(int id, String name, String phone) {
        super(id, name); 
        this.phone = phone;
    }

   
    public String getContactInfo() {
        return "Teléfono: " + this.phone;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", " + this.getContactInfo();
    }

}
