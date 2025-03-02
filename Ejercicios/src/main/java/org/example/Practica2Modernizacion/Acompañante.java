package org.example.Practica2Modernizacion;

public class Acompañante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad,Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    //Getters y Setters
    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println("El acompañante " + getNombre() + " está animando a " + integrante.getNombre());
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + getNombre() + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El acompañante " + getNombre() + " está celebrando un gol");
    }
}
