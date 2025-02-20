package SistemaPagoP1;

public class TarjetaCredito extends MetodoPago {
     private String numeroTarjeta;
     private String tipo;

     public TarjetaCredito(String numeroTarjeta, String tipo) {
         this.numeroTarjeta = numeroTarjeta;
         this.tipo = tipo;
         validarTarjetaCredito(numeroTarjeta, tipo);
     }

    public static void validarTarjetaCredito(String numeroTarjeta, String tipo) {
        validarLongitudNumeroTarjetaCredito(numeroTarjeta);
        validarTipoTarjetaCredito(tipo);
    }

     private static void validarLongitudNumeroTarjetaCredito(String numeroTarjeta) {
         if (numeroTarjeta.length() != 16) {
             System.out.println("El número de tarjeta de crédito debe tener 16 dígitos.");
         }
     }

     private static void validarTipoTarjetaCredito(String tipo) {
         switch (tipo.toUpperCase()) {
                case "VISA":
                case "MASTERCARD":
                case "MAESTRO":
                    break;
         default:
             System.out.println("El tipo de tarjeta de crédito no es válido.");
         }
     }

     @Override
     public void procesarPago(double importe) {
         System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo + " a la tarjeta "+ numeroTarjeta + ".");
     }
}


