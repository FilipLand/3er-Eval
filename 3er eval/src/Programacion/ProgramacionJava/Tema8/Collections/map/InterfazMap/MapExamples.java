package ProgramacionJava.Tema8.Collections.map.InterfazMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {

        Map<String, Integer> hashMapa = new HashMap<>();
        Map<String, Integer> linkedHashMapa = new LinkedHashMap<>();
        Map<String, Integer> treeMapa = new TreeMap<>();

        lista1(hashMapa);
        lista2(linkedHashMapa);
        lista3(treeMapa);

        System.out.println(hashMapa);
        System.out.println(linkedHashMapa);
        System.out.println(treeMapa);

        System.out.println(hashMapa.get("Filip"));
        System.out.println(linkedHashMapa.get("Martin"));
        System.out.println(treeMapa.get("Luis"));

        System.out.println(hashMapa.containsKey("Carlos"));
        hashMapa.remove("Carlos");
        System.out.println(hashMapa.containsKey("Carlos"));

        System.out.println(linkedHashMapa.size());

    }

    public static void lista1(Map<String, Integer> hashMap) {
        hashMap.put("Franek", 8);
        hashMap.put("Filip", 19);
        hashMap.put("Luis", 10);
        hashMap.put("Sandra", 25);
        hashMap.put("Carlos", 0);
    }

    public static void lista2(Map<String, Integer> linkedHashMap) {
        linkedHashMap.put("Eduardo", 8);
        linkedHashMap.put("Martin", 9);
        linkedHashMap.put("Marco", 10);
        linkedHashMap.put("Sandra", 14);
        linkedHashMap.put("Ana", 17);
    }

    public static void lista3(Map<String, Integer> treeMap) {
        treeMap.put("Evan", 33);
        treeMap.put("Gabriel", 24);
        treeMap.put("Marta", 18);
        treeMap.put("Luis", 14);
        treeMap.put(" ", 13);
    }
}
