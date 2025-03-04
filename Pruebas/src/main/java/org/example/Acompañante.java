package org.example;

public class Acompañante extends MutxamelFC{
    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, String parentesco) {
        super(nombre, edad);
        this.parentesco = parentesco;
    }

    //region Getters y Setters
    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    //endregion

    //region Metodos
    public void animarEquipo(){

    }
    //endregion

    //region FuncionesIntegrantes
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
    //endregion


}
