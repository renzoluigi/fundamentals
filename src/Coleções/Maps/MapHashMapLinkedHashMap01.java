package Coleções.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapHashMapLinkedHashMap01 { // Parecido com a estrutura de dados dictionary
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>(); //Map recebe <K,V> key e value
        //Map<String, String> map = new HashMap<>();
        //se utilizar HashMap, ao acontecer uma sobrescritura, o elemento que sobrescreveu assume o primeiro lugar do Map, para evitar isso, pode ser utilizado de LinkedHashMap, que mantém a lista em sua ordem de inserção
        map.put("teklado", "teclado"); // nao pode conter chaves duplicadas
        map.put("mouze", "mouse");
        map.put("mouze2","mouse");
        map.put("vc", "você");
        map.put("vc", "você2"); // -> sobrescreve
        map.put("ol", "ola");
        map.putIfAbsent("ol", "olá"); // adiciona se não conter outra key igual na lista
        System.out.println(map);
        System.out.println("_______________");

        for (String key : map.keySet()) { // .keySet() transforma as keys em um set (que em teoria já são, pois não permitem valores duplicados)
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }

        System.out.println("_______________");
        System.out.println("Apenas valores (.values()): ");
        for (String value : map.values()) { // .values() transforma os values em uma Collection<String>, permitindo valores duplicados
            System.out.println(value);
        }

        System.out.println("_______________");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
