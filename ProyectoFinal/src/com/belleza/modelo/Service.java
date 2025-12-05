package com.belleza.modelo; //

import com.belleza.excepciones.ServicioInvalidoException; // IMPORTA LA EXCEPCIÓN

public class Service {
    private String serviceCode;
    private String name;
    private double price;
    private int durationMinutes; 

    // Constructor que lanza la excepción al validar datos (EJERCICIO 2)
    public Service(String serviceCode, String name, double price, int durationMinutes) 
        throws ServicioInvalidoException // <<-- Declara que lanza un error
    {
        // Validación de negocio
        if (price <= 0) {
            throw new ServicioInvalidoException("El precio debe ser mayor a 0.");
        }
        if (durationMinutes <= 15) {
            throw new ServicioInvalidoException("La duración debe ser al menos de 15 minutos.");
        }
        
        this.serviceCode = serviceCode;
        this.name = name;
        this.price = price;
        this.durationMinutes = durationMinutes;
    }
    
    // ... resto de getters y métodos (debes mover tus getters aquí) ...
    public String getName() { return name; }
    public double getPrice() { return price; }
}