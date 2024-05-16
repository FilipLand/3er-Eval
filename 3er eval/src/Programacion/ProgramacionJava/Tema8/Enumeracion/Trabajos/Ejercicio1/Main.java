package ProgramacionJava.Tema8.Enumeracion.Trabajos.Ejercicio1;

import java.util.Scanner;

public class Main {
    static String textoDificultad = ("La dificultad es: ");

    public static void main(String[] args) {

        System.out.println("Selecione la dificultad");
        System.out.println("(3) Facil");
        System.out.println("(2) normal");
        System.out.println("(1) Dificil");

        Scanner sc = new Scanner(System.in);
        Integer opcionesNivel = sc.nextInt();

        NivelJuego avanzado = NivelJuego.AVANZADO;
        NivelJuego intermedio = NivelJuego.INTERMEDIO;
        NivelJuego facil = NivelJuego.PRINCIPIANTE;
        esAvanzado(opcionesNivel, facil, intermedio, avanzado, textoDificultad);
        sc.close();
    }

    public static void esAvanzado(Integer opcionesNivel, NivelJuego facil, NivelJuego intermedio,
            NivelJuego avanzado, String textoDificultad) {
        switch (opcionesNivel) {
            case 1 -> System.out.println(textoDificultad + avanzado + " " + avanzado.getDificultad());
            case 2 -> System.out.println(textoDificultad + intermedio + " " + intermedio.getDificultad());
            case 3 -> System.out.println(textoDificultad + facil + " " + facil.getDificultad());
            default -> System.out.println("No es una opcion correcta");
        }
    }
}