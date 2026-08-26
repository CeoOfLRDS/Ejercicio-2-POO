package modelo;
import modelo.Jugador;

public class Torneo {
    private Jugador jugadorActivo;


    public Torneo(){
        this.jugadorActivo = null;
    }
    public void crearNuevoJugador(String nombre, String nickname, int edad){
        this.jugadorActivo = new Jugador(nombre, nickname, edad);
    }
    public boolean tieneJugadorActivo(){
        return this.jugadorActivo != null;
    }
    public boolean registrarPartida(int puntaje) {
        if (tieneJugadorActivo()) {
            return this.jugadorActivo.obtenerPuntaje(partida);
        }
    }
    public boolean modificarPartida(int partida, int puntaje) {
        if (tieneJugadorActivo()) {
            return this.jugadorActivo.modificarPuntaje(partida, puntaje);
        }
        return false;
    }
    public int consultarPuntajePartida(int partida) {
        if (tieneJugadorActivo()) {
            return this.jugadorActivo.obtenerPuntaje(partida);
        }
        return -1;
    }
    public double obtenerPromedio(){
        if (tieneJugadorActivo()) {
            return this.jugadorActivo.calcularPromedio();
        }
        return 0.0;
    }
    public int obtenerMejor(){
        if (tieneJugadorActivo()){
            return this.jugadorActivo.obtenerMejorPuntaje();
        }
        return -1;
    }
    public int obtenerPeor(){
        if (tieneJugadorActivo()){
            return this.jugadorActivo.obtenerPeorPuntaje();
        }
        return -1;
    }
    public Jugador getJugadorActivo(){
        return jugadorActivo;
    }
}

