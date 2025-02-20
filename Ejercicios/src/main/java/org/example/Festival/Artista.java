package org.example.Festival;

public class Artista extends Persona {

    String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) {
        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género Musical: " + generoMusical);
    }

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como Artista: Preparando el show.");
    }

}
