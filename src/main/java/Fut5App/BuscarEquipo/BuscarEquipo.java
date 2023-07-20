package Fut5App.BuscarEquipo;

import Fut5App.Equipo;
import Fut5App.Jugador;

import java.util.*;

import static Fut5App.Menu.equipos;
import static Fut5App.Menu.jugadores;

public class BuscarEquipo implements IBuscarEquipo {

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
    public void buscarEquipoPorNombreYMostarJugadores() {
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
    public void buscarEquipoPorNombreYMostarJugadoresOrdenadosPorNombre() {
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

    public void buscarEquipoPorNombreYMostarJugadoresOrdenadosPorComiseta() {
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



    public void buscarEquipoPorNombreYMostarJugadoresOrdenadosPorCamisetaYPosicion() {
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

}



