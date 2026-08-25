package modelo;
import modelo.Jugador;

public class Torneo {
    private Jugador jugadorActivo;


    public Torneo(){
    }
    public void crearNuevoJugador(String nombre, String nickname, int edad){
    }
    public boolean tieneJugadorActivo(){
    }
    public boolean registrarPartida(int puntaje) {
    }
    public boolean modificarPartida(int partida, int puntaje) {}
    public int consultarPuntajePartida(int partida) {}
    public double obtenerPromedio(){}
    public int obtenerMejor(){}
    public int obtenerPeor(){}
    public Jugador getJugadorActivo(){ return jugadorActivo; }
}