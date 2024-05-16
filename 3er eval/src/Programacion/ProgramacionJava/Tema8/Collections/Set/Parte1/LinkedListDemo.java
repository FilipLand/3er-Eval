package ProgramacionJava.Tema8.Collections.Set.Parte1;

import java.util.HashSet;
import java.util.Set;

public class LinkedListDemo {
    public static void main(String[] args) {
        hashset();
        // LinkedHashSet();
        // Treset();
    }

    public static void hashset() {
        Set<Alumno> hashSet = new HashSet<>();

        hashSet.add(new Alumno("Franek", "Mlynarczyk", 10));
        System.out.println(hashSet);
        hashSet.add(new Alumno("Artur", "Mlynarczyk", 12));
        System.out.println(hashSet);
        hashSet.add(new Alumno("Kevin", "Frank", 12));
        System.out.println(hashSet);

    }

    public static void LinkedHashSet() {

    }

    public static void Treset() {

    }
}
