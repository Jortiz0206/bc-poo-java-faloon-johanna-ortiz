package com.belleza.servicio;

import com.belleza.modelo.*; 
import java.io.*;
import java.util.ArrayList;

public class DataPersistence {
    private static final String FILENAME = "agenda_citas.txt";

    // 1. Método para guardar datos (Escribir en archivo)
    public static void saveAppointments(ArrayList<Appointment> appointments) {
        // Uso de try-with-resources para cerrar el archivo automáticamente
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Appointment cita : appointments) {
                // Formato CSV: CLIENTE_ID;SERVICIO_CODE;FECHA;HORA
                writer.println(cita.getClient().getId() + ";" + 
                               cita.getService().getServiceCode() + ";" + 
                               cita.getAppointmentDate() + ";" + 
                               cita.getAppointmentTime());
            }
            System.out.println("✅ Datos de citas guardados en " + FILENAME);
        } catch (IOException e) {
            System.err.println("❌ ERROR al guardar las citas: " + e.getMessage());
        }
    }

    // 2. Método para cargar datos (Leer desde archivo)
    public static ArrayList<Appointment> loadAppointments() {
        ArrayList<Appointment> appointments = new ArrayList<>();
        
        // Uso de try-with-resources para cerrar el archivo automáticamente
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            // Lógica para leer el archivo y reconstruir los datos (aquí solo demostramos la lectura)
            
            System.out.println("✅ Carga de archivo completada. [Lógica de reconstrucción omitida].");
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ Archivo de agenda no encontrado. Iniciando con lista vacía.");
        } catch (IOException e) {
            System.err.println("❌ ERROR de lectura del archivo: " + e.getMessage());
        }
        return appointments;
    }
}