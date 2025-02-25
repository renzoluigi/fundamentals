package Coleções.SortLists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableSort {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>(List.of(new Manga(19, "Hellsing Ultimate", 0,4),
                new Manga(9, "Berserk", 5,1),
                new Manga(3, "Pokémon", 0,0),
                new Manga(11, "Attack on Titan", 2,2),
                new Manga(2, "Dragon Ball Z", 0,3)));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-----------");

        Collections.sort(mangas); //com um comparavel adicionado á classe manga, agora ha como usar o metodo Collections.sort

    }
}
