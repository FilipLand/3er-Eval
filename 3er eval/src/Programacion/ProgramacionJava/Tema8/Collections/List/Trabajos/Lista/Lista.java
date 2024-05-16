package ProgramacionJava.Tema8.Collections.List.Trabajos.Lista;

import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        String linea = ("-------------------------------");
        System.out.println(linea);
        // crear una array de 10 elementos
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        // convertimos un Array a Lista
        List<Integer> lista = Arrays.asList(array);
        System.out.println(lista);

        System.out.println(linea);
        // Convertir una Lista a un Array
        Integer[] nuevaArray = lista.toArray(new Integer[0]);
        for (Integer numeros : nuevaArray) {
            System.out.println(numeros);
        }
        System.out.println(linea);
    }
}
