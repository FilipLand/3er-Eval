package ProgramacionJava.trabajoFinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int opcion;
            int personasTotal;
            int personasNuevas;
            Integer numeroJugador = 0;
            Scanner sc = new Scanner(System.in);
            List<Jugador> jugadores = new ArrayList<>();

            System.out.println("Bienvenido al juego del prisionero");
            System.out.println("¿Tienes usuarios ya creado?");
            System.out.println("(1) -> No");
            System.out.println("(2) -> Si");
            opcion = sc.nextInt();
            sc.nextLine();

            System.out.println("Cuantas personas vais a jugar?");
            personasTotal = sc.nextInt();
            sc.nextLine();

            System.out.print("Cuantos jugadores nuevos sois?");
            personasNuevas = sc.nextInt();
            sc.nextLine();

            if (personasNuevas < 0 || personasTotal < 0) {

            } else {
                switch (opcion) {
                    case 1:
                        if (personasNuevas == personasTotal) {
                            for (int i = 0; i < personasTotal; i++) {
                                sc.nextLine();
                                crearUsuario(jugadores, sc, numeroJugador);
                            }
                        } else {
                            for (int i = 0; i < personasNuevas; i++) {
                                sc.nextLine();
                                crearUsuario(jugadores, sc, numeroJugador);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Hola 2");
                        break;
                    default:
                        System.out.println("No es un número válido");
                }
                sc.close();
            }
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un número");
            e.printStackTrace();
        }
    }

    public static void crearUsuario(List<Jugador> jugadores, Scanner sc, int numeroJugador) {

        String nombre1;
        String apellido1;
        Integer edad1;
        Integer nivelInicio = 1;

        numeroJugador++;
        System.out.println("Jugador: " + numeroJugador);
        System.out.println("Introduce tu nombre");
        nombre1 = sc.nextLine();

        System.out.println("Introduce tu apellido");
        apellido1 = sc.nextLine();

        System.out.println("Intruduce tu edad");
        edad1 = sc.nextInt();

        jugadores.add(new Jugador(nombre1, apellido1, edad1, nivelInicio));
    }
}
