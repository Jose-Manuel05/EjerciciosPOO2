package org.example.EjerciciosTeoria.Enum.CajeroAutomatico;

public class SladoInsuficienteException extends RuntimeException {
    public SladoInsuficienteException() {
        super("No dispones de saldo suficiente");
    }
}
