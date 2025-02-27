package org.example.Practica2Modernizacion;

public class Jugador extends MutxamelFC implements AccionesDeportivas {

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;

    }

    //region Getters y Setters

    private Equipos getCategoria() {
        return categoria;
    }

    private void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    int getDorsal() {
        return dorsal;
    }

    private void setDorsal(int dorsal) {
        if (this.dorsal == dorsal){
            throw new DorsalDuplicadoException();
        }
        this.dorsal = dorsal;
    }

    //endregion

    public void calentar() {
        System.out.println("El jugador " + getNombre() + " está calentando");
    }

    public void descansar() {
        System.out.println("El jugador " + getNombre() + " está descansando");
    }

    public void marcarGol() {
        System.out.println("El jugador " + getNombre() + " ha marcado un gol");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " está entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " está jugando un partido contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El jugador " + getNombre() + " está celebrando un gol");
    }
}
