package org.example.EjerciciosTeoria.Enum.CajeroAutomatico;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("No se puede retirar mas de 600€ al dia");
    }
}
