package ProgramacionJava.Tema8.Collections.Queue.Parte1.Estudiante;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        // T0D0 hacer logger que no me sirve pero venga que no loo explico bien
        // T0D0 meter el colator

        List<Estudiante> estudiantes = new ArrayList<>();
        try {
            leerArchivos();
            Object valor;
            lista(estudiantes);

        } catch (FileNotFoundException e) {
            System.out.println("Hay un error al intenar leer un archivo");
            e.printStackTrace();
        } catch (IOException e2) {
            System.out.println("Ha aparecido un error");
            e2.printStackTrace();
        }
    }

    public static void lista(List<Estudiante> estudiantes) {
        for (int i = 1; i < estudiantes.size(); i++) {
            estudiantes.add(new Estudiante(null, null, null, i));
        }
        estudiantes.add(new Estudiante("Filip", "Mlynarczyk", "19/06/2004", 5));
    }

    public static void leerArchivos() throws IOException {
        String linea;
        String valor;
        File nombreArchivoEstudiante = new File("../Estudiante.csv");
        BufferedReader buffedreader = new BufferedReader(new FileReader(nombreArchivoEstudiante));
        while ((linea = buffedreader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(linea, ";");
            while (tokenizer.hasMoreTokens()) {
                valor = tokenizer.nextToken();
            }
        }
        buffedreader.close();
    }
}
