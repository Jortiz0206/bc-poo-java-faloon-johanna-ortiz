package com.belleza.excepciones;

public class CitaNoDisponibleException extends Exception {
    public CitaNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}