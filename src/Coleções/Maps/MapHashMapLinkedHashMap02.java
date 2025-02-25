package Coleções.Maps;

import Coleções.SortLists.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapHashMapLinkedHashMap02 { // Parecido com a estrutura de dados dictionary
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Renzo");
        Consumidor consumidor2 = new Consumidor("Sofia");
        System.out.println(consumidor1);
        Manga manga1 = new Manga(19, "Hellsing Ultimate", 8.75, 0);
        Manga manga2 = new Manga(9, "Berserk", 9.99, 0);
        Manga manga3 = new Manga(3, "Pokémon", 4.29, 0);
        Manga manga4 = new Manga(11, "Attack on Titan", 2.99, 4);
        Manga manga5 = new Manga(2, "Dragon Ball Z", 17.99, 3);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga4);

//        for (Consumidor consumidor : consumidorMangaMap.keySet()) {
//            System.out.println(consumidor.getNome() + " - " + consumidorMangaMap.get(consumidor).getNome());
//        }

        for (Map.Entry<Consumidor,Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
