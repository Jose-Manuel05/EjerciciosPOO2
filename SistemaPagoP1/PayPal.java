package org.example.SistemaPagoP1;

public class PayPal extends MetodoPago{

    private String cuenta;
    private double saldo;

    public PayPal(String cuenta) {
        this.cuenta = cuenta;
        this.saldo = 23;
        validarPayPal(cuenta, saldo);
    }

    public static void validarPayPal(String cuenta, double saldo) {
        validarCuenta(cuenta);
        validarSaldo(saldo);
    }

    private static void validarCuenta(String cuenta) {
        String email = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+[.com]+$";
        if (!cuenta.matches(email)) {
            System.out.println("El email no es válido.");
        }
    }

    private static void validarSaldo(double saldo) {
        if (saldo <= 0) {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ a la cuenta de PayPal " + cuenta + ".");
    }
}


