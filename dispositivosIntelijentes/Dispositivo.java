package org.example.dispositivosIntelijentes;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado; //encender/apagar

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void encender();

    public void apagar() {

        if (estado) {
            estado = false;
            System.out.println("El dispositivo " + nombre + " se ha apagado");
        }else {
            System.out.println("El dispositivo " + nombre + " ya está apagado");
        }

    }

    public void mostrarEstado() {

        if (estado) {
            System.out.println("El dispositivo " + nombre + " está encendido");
        }else {
            System.out.println("El dispositivo " + nombre + " está apagado");
        }

    }

}
