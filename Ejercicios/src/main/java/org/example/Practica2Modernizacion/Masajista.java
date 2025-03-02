package org.example.Practica2Modernizacion;

public class Masajista extends MutxamelFC {

    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad,String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;
    }

    //Getters y Settersç
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + getNombre() + " está dando un masaje a " + jugador.getNombre());
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El masajista " + getNombre() + " está celebrando un gol");
    }
}
