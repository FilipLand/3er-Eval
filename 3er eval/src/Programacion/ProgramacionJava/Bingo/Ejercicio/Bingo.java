package ProgramacionJava.Bingo.Ejercicio;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Bingo {
    static int personas;
    public static final int MAXIMOPERSONAS = 100;

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Bingo.class.getName());
        System.out.println("🔞 Bienvenido al BINGO 🔞");
        System.out.println("¿Cuántos jugadores quieres jugar al bingo? 👤👤");
        System.out.println("Máximo 100 personas");

        // Try con Scanner
        try (Scanner sc = new Scanner(System.in)) {
            personas = sc.nextInt();
            List<Jugador> jugadores = new ArrayList<>();
            if (personas > MAXIMOPERSONAS) {
                throw new IllegalArgumentException("Debe ser máximo de 100 jugadores");
            } else {
                System.out.println("Habrá un total de " + personas + " personas en la partida");
                for (int i = 0; i < personas; i++) {
                    listaPersonas(jugadores, sc, i, logger);
                }
                System.out.println(jugadores);
            }
            // Todos los Catch
        } catch (IllegalArgumentException e1) {
            logger.warning(e1.getMessage());
        } catch (InputMismatchException e2) {
            logger.warning("Debe ser un número, no otro carácter");
            // Finally
        } finally {
            logger.info("Programa acaba");
        }
    }

    // Lista de personas
    public static void listaPersonas(List<Jugador> jugadores, Scanner sc, int i, Logger logger) {
        String nombreL;
        String cuidadL;
        String fecha;
        int numeroJugador = i + 1;

        // nombre
        sc.nextLine();
        System.out.println("Introduce el nombre del jugador: " + numeroJugador);
        nombreL = sc.nextLine();

        // cuidad
        System.out.println("Introduce la cuidad del jugador: " + numeroJugador);
        cuidadL = sc.nextLine();

        // fecha
        try {
            logger.info("La fecha tiene que ser dd-MM-yyyy ejemplo 01-01-2001");
            System.out.println("Introduce la fecha del jugador: " + numeroJugador);
            fecha = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaLocal = LocalDate.parse(fecha, formatter);
            String fechaDefiniva = fechaLocal.toString();
            jugadores.add(new Jugador(nombreL, cuidadL, fechaDefiniva));

        } catch (DateTimeException e) {
            logger.warning("Has introducido mal la fecha");
        }
    }
}
