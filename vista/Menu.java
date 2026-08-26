package vista;
import java.util.Scanner;

import modelo.Torneo;

public class Menu {
    public static void menu(String[] args) {
        System.out.println("Bienvenido al programa para Torneo de Videojuegos");

        Torneo torneo = new Torneo();
        Scanner sc = new Scanner(System.in);
        int decision;
        decision = 0;

        while (decision != 6) {
            System.out.println("-------------------------------------------------");
            System.out.println("1. Crear / Registrar nuevo jugador");
            System.out.println("2. Registrar puntaje de una partida");
            System.out.println("3. Modificar puntaje de una partida");
            System.out.println("4. Consultar puntaje de una partida específica");
            System.out.println("5. Ver estadísticas e información del jugador activo");
            System.out.println("6. Salir del sistema");
            System.out.println("-------------------------------------------------");

            try {
                decision = sc.nextInt();

                if (decision < 1 || decision > 6) {
                    throw new IllegalArgumentException();
                }

                switch (decision) {
                    case 1:
                        sc.nextLine();
                        
                        System.out.println("Ingrese el nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese el nickname");
                        String nickname = sc.nextLine();
                        System.out.println("Ingrese la edad");
                        int edad = sc.nextInt();

                        torneo.crearNuevoJugador(nombre, nickname, edad);
                        System.out.println("Jugador creado, exitosamente");
                        break;
                    case 2:
                        if (torneo.tieneJugadorActivo()){
                            if (torneo.getJugadorActivo().getPartidasDisponibles() != 0){
                                System.out.println("Ingresar Puntaje de Partida");
                                int puntaje = sc.nextInt();
                                sc.nextLine();
                                torneo.registrarPartida(puntaje);
                            }  
                        } else {
                            System.out.println("Aún no existe jugador.");
                        }
                        break;
                        
                    case 3:
                        if (torneo.tieneJugadorActivo()){
                            System.out.println("Ingrese número de partida que se desee modificar");
                            int partida = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingrese el valor del puntaje nuevo");
                            int nuevoPuntaje = sc.nextInt();
                            sc.nextLine();
                            torneo.modificarPartida(partida, nuevoPuntaje);
                            
                            System.out.println("Puntaje cambiado con éxito");
                        } else {
                            System.out.println("Aún no existe jugador.");
                        }
                        break;

                    case 4:
                        if (torneo.tieneJugadorActivo()){
                            System.out.println("Ingrese número de partida que se desee consultar");
                            int partida = sc.nextInt();
                            sc.nextLine();
                            
                            System.out.println(torneo.consultarPuntajePartida(partida));

                        } else {
                            System.out.println("Aún no existe jugador.");
                        }
                        break;
                    
                    case 5:
                        if (torneo.tieneJugadorActivo()){
                            System.out.println(torneo.getJugadorActivo().getNombre());
                            System.out.println(torneo.getJugadorActivo().getNickname());
                            System.out.println(torneo.getJugadorActivo().getEdad());
                            System.out.println("Promedio: ");
                            System.out.println(torneo.obtenerPromedio());
                            System.out.println("Mejor: ");
                            System.out.println(torneo.obtenerMejor());
                            System.out.println("Peor: ");
                            System.out.println(torneo.obtenerPeor());
                        } else {
                            System.out.println("Aún no existe jugador.");
                        }
                        break;
                    case 6:
                        System.out.println("Hasta la proxima");
                        break;
                }

            } catch (IllegalArgumentException error) {
                System.out.println("Entre 1-6");
            } catch (Exception error) {
                System.out.println("Número inválido");
                sc.nextLine();
            }


    }

}
}