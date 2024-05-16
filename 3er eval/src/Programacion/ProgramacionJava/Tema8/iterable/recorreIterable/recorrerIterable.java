/*Crea un programa que genere una lista de números aleatorios y
 los imprima por pantalla. A continuación, recorre esa lista 
 con un iterador, imprimiendo los números, uno a uno por pantalla. */

package ProgramacionJava.Tema8.iterable.recorreIterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class recorrerIterable {
    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add((double) (Math.round(Math.random() * 1000 + 1) * 100 / 100));
        }
        Iterator<Double> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
