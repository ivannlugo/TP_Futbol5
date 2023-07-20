package Fut5App.MostrarJugadores;

import Fut5App.Jugador;

import static Fut5App.Menu.jugadores;

public class MostrarJugadores implements IMostrarJugadores {

    public void mostrarJugadores() {
        System.out.println("Lista de jugadores:");

        if (jugadores.isEmpty()) {
            System.out.println("No se han creado jugadores.");
        } else {
            for (Jugador jugador : jugadores) {
                System.out.println("Nombre: " + jugador.getNombre());
                System.out.println("Equipo: " + jugador.getEquipo());
                System.out.println("Posición: " + jugador.getPosicion());
                System.out.println("Capitan: " + jugador.getEsCapitan());
                System.out.println("----------------------");
            }
        }
    }
}