package org.example.dispositivosIntelijentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{
    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }

    @Override
    public void encender() {
        if (getEstado()) {
            System.out.println("El aire acondicionado ya está encendido.");
        } else {
            setEstado(true);
            System.out.println("El aire acondicionado se ha encendido.");
        }
    }
}
