/**
 * Crea la clase alumno con los siguientes atributos:
 *  nombre, nia, edad, curso y nota media. 
 *  Crea además una clase que implemente la interfaz Iterable
 *  y que permita recorrer una lista de alumnos. Crea un
 *  programa que genere una lista de alumnos y los imprima
 *  por pantalla. A continuación, recorre esa lista con un
 *  iterador, imprimiendo los alumnos, uno a uno por pantalla. 
 * */
package ProgramacionJava.Tema8.iterable.claseIterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class claseIterable {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        Lista(alumnos);

        Iterator<Alumno> iterador = alumnos.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }

    public static void Lista(List<Alumno> alumnos) {
        alumnos.add(new Alumno("Filip", "hgyhgu4", "2b", 7.5));
        alumnos.add(new Alumno("Laura", "hhdi4aa", "2c", 8.5));
        alumnos.add(new Alumno("Erika", "jshuia4", "2d", 9.2));
        alumnos.add(new Alumno("Alexandra", "sdjada4", "1b", 6.5));
        alumnos.add(new Alumno("Fran", "hjsdaho0", "3a", 7));
        alumnos.add(new Alumno("Pablo", "654sasd", "la", 10));
        alumnos.add(new Alumno("Marcos", "614sasd", "la", 7));
        alumnos.add(new Alumno("Jesus", "674sasd", "2b", 6));
    }
}