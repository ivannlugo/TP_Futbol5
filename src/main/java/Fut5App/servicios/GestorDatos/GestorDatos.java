package Fut5App.servicios.GestorDatos;

import Fut5App.domain.Jugador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class GestorDatos implements IGestorDatos {
    public static final Scanner scanner = new Scanner(System.in);


    public List<Jugador> importarJugadores() {
        System.out.println("Ingrese la ubicación del archivo: ");
       String ubicacionArchivo = scanner.nextLine();
        List<Jugador> jugadores = new ArrayList<>();
        try {
            File archivo = new File(ubicacionArchivo);
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(",");
                if (datos.length == 9) {
                    UUID id = UUID.randomUUID();
                    String nombre = datos[0].trim();
                    String apellido = datos[1].trim();
                    double altura = Double.parseDouble(datos[2].trim());
                    String posicion = datos[3].trim();
                    int goles = Integer.parseInt(datos[4].trim());
                    int partidos = Integer.parseInt(datos[5].trim());
                    boolean esCapitan = Boolean.parseBoolean(datos[6].trim());
                    int numeroCamiseta = Integer.parseInt(datos[7].trim());
                    String equipo = datos[8].trim();

                    Jugador jugador = new Jugador(id, nombre, apellido, altura, posicion, goles, partidos, esCapitan, numeroCamiseta, equipo);
                    jugadores.add(jugador);
                }
                else { System.out.println("La lista de jugadores no es correcta"); }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            return null;
        }
        return jugadores ;
    }

    public void exportarJugadores(List<Jugador> jugadores) {
        System.out.println("Ingrese la ubicacion del archivo de exportación: ");
        String ubicacionArchivo = scanner.nextLine() ;
        try (PrintWriter writer = new PrintWriter(new FileWriter(ubicacionArchivo))) {
            for (Jugador jugador : jugadores) {
                String linea = jugador.getNombre() + "," + jugador.getApellido() + "," +
                        jugador.getAltura() + "," + jugador.getPosicion() + "," +
                        jugador.getGoles() + "," + jugador.getPartidos() + "," +
                        jugador.getEsCapitan() + "," + jugador.getNumeroCamiseta() + "," +
                        jugador.getEquipo();
                writer.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al exportar jugadores: " + e.getMessage());
        }
    }
}