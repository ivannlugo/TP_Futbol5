package Fut5App;

import Fut5App.BuscarEquipo.BuscarEquipo;
import Fut5App.BuscarEquipo.IBuscarEquipo;
import Fut5App.BuscarJugador.BuscarJugador;
import Fut5App.BuscarJugador.IBuscarJugador;
import Fut5App.CrearEquipo.CrearEquipo;
import Fut5App.CrearEquipo.ICrearEquipo;
import Fut5App.CrearJugador.CrearJugadores;
import Fut5App.GestorDatos.GestorDatos;
import Fut5App.GestorDatos.IGestorDatos;
import Fut5App.MostrarJugadores.IMostrarJugadores;
import Fut5App.MostrarJugadores.MostrarJugadores;
import Fut5App.QuitarEquipo.EliminarEquipoPorNombre;
import Fut5App.QuitarEquipo.IEliminarEquipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {

    public static List<Jugador> jugadores = new ArrayList<>();
    public static List<Equipo> equipos = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

public void menu(){

    boolean salir = false;
    String ubicacionArchivo;

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
                ICrearEquipo crearEquipo = new CrearEquipo();
                CrearJugadores crearJugador= new CrearJugadores();
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
                IBuscarJugador buscarJugadorPorNombre = new BuscarJugador();
                buscarJugadorPorNombre.buscarJugadorPorNombre();

                break;
            case 3:
                IMostrarJugadores mostrarJugadores = new MostrarJugadores();
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
                        IBuscarEquipo buscarEquipo = new BuscarEquipo();
                        buscarEquipo.buscarEquipoPorNombre();
                        break;
                    case 2:
                        IBuscarEquipo buscarEquipo1 = new BuscarEquipo();
                        buscarEquipo1.buscarEquipoPorNombreYMostarJugadores();
                        break;
                    case 3:
                        IBuscarEquipo buscarEquipo2 = new BuscarEquipo();
                        buscarEquipo2.buscarEquipoPorNombreYMostarJugadoresOrdenadosPorNombre();
                        break;
                    case 4:
                        IBuscarEquipo buscarEquipo3 = new BuscarEquipo();
                        buscarEquipo3.buscarEquipoPorNombreYMostarJugadoresOrdenadosPorComiseta();
                        break;
                    case 5:
                        IBuscarEquipo buscarEquipo4 = new BuscarEquipo();
                        buscarEquipo4.buscarEquipoPorNombreYMostarJugadoresOrdenadosPorCamisetaYPosicion();
                        break;

                }


                break;

            case 5:
                IEliminarEquipo eliminarEquipo = new EliminarEquipoPorNombre();
                   eliminarEquipo.eliminarEquipoPorNombre();
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
