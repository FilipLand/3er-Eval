package ProgramacionJava.trabajoFinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Bienvenido al juego del prisionero");
            int personasTotal;
            int personasNuevas;
            Scanner sc = new Scanner(System.in);
            List<Jugador> jugadores = new ArrayList<>();
            personasTotal = personasTotales(sc);
            personasNuevas = personasNuevasCant(sc);

            if (personasNuevas < 0 || personasTotal < 0) {
                System.out.println("no puede ser negativo");
            } else {
                opcionesUsuario(sc, personasNuevas, personasTotal, jugadores);
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

    public static void cargarDatos(List<Jugador> jugadores) {
        try {
            String archivoCSV = "3er eval\\src\\Programacion\\ProgramacionJava\\trabajoFinal\\jugadores.csv";

            File archivo = new File(archivoCSV);

            archivo.createNewFile();
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Jugador jugador : jugadores) {
                bw.write(jugador.cambiarACsv());
                bw.newLine();
            }
            bw.close();
            System.out.println("Datos guardados correctamente en " + archivoCSV);

        } catch (IOException e) {
            System.out.println("No se pudo crear el archivo");
            e.printStackTrace();
        }
    }

    public static void borrarDatos(Scanner sc) {
        int opcion;
        System.out.println("Estas seguro");
        System.out.println("(1) -> No");
        System.out.println("(2) -> Si");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            default:
                break;
        }
    }

    public static void opcionesUsuario(Scanner sc, int personasNuevas, int personasTotal,
            List<Jugador> jugadores) {
        int opcione = opciones(sc);
        switch (opcione) {
            case 1:
                if (personasNuevas == personasTotal) {
                    for (int i = 0; i < personasTotal; i++) {
                        sc.nextLine();
                        crearUsuario(jugadores, sc, i);
                    }
                    cargarDatos(jugadores);
                } else {
                    for (int i = 0; i < personasNuevas; i++) {
                        sc.nextLine();
                        crearUsuario(jugadores, sc, i);
                    }
                    cargarDatos(jugadores);
                }
                break;
            case 2:
                System.out.println("Hola 2");
                break;
            case 3:
                borrarDatos(sc);
            default:
                System.out.println("No es un número válido");
        }
        sc.close();

    }

    public static int opciones(Scanner sc) {
        int opcion;

        System.out.println("¿Tienes usuarios ya creado?");
        System.out.println("(1) -> No");
        System.out.println("(2) -> Si");
        System.out.println("(3) -> Borrar los datos");

        opcion = sc.nextInt();
        sc.nextLine();

        return opcion;
    }

    public static int personasTotales(Scanner sc) {
        int personasTotal;
        System.out.println("Cuantas personas vais a jugar?");
        personasTotal = sc.nextInt();
        sc.nextLine();
        return personasTotal;
    }

    public static int personasNuevasCant(Scanner sc) {
        int personasNuevas;
        System.out.print("Cuantos jugadores nuevos sois?");
        personasNuevas = sc.nextInt();
        sc.nextLine();
        return personasNuevas;
    }
}
