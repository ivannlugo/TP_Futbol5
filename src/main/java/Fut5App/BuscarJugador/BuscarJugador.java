package Fut5App.BuscarJugador;

import Fut5App.Jugador;

import java.util.Scanner;

import static Fut5App.Menu.jugadores;

public class BuscarJugador implements IBuscarJugador {
    public static final Scanner scanner = new Scanner(System.in);

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