package org.example.Festival;

public class Organizador extends Persona implements Organizable {

    private String rol;
    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol = rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + rol);
    }

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como Organizador: Coordinando el evento.");
    }

    public void organizarEvento() {
        System.out.println("Organizando el evento.");
    }
}
