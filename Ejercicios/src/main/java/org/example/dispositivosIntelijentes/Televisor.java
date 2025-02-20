package org.example.dispositivosIntelijentes;

public class Televisor extends Dispositivo implements ControlRemoto {


    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }

    @Override
    public void encender() {
        if (getEstado()){
            System.out.println("El televisor ya está encendido");
        }else {
            setEstado(true);
            System.out.println("Encendiendo el televisor");
        }
    }
}
