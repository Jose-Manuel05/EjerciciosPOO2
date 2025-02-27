package org.example.Practica2Modernizacion;

public class DorsalDuplicadoException extends RuntimeException {
    public DorsalDuplicadoException() {
        super("El dorsal ya está asignado a otro jugador");
    }
}
