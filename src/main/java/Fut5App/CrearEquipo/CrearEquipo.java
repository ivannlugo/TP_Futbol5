package Fut5App.CrearEquipo;
import Fut5App.Entrenador;
import Fut5App.Equipo;

import java.time.LocalDate;
import java.util.Scanner;

public class CrearEquipo implements ICrearEquipo {

    public static final Scanner scanner = new Scanner(System.in);

    public Equipo crearEquipo(){
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        System.out.print("Ingrese la fecha de creación del equipo (formato: AAAA-MM-DD): ");
        LocalDate fechaCreacion = LocalDate.parse(scanner.nextLine());
         System.out.print("Ingrese el nombre del entrenador: ");
        String nombreEntrenador = scanner.nextLine();
        System.out.print("Ingrese el apellido del entrenador: ");
        String apellidoEntrenador = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edadEntrenador = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la nacionalidad del entrenador: ");
        String nacionalidadEntrenador = scanner.nextLine();

        Entrenador entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador, edadEntrenador, nacionalidadEntrenador);
        Equipo equipo = new Equipo(nombreEquipo, fechaCreacion, entrenador);
        return  equipo;
            }

}
