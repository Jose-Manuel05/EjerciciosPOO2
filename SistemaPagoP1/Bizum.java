package org.example.SistemaPagoP1;

import java.util.Random;

public class Bizum extends MetodoPago{

    private String telefono;
    private int pin;

    public Bizum(String telefono) {
        this.telefono = telefono;
        pin = generarPinRandom();
        validarBizum(telefono, pin);
    }


    public static void validarBizum(String telefono, int pin) {
        validarTelefono(telefono);
        validarPin(pin);
    }

    private static void validarTelefono(String telefono) {
        if (telefono.length() != 9) {
            System.out.println("El teléfono debe tener 9 dígitos.");
        }
    }

    private static void validarPin(int pin) {
        if (pin < 100000 || pin > 999999) {
            System.out.println("El pin no es correcto.");
        }
    }

    public static int generarPinRandom() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(900000) + 100000;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum al telefono " + telefono + ".");
    }
}


