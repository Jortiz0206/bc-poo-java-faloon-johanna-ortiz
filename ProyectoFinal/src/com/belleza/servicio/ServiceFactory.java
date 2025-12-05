package com.belleza.servicio;

import com.belleza.modelo.*; 
import com.belleza.excepciones.ServicioInvalidoException;

/**
 * Clase Factory para la creación de objetos Servicio. 
 * Centraliza la lógica de instanciación polimórfica.
 */
public class ServiceFactory {
    
    public static Service createService(String type, String code, String name, double price, int duration) 
        throws ServicioInvalidoException 
    {
        // 1. Usa la clave 'type' para determinar qué clase concreta instanciar.
        switch (type.toUpperCase()) {
            case "FACIAL":
                // Instancia una clase hija: FacialTreatment (5 argumentos)
                double luxuryCost = price * 0.20;
                return new FacialTreatment(code, name, price, duration, luxuryCost); 
            
            case "MANICURE":
                // Instancia otra clase hija: ManicurePedicure (5 argumentos)
                return new ManicurePedicure(code, name, price, duration, true); 
            
            case "BASE":
            case "MASAJE":
                // Instancia la clase padre: Service (4 argumentos)
                return new Service(code, name, price, duration);
            
            default:
                // Lanza una excepción personalizada (S07) si el tipo no existe.
                throw new ServicioInvalidoException("Tipo de servicio no reconocido por la fábrica: " + type);
        }
    }
}