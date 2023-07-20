package Fut5App.QuitarEquipo;

import Fut5App.Equipo;

import java.util.Scanner;

import static Fut5App.Menu.equipos;

public class EliminarEquipoPorNombre implements IEliminarEquipo {
    public static final Scanner scanner = new Scanner(System.in);
    private boolean continuar;

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