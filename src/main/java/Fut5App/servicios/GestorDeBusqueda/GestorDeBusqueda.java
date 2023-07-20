package Fut5App.servicios.GestorDeBusqueda;

import Fut5App.domain.Equipo;
import Fut5App.domain.Jugador;

import java.util.*;

import static Fut5App.Menu.equipos;
import static Fut5App.Menu.jugadores;

public class GestorDeBusqueda implements IGestorDeBusqueda {

    public static final Scanner scanner = new Scanner(System.in);


    public void buscarEquipoPorNombre(){
    System.out.println("Ingrese el nombre del equipo que desea buscar: ");
    String nombreEquipo = scanner.nextLine();

        for (Equipo equipo: equipos) {
        if ( equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
            System.out.println("Equipo encontrado: " +  equipo);
            return;
        }
    }
    }

    public void buscarEquipoPorNombreYMostrarJugadores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo que desea buscar: ");
        String nombreEquipo = scanner.nextLine();
        boolean equipoEncontrado = false;
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                System.out.println("Nombre del equipo: " + equipo.getNombre());
                System.out.println("Nombre del entrenador: " + equipo.getEntrenador());
                System.out.println("Jugadores del equipo: ");
                List<Jugador> jugadoresEquipo = new ArrayList<>();
                for (Jugador jugador : jugadores) {
                    if (jugador.getEquipo().equalsIgnoreCase(nombreEquipo)) {
                        jugadoresEquipo.add(jugador);
                    }
                }
                for (Jugador jugadorEquipo : jugadoresEquipo) {
                    System.out.println(jugadorEquipo);
                }
                equipoEncontrado = true;
                break;
            }
        }
        if (!equipoEncontrado) {
            System.out.println("No se encontró un equipo con ese nombre.");
        }
    }



    public void buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorNombre() {
        System.out.println("Ingrese el nombre del equipo que desea buscar: ");
        String nombreEquipo = scanner.nextLine();

        boolean equipoEncontrado = false;
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                System.out.println("Nombre del equipo: " + equipo.getNombre());
                System.out.println("Nombre del entrenador: " + equipo.getNombre());
                System.out.println("Jugadores del equipo: ");

                List<Jugador> jugadoresEquipo = new ArrayList<>();
                for (Jugador jugador : jugadores) {
                    if (jugador.getEquipo().equalsIgnoreCase(nombreEquipo)) {
                        jugadoresEquipo.add(jugador);
                    }
                }

                Collections.sort(jugadoresEquipo, Comparator.comparing(Jugador::getNombre));

                for (Jugador jugador : jugadoresEquipo) {
                    System.out.println(jugador);
                }

                equipoEncontrado = true;
                break;
            }
        }

        if (!equipoEncontrado) {
            System.out.println("No se encontró ningún equipo con ese nombre.");
        }
    }



    public void buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorComiseta() {
        System.out.println("Ingrese el nombre del equipo que desea buscar: ");
        String nombreEquipo = scanner.nextLine();

        boolean equipoEncontrado = false;
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                System.out.println("Nombre del equipo: " + equipo.getNombre());
                System.out.println("Nombre del entrenador: " + equipo.getEntrenador());
                System.out.println("Jugadores del equipo: ");

                List<Jugador> jugadoresEquipo = new ArrayList<>();
                for (Jugador jugador : jugadores) {
                    if (jugador.getEquipo().equalsIgnoreCase(nombreEquipo)) {
                        jugadoresEquipo.add(jugador);
                    }
                }

                Collections.sort(jugadoresEquipo, Comparator.comparing(Jugador::getNumeroCamiseta));

                for (Jugador jugador : jugadoresEquipo) {
                    System.out.println(jugador);
                }

                equipoEncontrado = true;
                break;
            }
        }

        if (!equipoEncontrado) {
            System.out.println("No se encontró ningún equipo con ese nombre.");
        }
    }




    public void buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorCamisetaYPosicion() {
        System.out.println("Ingrese el nombre del equipo que desea buscar: ");
        String nombreEquipo = scanner.nextLine();

        boolean equipoEncontrado = false;
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                System.out.println("Nombre del equipo: " + equipo.getNombre());
                System.out.println("Nombre del entrenador: " + equipo.getEntrenador());
                System.out.println("Jugadores del equipo ordenados por número de camiseta y posición:");

                List<Jugador> jugadoresEquipo = new ArrayList<>();
                for (Jugador jugador : jugadores) {
                    if (jugador.getEquipo().equalsIgnoreCase(nombreEquipo)) {
                        jugadoresEquipo.add(jugador);
                    }
                }

                Collections.sort(jugadoresEquipo, Comparator.comparing(Jugador::getPosicion).thenComparing(Jugador::getNumeroCamiseta));

                for (Jugador jugador : jugadoresEquipo) {
                    System.out.println(jugador);
                }

                equipoEncontrado = true;
                break;
            }
        }

        if (!equipoEncontrado) {
            System.out.println("No se encontró ningún equipo con ese nombre.");
        }
    }




    public void buscarJugadorPorNombre() {


            System.out.println("Ingrese el nombre del jugador que desea buscar: ");
            String nombreJugador = scanner.nextLine();

            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nombreJugador)) {
                    System.out.println("Jugador encontrado: " + jugador);
                    return;
                }

            }
        }



}



