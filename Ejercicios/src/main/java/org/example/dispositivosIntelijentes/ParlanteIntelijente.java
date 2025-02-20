package org.example.dispositivosIntelijentes;

public class ParlanteIntelijente extends Dispositivo{
    public ParlanteIntelijente(String nombre) {
        super(nombre);
    }


    @Override
    public void encender() {
        if (getEstado()) {
            System.out.println("El parlante ya está encendido.");
        } else {
            setEstado(true);
            System.out.println("El parlante se ha encendido.");
        }
    }
}
