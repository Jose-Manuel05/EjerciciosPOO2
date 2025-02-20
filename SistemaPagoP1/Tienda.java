package org.example.SistemaPagoP1;

import java.util.Scanner;

public class Tienda {

    private static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }

    public static void iniciarPago() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Seleccione el metodo de pago: ");
        System.out.println("1. Tarjeta de credito");
        System.out.println("2. PayPal");
        System.out.println("3. Bizum");
        System.out.print("Introduzca el número de la opción deseada: ");

        int opcion = teclado.nextInt();
        MetodoPago metodoPago;

        switch (opcion) {
            case 1:
                System.out.println("Introduzca el número de la tarjeta : ");
                String numeroTarjeta = teclado.next();
                System.out.println("Introduzca el tipo de tarjeta: ");
                String tipo = teclado.next();
                metodoPago = new TarjetaCredito(numeroTarjeta, tipo);
                TarjetaCredito.validarTarjetaCredito(numeroTarjeta, tipo);
                break;
            case 2:
                System.out.println("Introduzca el email de la cuenta de PayPal: ");
                teclado.nextLine();
                String cuenta = teclado.nextLine();
                metodoPago = new PayPal(cuenta);
                PayPal.validarPayPal(cuenta, 23);
                break;
            case 3:
                System.out.println("Introduzca el teléfono de la cuenta de Bizum: ");
                String telefono = teclado.next();
                int pinGenerado = Bizum.generarPinRandom();
                System.out.println("PIN generado: " + pinGenerado);
                System.out.println("Introduce el pin: ");
                int pinIntroducido = teclado.nextInt();
                if (pinGenerado != pinIntroducido) {
                    System.out.println("El PIN introducido no es correcto.");
                    return;
                }
                metodoPago = new Bizum(telefono);
                Bizum.validarBizum(telefono, pinGenerado);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("Introduzca el importe a pagar: ");
        double importe = teclado.nextDouble();

        realizarPago(metodoPago, importe);
    }
}