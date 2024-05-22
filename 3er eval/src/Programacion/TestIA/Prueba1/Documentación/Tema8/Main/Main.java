package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ComparableComun> lista = new ArrayList<>();
        lista.add(new Persona("Juan", 25));
        lista.add(new Producto("Lápiz", 1.5));
        lista.add(new Persona("María", 30));
        lista.add(new Producto("Libro", 15.99));

        Collections.sort(lista, new MiComparator());

        System.out.println("Lista ordenada:");
        for (ComparableComun elemento : lista) {
            System.out.println(elemento);
        }
    }
}

interface ComparableComun {
    double obtenerValorComparativo();
}

class Persona implements ComparableComun {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public double obtenerValorComparativo() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
}

class Producto implements ComparableComun {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double obtenerValorComparativo() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
    }
}

class MiComparator implements Comparator<ComparableComun> {
    @Override
    public int compare(ComparableComun o1, ComparableComun o2) {
        double valor1 = o1.obtenerValorComparativo();
        double valor2 = o2.obtenerValorComparativo();

        return Double.compare(valor1, valor2);
    }

}
