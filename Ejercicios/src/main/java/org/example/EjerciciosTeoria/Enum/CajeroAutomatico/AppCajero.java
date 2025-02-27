package org.example.EjerciciosTeoria.Enum.CajeroAutomatico;

import java.util.Scanner;

public class AppCajero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(500);

        int opcion = 0;
        do {
            System.out.println("Menu:");
            System.out.println("[1]. Ingresar dinero");
            System.out.println("[2]. Retirar dinero");
            System.out.println("[3]. Mostrar saldo");
            System.out.println("[X]. Salir");
            System.out.print("Elige una opcion:");
            opcion = sc.nextInt();

            try{
                switch (opcion){
                    case 1:
                        System.out.println("Introduce la cantidad a ingresar:");
                        double cantidadIngresar = sc.nextDouble();
                        cuenta.ingresarDinero(cantidadIngresar);
                        System.out.println("Ingreso realizado con exito");
                        break;
                    case 2:
                        System.out.println("Introduce la cantidad a retirar:");
                        double cantidadRetirar = sc.nextDouble();
                        cuenta.retirarDinero(cantidadRetirar);
                        System.out.println("Retirada realizada con exito");
                        break;
                    case 3:
                        cuenta.mostrarSaldo();
                        break;
                    case 'X':
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }while (opcion != 'X');

    }

}
