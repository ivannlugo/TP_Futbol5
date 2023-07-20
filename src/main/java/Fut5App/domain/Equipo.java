package Fut5App.domain;

import java.time.LocalDate;

public class Equipo {

    private String nombre;
    private LocalDate fechaFundacion;
    private Entrenador entrenador;
    private String capitan;

    public Equipo(String nombre, LocalDate fechaFundacion,Entrenador entrenador) {

        this.setNombre(nombre);
        this.setEntrenador(entrenador);
        this.setFechaFundacion(fechaFundacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    @Override
    public String toString() {
        return    "nombre='" + nombre + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", entrenador=" + entrenador +
                ", capitan='" + capitan + '\'' +
                '}';
    }
}

