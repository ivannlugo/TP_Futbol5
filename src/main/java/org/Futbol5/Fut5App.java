package org.Futbol5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fut5App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Crear equipo");
            System.out.println("2. Buscar jugador por nombre");
            System.out.println("3. Buscar equipo por nombre");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    crearEquipo();
                    break;
                case 2:
                    buscarJugadorPorNombre();
                    break;
                case 3:
                    buscarEquipoPorNombre();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    private static void crearEquipo() {
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        System.out.print("Ingrese la fecha de creación del equipo (formato: AAAA-MM-DD): ");
        LocalDate fechaCreacion = LocalDate.parse(scanner.nextLine());
        System.out.print("Ingrese el nombre del entrenador: ");
        String nombreEntrenador = scanner.nextLine();
        System.out.print("Ingrese el apellido del entrenador: ");
        String apellidoEntrenador = scanner.nextLine();
        System.out.print("Ingrese la edad del entrenador: ");
        int edadEntrenador = scanner.nextInt();
        scanner.nextLine();
        Entrenador entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador, edadEntrenador);
        List<Jugador> jugadores = new ArrayList<>();
        boolean agregarJugadores = true;
        while (agregarJugadores) {
           /* System.out.print("Ingrese el identificador del jugador: ");
            int identificadorJugador = scanner.nextInt();
            scanner.nextLine();*/
            System.out.print("Ingrese el nombre del jugador: ");
            String nombreJugador = scanner.nextLine();
            System.out.print("Ingrese el apellido del jugador: ");
            String apellidoJugador = scanner.nextLine();
            System.out.print("Ingrese la altura del jugador: ");
            double alturaJugador = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Ingrese la posición del jugador: ");
            String posicionJugador = scanner.nextLine();
            System.out.print("Ingrese la cantidad de goles del jugador: ");
            int golesJugador = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese la cantidad de partidos del jugador: ");
            int partidosJugador = scanner.nextInt();
            scanner.nextLine();
            System.out.print("¿Es el jugador capitán? (s/n): ");
            boolean esCapitanJugador = scanner.nextLine().equalsIgnoreCase("s");
            System.out.print("Ingrese el número de camiseta del jugador: ");
            int camisetaJugador = scanner.nextInt();
            scanner.nextLine();
            Jugador jugador = new Jugador(nombreJugador, apellidoJugador, alturaJugador, posicionJugador, golesJugador, partidosJugador, esCapitanJugador, camisetaJugador, null);
            jugadores.add(jugador);
            System.out.print("¿Desea agregar más jugadores? (s/n): ");
            agregarJugadores = scanner.nextLine().equalsIgnoreCase("s");
        }
        Equipo equipo = new Equipo(nombreEquipo, fechaCreacion, jugadores, entrenador);
        for (Jugador jugador : jugadores) {
            jugador.setEquipo(equipo);
        }
        equipos.add(equipo);
    }

    private static void buscarJugadorPorNombre() {
        System.out.print("Ingrese el nombre del jugador a buscar: ");
        String nombreBusqueda = scanner.nextLine();
        for (Equipo equipo : equipos) {
            for (Jugador jugador : equipo.getJugadores()) {
                if (jugador.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                    System.out.println(jugador.getNombre() + " " + jugador.getApellido() + " - Posición: " + jugador.getPosicion() + " - Capitán: " + (jugador.isEsCapitan() ? "Sí" : "No") + " - Equipo: " + jugador.getEquipo().getNombre());
                }
            }
        }
    }

    private static void buscarEquipoPorNombre() {
        System.out.print("Ingrese el nombre del equipo a buscar: ");
        String nombreBusqueda = scanner.nextLine();
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("Nombre del equipo: " + equipo.getNombre());
                System.out.println("Nombre del entrenador: " + equipo.getEntrenador().getNombre() + " " + equipo.getEntrenador().getApellido());
                for (Jugador jugador : equipo.getJugadores()) {
                    if (jugador.isEsCapitan()) {
                        System.out.println("Nombre del capitán: " + jugador.getNombre() + " " + jugador.getApellido());
                        break;
                    }
                }
            }
        }
    }
}
