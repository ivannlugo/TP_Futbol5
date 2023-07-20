package Fut5App.servicios.GestorDeEquipo;
import Fut5App.domain.Entrenador;
import Fut5App.domain.Equipo;

import java.time.LocalDate;
import java.util.Scanner;

import static Fut5App.Menu.equipos;

public class GestorDeEquipo implements IGestorDeEquipo {

    public static final Scanner scanner = new Scanner(System.in);
    private boolean continuar;
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



    public void eliminarEquipoPorNombre() {
        System.out.println("Ingrese el nombre del equipo que desea eliminar: ");
        String nombreEquipo = scanner.nextLine();

        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                System.out.println("¿Está seguro de que desea eliminar " + nombreEquipo + "?");
                boolean continuar = scanner.nextLine().equalsIgnoreCase("SI");
                if (continuar) {
                    equipos.remove(equipo);
                    System.out.println("Equipo eliminado");
                    return;
                }
            }
        }

        System.out.println("No se encontró ningún equipo");
    }
}
