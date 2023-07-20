package Fut5App.servicios.GestorDatos;

import Fut5App.domain.Jugador;

import java.util.List;

public interface IGestorDatos {
    List<Jugador> importarJugadores();
    void exportarJugadores(List<Jugador> jugadores);
}