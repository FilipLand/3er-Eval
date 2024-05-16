package ProgramacionJava.Tema8.Test;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final String linea = "----------------------------------------------------------------------------------------";
        Set<MiClase> clase = new HashSet<>();
        lista(clase);
        System.out.println(linea);
        System.out.println(clase);
        clase.add(new MiClase(33, null));

        System.out.println(linea);
        System.out.println(clase);
        System.out.println(linea);

        clase.add(new MiClase(33, "Granada"));
        System.out.println(clase);
        System.out.println(linea);

    }

    public static void lista(Set<MiClase> clase) {
        clase.add(new MiClase(1, "Murcia"));
        clase.add(new MiClase(2, "Granada"));
        clase.add(new MiClase(1, "Segovia"));
        clase.add(new MiClase(11, "vigo"));
        clase.add(new MiClase(10, "Sevilla"));
        clase.add(new MiClase(1, "Murcia"));
        clase.add(new MiClase(12, "Valencia"));
    }
}
