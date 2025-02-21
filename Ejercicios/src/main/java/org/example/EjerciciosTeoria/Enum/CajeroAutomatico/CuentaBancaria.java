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
        saldo += cantidad;
    }

    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

}
