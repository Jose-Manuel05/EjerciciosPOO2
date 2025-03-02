package org.example.Practica2Modernizacion;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMutxamelFC {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();

        // Crear varios jugadores para el equipo SENIOR
        Jugador jugador1 = new Jugador("Jugador1", 25, Equipos.SENIOR, 10, Posiciones.DELANTERO);
        Jugador jugador2 = new Jugador("Jugador2", 27, Equipos.SENIOR, 12, Posiciones.DEFENSA);
        Jugador jugador3 = new Jugador("Jugador3", 22, Equipos.ALEVÍN, 11, Posiciones.PORTERO);

        // Agregar los jugadores al equipo mas comprobación de dorsal duplicado
        try {
            agregarJugador(jugadores, jugador1);
            agregarJugador(jugadores, jugador2);
            agregarJugador(jugadores, jugador3);
        } catch (DorsalDuplicadoException e) {
            throw new DorsalDuplicadoException();
        }

        // Crear al entrenador del equipo SENIOR
        Entrenador entrenador = new Entrenador("Juan", 45, Equipos.SENIOR, "4-4-2");
        // Crear a los masajistas del club
        Masajista masajista1 = new Masajista("Ana", 35, "Fisioterapia", 10);
        Masajista masajista2 = new Masajista("Marta", 40, "Osteopatía", 15);
        // Crear a algún acompañante para un par de jugadores
        Acompañante acompañante1 = new Acompañante("Laura", 27, jugador1, "Esposa");
        Acompañante acompañante2 = new Acompañante("Sofia", 29, jugador2, "Hermana");

        // concentrarse()
        jugador1.concentrarse();
        jugador2.concentrarse();
        entrenador.concentrarse();
        masajista1.concentrarse();
        masajista2.concentrarse();
        acompañante1.concentrarse();
        acompañante2.concentrarse();
        // entrenar()
        jugador1.entrenar();
        entrenador.entrenar();
        // darMasaje() a algún jugador
        masajista1.darMasaje(jugador1);
        // viajar() a Madrid
        jugador1.viajar("Madrid");
        entrenador.viajar("Madrid");
        masajista1.viajar("Madrid");
        // planificarEntrenamiento()
        entrenador.planificarEntrenamiento();
        // entrenar()
        jugador1.entrenar();
        entrenador.entrenar();
        // descansar()
        jugador1.descansar();
        // calentar()
        jugador1.calentar();
        // jugarPartido()
        jugador1.jugarPartido("Elche");
        entrenador.jugarPartido("Elche");
        // animarEquipo()
        acompañante1.animarEquipo();
        // hacerCambios()
        entrenador.hacerCambios();
        // marcarGol()
        jugador1.marcarGol();
        // celebrarGol()
        jugador1.celebrarGol();
        entrenador.celebrarGol();
        acompañante1.celebrarGol();
        // darMasaje() a varios jugadores
        masajista1.darMasaje(jugador1);
        masajista2.darMasaje(jugador2);
        // viajar() a Mutxamel
        jugador1.viajar("Mutxamel");
        entrenador.viajar("Mutxamel");
        masajista1.viajar("Mutxamel");
        // descansar()
        jugador1.descansar();

    }

    private static void agregarJugador(ArrayList<Jugador> jugadores, Jugador jugador) {
        for (Jugador j : jugadores) {
            if (j.getDorsal() == jugador.getDorsal()) {
                throw new DorsalDuplicadoException();
            }
        }
        jugadores.add(jugador);
    }



}