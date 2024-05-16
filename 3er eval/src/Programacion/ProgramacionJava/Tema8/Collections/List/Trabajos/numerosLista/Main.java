package ProgramacionJava.Tema8.Collections.List.Trabajos.numerosLista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Numeros> listaNumeros = new ArrayList<>();
        Lista(listaNumeros);
        System.out.println(listaNumeros);
    }

    public static List<Numeros> Lista(List<Numeros> listaNumeros) {
        int numero;
        for (int i = 0; i < 50; i++) {
            numero = (int) (Math.random() * 10 + 1);
            listaNumeros.add(new Numeros(numero));
        }
        return listaNumeros;
    }
}
