package org.example.EjerciciosTeoria.Enum.CajeroAutomatico;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("No se puede ingresar mas de 3.000€");
    }
}
