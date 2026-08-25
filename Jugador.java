public class Jugador {

    // Constante
    private static final int MAX_PARTIDAS = 10;

    // Atributos
    private String nombre;
    private String nickname;
    private int edad;
    private int[] puntajes;
    private int cantidadPartidas;

    // Constructor
    public Jugador(String nombre, String nickname, int edad) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
        this.puntajes = new int[MAX_PARTIDAS];
        this.cantidadPartidas = 0;
    }

    // Registra un nuevo puntaje
    public boolean registrarPuntaje(int puntaje) {
        if (cantidadPartidas >= MAX_PARTIDAS) {
            return false;
        }

        if (puntaje < 0 || puntaje > 100) {
            return false;
        }

        puntajes[cantidadPartidas] = puntaje;
        cantidadPartidas++;

        return true;
    }

    // Modifica el puntaje de una partida existente
    public boolean modificarPuntaje(int numeroPartida, int nuevoPuntaje) {
        if (numeroPartida < 1 || numeroPartida > cantidadPartidas) {
            return false;
        }

        if (nuevoPuntaje < 0 || nuevoPuntaje > 100) {
            return false;
        }

        // Se resta 1 porque las partidas se numeran desde 1,
        // pero los arreglos empiezan desde el índice 0.
        puntajes[numeroPartida - 1] = nuevoPuntaje;

        return true;
    }

    // Obtiene el puntaje de una partida específica
    public int obtenerPuntaje(int numeroPartida) {
        if (numeroPartida < 1 || numeroPartida > cantidadPartidas) {
            return -1;
        }

        return puntajes[numeroPartida - 1];
    }

    // Calcula el promedio de los puntajes registrados
    public double calcularPromedio() {
        if (cantidadPartidas == 0) {
            return 0.0;
        }

        int suma = 0;

        for (int i = 0; i < cantidadPartidas; i++) {
            suma += puntajes[i];
        }

        return (double) suma / cantidadPartidas;
    }

    // Obtiene el mejor puntaje
    public int obtenerMejorPuntaje() {
        if (cantidadPartidas == 0) {
            return -1;
        }

        int mejor = puntajes[0];

        for (int i = 1; i < cantidadPartidas; i++) {
            if (puntajes[i] > mejor) {
                mejor = puntajes[i];
            }
        }

        return mejor;
    }

    // Obtiene el peor puntaje
    public int obtenerPeorPuntaje() {
        if (cantidadPartidas == 0) {
            return -1;
        }

        int peor = puntajes[0];

        for (int i = 1; i < cantidadPartidas; i++) {
            if (puntajes[i] < peor) {
                peor = puntajes[i];
            }
        }

        return peor;
    }

    // Obtiene la cantidad de partidas registradas
    public int getCantidadPartidas() {
        return cantidadPartidas;
    }

    // Obtiene la cantidad de partidas disponibles
    public int getPartidasDisponibles() {
        return MAX_PARTIDAS - cantidadPartidas;
    }

    // Obtiene el nombre del jugador
    public String getNombre() {
        return nombre;
    }

    // Obtiene el nickname del jugador
    public String getNickname() {
        return nickname;
    }

    // Obtiene la edad del jugador
    public int getEdad() {
        return edad;
    }
}