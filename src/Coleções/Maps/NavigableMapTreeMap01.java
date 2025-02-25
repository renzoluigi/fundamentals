package Coleções.Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTreeMap01 { // Ordena os valores pela chave, sendo necessário somento a classe Key ter implementado o Comparable
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("E", "Letra E");
        map.put("B", "Letra B");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("C"));
        System.out.println(map.headMap("C",true)); // {A=Letra A, B=Letra B, C=Letra C}
        System.out.println(map.headMap("C").remove("A")); // -> retorna todos os valores que estejam abaixo da Key passada (compareTo)
        System.out.println(map); // {B=Letra B, C=Letra C, D=Letra D, E=Letra E} (linkado)
    }
}
