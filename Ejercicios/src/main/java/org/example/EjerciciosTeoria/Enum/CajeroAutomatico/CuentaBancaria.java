package org.example.EjerciciosTeoria.Enum.CajeroAutomatico;

public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //region Getters y Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //endregion

    public void ingresarDinero(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a ingresar debe ser mayor que 0");
        }
        if (cantidad > 3000) {
            throw new DepositoMaximoException();
        }
        saldo += cantidad;
    }

    public void retirarDinero(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser mayor que 0");
        }
        if (cantidad > 600) {
            throw new LimiteDiarioException();
        }
        if (cantidad > saldo) {
            throw new SladoInsuficienteException();
        }
        saldo -= cantidad;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

}
