package org.example.Practica2Modernizacion;

public class FormacionInvalidaException extends RuntimeException {
    public FormacionInvalidaException() {
        super("Formato de formación incorrecto. Debe ser N-N-N");
    }
}
