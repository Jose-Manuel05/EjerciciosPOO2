package org.example.Practica2Modernizacion;

import java.util.ArrayList;

public class AppMutxamelFC {

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();

        // crear varios jugadores para el equipo SENIOR
        Jugador jugador1 = new Jugador("Carlos", 25, Equipos.SENIOR, 5, Posiciones.DEFENSA);
        Jugador jugador2 = new Jugador("David", 24, Equipos.SENIOR, 10, Posiciones.CENTROCAMPISTA);

        jugadores.add(jugador1);
        jugadores.add(jugador2);

        comprobarDorsales(jugadores);

        // crear al entrenador del equipo SENIOR
        Entrenador entrenador = new Entrenador("Juan", 45, Equipos.SENIOR, "4-4-2");
        // crear a los masajistas del club
        Masajista masajista1 = new Masajista("Ana", 35, "Fisioterapia", 10);
        Masajista masajista2 = new Masajista("Marta", 40, "Osteopatía", 15);
        // crear a algún acompañante para un par de jugadores
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

    private static void comprobarDorsales(ArrayList<Jugador> jugadores) {
        for (int i = 0; i < jugadores.size(); i++) {
            int dorsalActual = jugadores.get(i).getDorsal();

            for (int j = i + 1; j < jugadores.size(); j++) {
                int dorsalComparar = jugadores.get(j).getDorsal();

                if (dorsalActual == dorsalComparar) {
                    throw new DorsalDuplicadoException();
                }
            }
        }
    }

}
