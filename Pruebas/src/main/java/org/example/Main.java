package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear varios jugadores para el equipo SENIOR
        Jugador jugador1 = new Jugador("Carlos", 25, Equipos.SENIOR, 10, Posiciones.DELANTERO);
        Jugador jugador2 = new Jugador("Miguel", 27, Equipos.SENIOR, 10, Posiciones.CENTROCAMPISTA);
        Jugador jugador3 = new Jugador("Roberto", 22, Equipos.SENIOR, 4, Posiciones.DEFENSA);
        Jugador jugador4 = new Jugador("David", 30, Equipos.SENIOR, 1, Posiciones.PORTERO);

        // Crear al entrenador del equipo SENIOR
        Entrenador entrenador = new Entrenador("Antonio", 45, Equipos.SENIOR, "4-3-3");

        // Crear a los masajistas del club
        Masajista masajista1 = new Masajista("Pedro", 35, "Fisioterapeuta", 10);
        Masajista masajista2 = new Masajista("Laura", 32, "Quiropráctico", 8);

        // Crear a algún acompañante para un par de jugadores
        Acompañante acompanante1 = new Acompañante("Ana", 28, "Hermana");
        Acompañante acompanante2 = new Acompañante("Elena", 25,"Novia");

        System.out.println("\n=== DÍA 1: PREPARACIÓN ===");
        // Concentrarse
        jugador1.concentrarse();
        jugador2.concentrarse();
        jugador3.concentrarse();
        jugador4.concentrarse();
        entrenador.concentrarse();
        masajista1.concentrarse();
        masajista2.concentrarse();

        System.out.println("\n=== DÍA 1: ENTRENAMIENTO ===");
        // Entrenar
        entrenador.entrenar();
        jugador1.entrenar();
        jugador2.entrenar();
        jugador3.entrenar();
        jugador4.entrenar();

        // Dar masaje a algún jugador
        System.out.println("\n=== SESIÓN DE MASAJES ===");
        masajista1.darMasaje(jugador3);

        System.out.println("\n=== DÍA 2: VIAJE A MADRID ===");
        // Viajar a Madrid
        jugador1.viajar("Madrid");
        jugador2.viajar("Madrid");
        jugador3.viajar("Madrid");
        jugador4.viajar("Madrid");
        entrenador.viajar("Madrid");
        masajista1.viajar("Madrid");
        masajista2.viajar("Madrid");
        acompanante1.viajar("Madrid");
        acompanante2.viajar("Madrid");

        System.out.println("\n=== DÍA 3: PREPARACIÓN PARA EL PARTIDO ===");
        // Planificar entrenamiento
        entrenador.planificarEntrenamiento();

        // Entrenar
        entrenador.entrenar();
        jugador1.entrenar();
        jugador2.entrenar();
        jugador3.entrenar();
        jugador4.entrenar();

        // Descansar
        System.out.println("\n=== DESCANSO PREVIO AL PARTIDO ===");
        jugador1.descansar();
        jugador2.descansar();
        jugador3.descansar();
        jugador4.descansar();

        System.out.println("\n=== DÍA 4: DÍA DE PARTIDO ===");
        // Calentar
        jugador1.calentar();
        jugador2.calentar();
        jugador3.calentar();
        jugador4.calentar();

        // Jugar partido
        String rival = "Real Madrid";
        entrenador.jugarPartido(rival);
        jugador1.jugarPartido(rival);
        jugador2.jugarPartido(rival);
        jugador3.jugarPartido(rival);
        jugador4.jugarPartido(rival);

        // Animar equipo
        acompanante1.animarEquipo();
        acompanante2.animarEquipo();

        // Hacer cambios
        entrenador.hacerCambios();

        // Marcar gol
        jugador1.marcarGol();

        // Celebrar gol
        jugador1.celebrarGol();
        jugador2.celebrarGol();
        jugador3.celebrarGol();
        jugador4.celebrarGol();
        entrenador.celebrarGol();
        masajista1.celebrarGol();
        masajista2.celebrarGol();
        acompanante1.celebrarGol();
        acompanante2.celebrarGol();

        System.out.println("\n=== POST PARTIDO ===");
        // Dar masaje a varios jugadores
        masajista1.darMasaje(jugador1);
        masajista2.darMasaje(jugador2);

        System.out.println("\n=== REGRESO A CASA ===");
        // Viajar a Mutxamel
        jugador1.viajar("Mutxamel");
        jugador2.viajar("Mutxamel");
        jugador3.viajar("Mutxamel");
        jugador4.viajar("Mutxamel");
        entrenador.viajar("Mutxamel");
        masajista1.viajar("Mutxamel");
        masajista2.viajar("Mutxamel");
        acompanante1.viajar("Mutxamel");
        acompanante2.viajar("Mutxamel");

        // Descansar
        System.out.println("\n=== DESCANSO FINAL ===");
        jugador1.descansar();
        jugador2.descansar();
        jugador3.descansar();
        jugador4.descansar();
    }
}