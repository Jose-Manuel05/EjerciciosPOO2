package org.example.Practica2Modernizacion;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad,Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
        FormacionPreferida(formacionPreferida);
    }

    public void FormacionPreferida(String formacionPreferida) {
        if (!formacionPreferida.matches("\\d-\\d-\\d")) {
            throw new FormacionInvalidaException();
        }
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador " + getNombre() + " está planificando el entrenamiento");
    }

    public void hacerCambios(){
        System.out.println("El entrenador " + getNombre() + " está haciendo cambios");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + getNombre() + " está entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador " + getNombre() + " está jugando un partido contra " + rival);
    }

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
}
