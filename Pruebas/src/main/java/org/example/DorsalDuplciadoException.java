package org.example;

public class DorsalDuplciadoException extends RuntimeException {
    public DorsalDuplciadoException() {
        super("El dorsal ya está asignado a otro jugador");
    }
}
