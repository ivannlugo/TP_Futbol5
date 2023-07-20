package Fut5App.servicios.GestorDeBusqueda;

public interface IGestorDeBusqueda {

    void buscarEquipoPorNombre();
    void buscarEquipoPorNombreYMostrarJugadores();

    void buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorNombre();
    void buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorComiseta();
    void buscarEquipoPorNombreYMostrarJugadoresOrdenadosPorCamisetaYPosicion();
    void buscarJugadorPorNombre();

}
