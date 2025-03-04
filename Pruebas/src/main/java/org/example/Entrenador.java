package org.example;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private Equipos equipo;
    private String formacionPreferida = "4-3-3";

    public Entrenador(String nombre, int edad, Equipos equipo, String fromacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = fromacionPreferida;
    }

    //region Getters y Setters
    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if (formacionPreferida.matches("\\d-\\d-\\d")){
            this.formacionPreferida = formacionPreferida;
        } else {
            throw new FormacionInvalidaException();
        }
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    //endregion

    //region Metodos
    public void planificarEntrenamiento(){
        System.out.println("El entrenador " + getNombre() + " está planificando el entrenamiento.");
    }

    public void hacerCambios(){
        System.out.println("El entrenador " + getNombre() + " está haciendo cambios en el equipo.");
    }
    //endregion

    //region FuncionesIntegrantes + AccionesDeportivas
    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + getNombre() + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El entrenador " + getNombre() + " está celebrando un gol");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + getNombre() + " está entrenando al equipo");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador " + getNombre() + " está jugando un partido contra " + rival);
    }
    //endregion
}
