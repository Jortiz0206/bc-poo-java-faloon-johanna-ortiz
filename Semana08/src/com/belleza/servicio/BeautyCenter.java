// Fragmento de BeautyCenter.java
package com.belleza.servicio;

import com.belleza.modelo.Appointment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List; // Usar la interfaz List
import java.util.Map; // Usar la interfaz Map

public class BeautyCenter {
    private String centerName;

    // 🛑 1. HashMap para búsqueda rápida (O(1)) por código de cita 🛑
    private Map<String, Appointment> citasPorCodigo = new HashMap<>(); 
    
    // 🛑 2. ArrayList para mantener el orden y permitir iteración 🛑
    private List<Appointment> historialCitas = new ArrayList<>();
    
    // Constructor (Asegúrate de inicializar)
    public BeautyCenter(String name) {
        this.centerName = name;
        this.loadData(); 
    }
    
    // Actualizar addAppointment
    public void addAppointment(Appointment appointment) {
        String codigo = appointment.getCodigoCita(); // Debes crear este método getter en Appointment.java
        
        if (citasPorCodigo.containsKey(codigo)) {
            throw new IllegalArgumentException("Ya existe una cita con este código: " + codigo);
        }
        
        citasPorCodigo.put(codigo, appointment);
        historialCitas.add(appointment); // Sincroniza el ArrayList
    }

    // Método para buscar por código O(1)
    public Appointment buscarCitaPorCodigo(String codigo) {
        return citasPorCodigo.get(codigo);
    }


// 1. Método de Filtrado (Por ejemplo, por nombre de servicio)
public List<Appointment> filtrarPorNombreServicio(String nombre) {
    List<Appointment> resultado = new ArrayList<>();
    for (Appointment cita : historialCitas) {
        if (cita.getService().getName().toLowerCase().contains(nombre.toLowerCase())) {
            resultado.add(cita);
        }
    }
    return resultado;
}

// 2. Método de Estadística (Cálculo del Total de Ventas)
public double calcularTotalVentas() {
    double total = 0;
    for (Appointment cita : historialCitas) {
        // Asume que la clase Service tiene un calculateFinalPrice()
        total += cita.getService().calculateFinalPrice(); 
    }
    return total;
}
}