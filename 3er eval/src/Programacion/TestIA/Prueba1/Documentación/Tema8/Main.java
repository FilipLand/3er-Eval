
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();
        lista.add("hola");
        lista.add(3);
        lista.add(1);
        lista.add("adios");
        lista.add(2);

        Collections.sort(lista, new MiComparator());

        System.out.println("Lista ordenada:");
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }
}

class MiComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Integer && o2 instanceof Integer) {
            return Integer.compare((Integer) o1, (Integer) o2);
        } else if (o1 instanceof String && o2 instanceof String) {
            return ((String) o1).compareTo((String) o2);
        } else if (o1 instanceof Integer) {
            return -1; // Enteros primero
        } else {
            return 1; // Cadenas después
        }
    }
}