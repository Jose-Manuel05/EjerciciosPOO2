package org.example;

public class FormacionInvalidaException extends RuntimeException {
    public FormacionInvalidaException() {
        super("La formación no es válida");
    }
}
