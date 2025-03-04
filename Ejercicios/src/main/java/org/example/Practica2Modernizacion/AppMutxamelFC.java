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

        System.out.println("\n=============================================");

        //Menu de la aplicación
        int opcion;

        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    mantenimientoJugadores(scanner, jugadores);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 'X':
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);

    }

    private static void mostrarMenuPrincipal() {
        System.out.println("--- App de mantenimiento del MUTXAMEL FC ---");
        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("[2]. Mantenimiento de entrenadores");
        System.out.println("[3]. Mantenimiento de masajistas");
        System.out.println("[4]. Consultar equipos");
        System.out.println("[X]. Salir");
        System.out.println("=============================================");
        System.out.print("Selecciona una opción: ");
    }

    private static void mantenimientoJugadores(Scanner scanner, ArrayList<Jugador> jugadores) {
        int opcion;

        do {
            mostrarMenuJugadores();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    anadirJugador(scanner, jugadores);
                    break;
                case 2:
                    modificarJugador(scanner, jugadores);
                    break;
                case 3:
                    crearAcompanante(scanner, jugadores);
                    break;
                case 'X':
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void mostrarMenuJugadores() {
        System.out.println("=== Mantenimiento de Jugadores ===");
        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de jugador existente");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principal");
        System.out.println("===================================");
        System.out.print("Selecciona una opción: ");
    }

    private static void anadirJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Categoría (INFANTIL, BENJAMIN, SENIOR): ");
        String categoria = scanner.nextLine();

        System.out.print("Dorsal: ");
        int dorsal = scanner.nextInt();

        System.out.print("Posición: ");
        String posicion = scanner.nextLine();

        try {
            Jugador jugador = new Jugador(nombre, edad, Equipos.valueOf(categoria.toUpperCase()), dorsal, Posiciones.valueOf(posicion.toUpperCase()));
            jugadores.add(jugador);
            System.out.println("Jugador añadido con éxito.");
        } catch (DorsalDuplicadoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void modificarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores para modificar.");
            return;
        }

        System.out.println("=== Lista de Jugadores ===");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("[" + i + "] " + jugadores.get(i));
        }
        System.out.print("Selecciona un jugador para modificar --> ");
        int indice = scanner.nextInt();

        if (indice < 0 || indice >= jugadores.size()) {
            System.out.println("Índice no válido.");
            return;
        }

        Jugador jugador = jugadores.get(indice);
        System.out.println("Modificando jugador: " + jugador);
        System.out.print("¿Qué quieres modificar? [nombre,edad,categoría,dorsal,posicion]: ");
        String campo = scanner.nextLine();

        switch (campo.toLowerCase()) {
            case "nombre":
                System.out.print("Nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                jugador.setNombre(nuevoNombre);
                break;
            case "edad":
                System.out.print("Nueva edad: ");
                int nuevaEdad = scanner.nextInt();
                jugador.setEdad(nuevaEdad);
                break;
            case "categoría":
                System.out.print("Nueva categoría (INFANTIL, BENJAMIN, SENIOR): ");
                String nuevaCategoria = scanner.nextLine();
                jugador.setCategoria(Equipos.valueOf(nuevaCategoria));
                break;
            case "dorsal":
                System.out.print("Nuevo dorsal: ");
                int nuevoDorsal = scanner.nextInt();
                try {
                    jugador.setDorsal(nuevoDorsal);
                } catch (DorsalDuplicadoException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "posicion":
                System.out.print("Nueva posición: ");
                String nuevaPosicion = scanner.nextLine();
                jugador.setPosicion(Posiciones.valueOf(nuevaPosicion));
                break;
            default:
                System.out.println("Campo no válido.");
        }
    }

    private static void crearAcompanante(Scanner scanner, ArrayList<Jugador> jugadores) {
        ArrayList<Jugador> jugadoresSenior = new ArrayList<>();
        for (Jugador jugador : jugadores) {
            if (jugador.getCategoria() == Equipos.SENIOR) {
                jugadoresSenior.add(jugador);
            }
        }

        if (jugadoresSenior.isEmpty()) {
            System.out.println("No hay jugadores SENIOR para asignar acompañantes.");
            return;
        }

        System.out.println("Lista de Jugadores SENIOR");
        for (int i = 0; i < jugadoresSenior.size(); i++) {
            System.out.println("[" + i + "] " + jugadoresSenior.get(i));
        }
        System.out.print("Selecciona un jugador para asignar un acompañante --> ");
        int indice = scanner.nextInt();

        if (indice < 0 || indice >= jugadoresSenior.size()) {
            System.out.println("Índice no válido.");
            return;
        }

        Jugador jugadorSeleccionado = jugadoresSenior.get(indice);

        System.out.print("Nombre del acompañante: ");
        String nombreAcompanante = scanner.nextLine();
        System.out.print("Edad del acompañante: ");
        int edadAcompanante = scanner.nextInt();
        System.out.print("Relación con el jugador (ej: Esposa, Hermano, Amigo): ");
        String relacion = scanner.nextLine();

        Acompañante acompañante = new Acompañante(nombreAcompanante, edadAcompanante, jugadorSeleccionado, relacion);
        System.out.println("Acompañante creado con éxito: " + acompañante);
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