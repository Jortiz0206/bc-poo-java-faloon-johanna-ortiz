// Archivo: src/com/belleza/servicio/ServiceFactory.java
package com.belleza.servicio; // Asume el paquete servicio

import com.belleza.modelo.*; // Importa Service, FacialTreatment, ManicurePedicure
import com.belleza.excepciones.ServicioInvalidoException;

public class ServiceFactory {
    
    /**
     * Patrón Factory Method: Centraliza la creación de los servicios.
     */
    public static Service createService(String type, String code, String name, double price, int duration) 
        throws ServicioInvalidoException 
    {
        // NOTA: Usamos el constructor de 4 args para Service y 5 args para los hijos (S04)
        
        switch (type.toUpperCase()) {
            case "FACIAL":
                // FacialTreatment requiere 5 args: 4 del padre + 1 (costo extra)
                // Asumimos un costo extra de 20% del precio base
                double luxuryCost = price * 0.20;
                return new FacialTreatment(code, name, price, duration, luxuryCost); 
            
            case "MANICURE":
                // ManicurePedicure requiere 5 args: 4 del padre + 1 (boolean nailArt)
                return new ManicurePedicure(code, name, price, duration, true); // Incluye Nail Art
            
            case "BASE":
            default:
                // Devuelve el objeto padre Service (4 args)
                return new Service(code, name, price, duration);
        }
    }
}