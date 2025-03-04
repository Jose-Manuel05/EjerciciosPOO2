package org.example;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    private static List<Integer> dorsalesAsignados ;

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;
        dorsalesAsignados = new ArrayList<>();
    }

    //region Getters y Setters
    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria, int dorsal) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsalesAsignados.contains(dorsal)){
            throw new DorsalDuplciadoException();
        }

        this.dorsal = dorsal;
        dorsalesAsignados.add(dorsal);

    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    //endregion

    //region Metodos
    public void calentar(){
        System.out.println("El jugador " + getNombre() + " está calentando");
    }

    public void descansar(){
        System.out.println("El jugador " + getNombre() + " está descansando");
    }

    public void marcarGol(){
        System.out.println("El jugador " + getNombre() + " ha marcado un gol");
    }


    //endregion

    //region FuncionesIntegrantes + AccionesDeportivas
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

    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " está entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " está jugando un partido contra " + rival);
    }
    //endregion
}
