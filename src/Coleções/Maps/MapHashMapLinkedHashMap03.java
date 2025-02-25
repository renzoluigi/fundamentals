package Coleções.Maps;

import Coleções.SortLists.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapHashMapLinkedHashMap03 { // Parecido com a estrutura de dados dictionary
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Renzo");
        Consumidor consumidor2 = new Consumidor("Sofia");
        Manga manga1 = new Manga(19, "Hellsing Ultimate", 8.75, 0);
        Manga manga2 = new Manga(9, "Berserk", 9.99, 0);
        Manga manga3 = new Manga(3, "Pokémon", 4.29, 0);
        Manga manga4 = new Manga(11, "Attack on Titan", 2.99, 4);
        Manga manga5 = new Manga(2, "Dragon Ball Z", 17.99, 3);

        List<Manga> mangaListConsumidor1 = List.of(manga1, manga3, manga2, manga4);
        List<Manga> mangaListConsumidor2 = List.of(manga2, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaListConsumidor1);
        consumidorMangaMap.put(consumidor2, mangaListConsumidor2);
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-> " + manga.getNome());
                ;
            }

        }
    }
}
