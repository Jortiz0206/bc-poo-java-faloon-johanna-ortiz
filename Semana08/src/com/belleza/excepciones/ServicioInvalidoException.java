package com.belleza.excepciones;

public class ServicioInvalidoException extends Exception {
    public ServicioInvalidoException(String mensaje) {
        super(mensaje);
    }
}