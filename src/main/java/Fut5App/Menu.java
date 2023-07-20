package Fut5App;

import Fut5App.servicios.GestorDeBusqueda.GestorDeBusqueda;
import Fut5App.servicios.GestorDeBusqueda.IGestorDeBusqueda;
import Fut5App.servicios.GestorDeEquipo.GestorDeEquipo;
import Fut5App.servicios.GestorDeEquipo.IGestorDeEquipo;
import Fut5App.servicios.GestorDeJugadores.GestorDeJugadores;
import Fut5App.servicios.GestorDatos.GestorDatos;
import Fut5App.servicios.GestorDatos.IGestorDatos;
import Fut5App.servicios.GestorDeVisualizacion.IGestorDeVisualizacion;
import Fut5App.servicios.GestorDeVisualizacion.GestorDeVisualizacion;
import Fut5App.domain.Equipo;
import Fut5App.domain.Jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {

    public static List<Jugador> jugadores = new ArrayList<>();
    public static List<Equipo> equipos = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

public void menu(){

    boolean salir = false;


        while (!salir) {
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear equipo");
        System.out.println("2. Buscar jugador por nombre");
        System.out.println("3. Mostrar lista de jugadores");
        System.out.println("4. Buscar equipo ");
        System.out.println("5. Quitar equipo por nombre");
        System.out.println("6. Importar Jugadores");
        System.out.println("7. Exportar Jugadores");
        System.out.println("8. Salir");

        System.out.print("Ingrese una opción: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {

            case 1:
                IGestorDeEquipo crearEquipo = new GestorDeEquipo();
                GestorDeJugadores crearJugador= new GestorDeJugadores();
                Equipo equipo =  crearEquipo.crearEquipo();
                boolean agregarJugadores = true;
                while(agregarJugadores) {
                Jugador jugador = crearJugador.crearJugador();
                jugador.setEquipo(equipo.getNombre());
                    jugadores.add(jugador);
                    equipos.add(equipo);

                    if (jugador.getEsCapitan()) {
                        equipo.setCapitan(jugador.getNombre() + " " + jugador.getApellido());
                    }
                    System.out.println("Jugador creado exitosamente");
                    System.out.println("¿Desea agregar otro jugador?  (SI/NO)");
                    agregarJugadores = scanner.nextLine().equalsIgnoreCase("si");
                }
                break;
            case 2:
                IGestorDeBusqueda buscarJugadorPorNombre = new GestorDeBusqueda();
                buscarJugadorPorNombre.buscarJugadorPorNombre();

                break;
            case 3:
                IGestorDeVisualizacion mostrarJugadores = new GestorDeVisualizacion();
                mostrarJugadores.mostrarJugadores();
                break;
            case 4:
                System.out.println( "1. Buscar equipo por nombre");
                System.out.println("2. Buscar equipo por nombre y mostrar lista de jugadores");
                System.out.println("3. Buscar equipo por nombre y mostrar lista de jugadores ordenados por Nombre");
                System.out.println("4. Buscar equipo por nombre y mostrar lista de jugadores ordenados por Camiseta");
                System.out.println("5. Buscar equipo por nombre y mostrar lista de jugadores ordenados por camiseta y Posicion ");
                System.out.print("Ingrese una opción: ");
                int option1 = scanner.nextInt();
                scanner.nextLine();
                switch (option1){
                    case 1:
                        IGestorDeBusqueda buscarEquipo = new GestorDeBusqueda();
                        buscarEquipo.buscarEquipoPorNombre();
                        break;
                    case 2:
                        IGestorDeBusqueda buscarEquipo1 = new GestorDeBusqueda();
                        buscarEquipo1.buscarEquipoPorNombreYMostrarJugadores();
                        break;
                    case 3:
                        IGestorDeBusqueda buscarEquipo2 = new GestorDeBusqueda();
                        buscarEquipo2.buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorNombre();
                        break;
                    case 4:
                        IGestorDeBusqueda buscarEquipo3 = new GestorDeBusqueda();
                        buscarEquipo3.buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorComiseta();
                        break;
                    case 5:
                        IGestorDeBusqueda buscarEquipo4 = new GestorDeBusqueda();
                        buscarEquipo4.buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorCamisetaYPosicion();
                        break;

                }


                break;

            case 5:
                IGestorDeEquipo GestorDeEquipo  = new GestorDeEquipo();
                GestorDeEquipo.eliminarEquipoPorNombre();
                break;
            case 6:
                 IGestorDatos importador = new GestorDatos();
                List<Jugador> jugadoresImp = importador.importarJugadores();
                if (jugadoresImp != null) {
                    System.out.println("Jugadores importados:");
                    jugadores.addAll(jugadoresImp);
                }
                break;
            case 7:
                IGestorDatos exportador = new GestorDatos();
                exportador.exportarJugadores( jugadores);
                break;
            case 8:
                salir = true;
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}

}
