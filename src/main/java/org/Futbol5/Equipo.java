package org.Futbol5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Equipo {
    private String nombre;
    private LocalDate fechaCreacion;
    private List<Jugador> jugadores;
    private Entrenador entrenador;
    // constructor, getters y setter


    public Equipo(String nombre, LocalDate fechaDeCreacion, List<Jugador> jugadores, Entrenador entrenador) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
}
