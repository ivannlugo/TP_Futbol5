package Fut5App.CrearJugador;

import Fut5App.Jugador;

import java.util.Scanner;
import java.util.UUID;

public class CrearJugadores implements ICrearJugadores {

    public static final Scanner scanner = new Scanner(System.in);

    public Jugador crearJugador(){
    System.out.println("Ingrese el nombre del jugador: ");
    String nombreJugador = scanner.nextLine();
    System.out.print("Ingrese el apellido del jugador: ");
    String apellidoJugador = scanner.nextLine();
    System.out.print("Ingrese la altura del jugador: (En cm) ");
    double alturaJugador = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Seleccione la posicion del jugador: ");
    System.out.println("1 - Arquero");
    System.out.println("2 - Defensor ");
    System.out.println("3 - Mediocampista ");
    System.out.println("4 - Delantero");
    int opcion = scanner.nextInt();

    scanner.nextLine();
    String posicion = "";
    switch (opcion){
        case 1:
             posicion = "Arquero";
            break;
        case 2:
             posicion = "Defensor";
            break;
        case 3:
             posicion = "Mediocampista";
            break;
        case 4:
             posicion = "Delantero";
            break;
    }
    System.out.print("Ingrese la cantidad de partidos del jugador: ");
    int partidosJugador = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese la cantidad de goles del jugador: ");
    int golesJugador = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Es el jugador capitan? (SI/NO): ");
    boolean esCapitan = scanner.nextLine().equalsIgnoreCase("SI");
    System.out.print("Ingrese el número de camiseta del jugador: ");
    int camisetaJugador = scanner.nextInt();
    scanner.nextLine();
     UUID id = UUID.randomUUID();

        Jugador jugador = new Jugador(id, nombreJugador,apellidoJugador,alturaJugador,posicion,golesJugador,partidosJugador,esCapitan,camisetaJugador,null);
    return jugador;
    }


}
