package Fut5App.GestorDatos;

import Fut5App.Jugador;

import java.util.List;

public interface IGestorDatos {
    List<Jugador> importarJugadores();
    void exportarJugadores(List<Jugador> jugadores);
}