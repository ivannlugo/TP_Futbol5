package Fut5App;

import java.util.UUID;

public class Jugador {
    private UUID id;
    private String nombre;
    private String apellido;
    private double altura;
    private String posicion;
    private int goles;
    private int partidos;
    private boolean esCapitan;
    private int numeroCamiseta;
    private String equipo;
    public Jugador(String nombre, String posicion) {
        this.setNombre(nombre) ;
        this.setEquipo(posicion);
    }
    public Jugador(String nombre,String posicion, String equipo ,boolean esCapitan) {
        this.setNombre(nombre) ;
        this.setEquipo(equipo);
        this.setPosicion(posicion);
        this.setEsCapitan(esCapitan);
    }

    public Jugador(UUID id,String nombre, String apellido, double altura, String posicion, int goles, int partidos, boolean esCapitan, int numeroCamiseta, String equipo) {
         this.setId(id);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setAltura(altura);
        this.setPosicion(posicion);
        this.setGoles(goles);
        this.setPartidos(partidos);
        this.setEsCapitan( esCapitan);
        this.setNumeroCamiseta(numeroCamiseta);
        this.setEquipo(equipo);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return    "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura=" + altura +
                ", posicion='" + posicion + '\'' +
                ", goles=" + goles +
                ", partidos=" + partidos +
                ", esCapitan=" + esCapitan +
                ", numeroCamiseta=" + numeroCamiseta +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}