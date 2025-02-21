package org.example.Festival;

public class Asistente extends Persona {

    private TipoEntrada entrada; //tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, TipoEntrada entrada) {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como Asistente: Buscando asiento.");
    }

}
