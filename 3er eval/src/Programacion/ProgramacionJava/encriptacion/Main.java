package ProgramacionJava.encriptacion;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de encriptación");
        metodos();
    }

    public static void metodos() {
        System.out.println("Pasame un archivo de texto que quieres encriptar");
        Scanner sc = new Scanner(System.in);
        String archivo = sc.nextLine();
        File fichero1 = new File(archivo);

        System.out.println("¿Que quieres hacer con el archivo?");
        System.out.println("(1) Encriptar el archivo");
        System.out.println("(2) Descriptar el archivo");
        System.out.println("(3) Salir del programa");
        Integer opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> encriptar(fichero1, sc);
            case 2 -> desencriptar(true);
            case 3 -> salir();
            default -> System.out.println("No has introducido una opcion correcta");

        }
    }

    public static void encriptar(File fichero1, Scanner sc) {
        if (fichero1.exists()) {
            System.out.println("El archivo existe y se va encriptar");
            String nombreArchivo = fichero1.getName();/* cosequir el nombre del archivo */

            String[] partes = nombreArchivo.split("."); /* separarlo en dos [] */
            String parte1archivo = partes[1];
            /* String parte2archivo = partes[2]; Archivo que se puede utilzar mas tarde */
            String archivoFinal = (parte1archivo + ".crip"); /* nombrar el archivo */
            /* hay que poner la ruta */
            File nuevaExtension = new File("" + archivoFinal);

            if (fichero1.renameTo(nuevaExtension)) {
                System.out.println("Archivo Renombrado");

            } else {
                System.out.println("error no existe el archivo");
            }

        } else {
            System.out.println("No existe ningun archivo");
            System.out.println("¿Que deseas hacer?");
            System.out.println("(1) salir");
            System.out.println("(2) Empezar de zero");
            Integer opcion2 = sc.nextInt();

            switch (opcion2) {
                case 1 -> salir();
                case 2 -> metodos();
                default -> System.out.println("Hay un error");
            }
        }
    }

    public static void desencriptar(boolean encriptado) {
        System.out.println("Vamos a desencriptar el documento");
        if (encriptado = true) {

        } else {
            System.out.print("no esta escriptado");

        }
    }

    public static void salir() {

    }

    public static void estaEncriptado(boolean escriptado) {
        boolean encriptado;
    }
}
