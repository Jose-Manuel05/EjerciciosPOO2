package org.example;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int aniosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    //region Getters y Setters
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //endregion

    //region Metodos
    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + getNombre() + " está dando un masaje a " + jugador.getNombre());
    }
    //endregion

    //region FuncionesIntegrantes
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
    //endregion

}
