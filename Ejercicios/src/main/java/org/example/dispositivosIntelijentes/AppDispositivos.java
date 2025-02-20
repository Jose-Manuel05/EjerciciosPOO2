package org.example.dispositivosIntelijentes;

import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {
        Televisor samsung = new Televisor("Samsung");

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG"));
        listaDispositivos.add(new ParlanteIntelijente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Panasonic"));
        listaDispositivos.add(new Televisor("Sony"));

//        for (Dispositivo dispositivo : listaDispositivos) {
//            dispositivo.encender();
//
//            if (dispositivo instanceof ControlRemoto) {
//                ((ControlRemoto) dispositivo).sincronizar();
//            }
//
//            dispositivo.mostrarEstado();
//            dispositivo.apagar();
//
//            System.out.println("----------------------");
//        }

        Dispositivo Proyector = new Dispositivo("Optoma") {
            @Override
            public void encender() {
                if (getEstado()){
                    System.out.println("El proyector ya está encendido");
            }else {
                    setEstado(true);
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                }
            }
        };

        ControlRemoto proyectorControlRemoto = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        Dispositivo hornoInteligente = new Dispositivo("Horno Inteligente") {
            @Override
            public void encender() {
                if (getEstado()){
                    System.out.println("El horno ya está encendido");
                }else {
                    setEstado(true);
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                }
            }
        };

        listaDispositivos.add(Proyector);
        listaDispositivos.add(hornoInteligente);

        for (Dispositivo dispositivo : listaDispositivos) {
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.getNombre().equals("Optoma")) {
                proyectorControlRemoto.sincronizar();

            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();

            System.out.println("----------------------");
        }

    }

}
