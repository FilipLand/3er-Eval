package ProgramacionJava.Tema8.comparador.CompararPersona;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // T0D0 hacer logger que no me sirve pero venga que no loo explico bien
        // T0D0 meter el colator
        List<Estudiante> estudiantes = new ArrayList<>();
        try {
            File nombreArchivoEstudiante = new File("../Estudiante.csv");
            FileReader arcivoEstudiante = new FileReader(nombreArchivoEstudiante);
            lista(estudiantes);
        } catch (FileNotFoundException e) {
            System.out.println("Hay un error al intenar leer un archivo");
            e.printStackTrace();
        }
    }

    public static void lista(List<Estudiante> estudiantes) {
        for (int i = 1; i < estudiantes.size(); i++) {
            estudiantes.add(new Estudiante(null, null, null, null));
        }
        estudiantes.add(new Estudiante("Filip", "Mlynarczyk", "19/06/2004", 5));
    }
}
