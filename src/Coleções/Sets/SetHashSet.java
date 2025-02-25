package Coleções.Sets;

import Coleções.SortLists.Manga;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetHashSet {
    public static void main(String[] args) {
        Set<Manga> mangaSet = new HashSet<>();
        mangaSet.addAll(List.of(new Manga(19, "Hellsing Ultimate", 8.75,0),
                new Manga(9, "Berserk", 9.99,1),
                new Manga(3, "Pokémon", 4.29,1),
                new Manga(11, "Attack on Titan", 2.99,4),
                new Manga(2, "Dragon Ball Z", 17.99,3),
                new Manga(2, "Dragon Ball Z", 17.99,3)));
        // Sets não tem indices, ou seja, não é possível navegar por ele com get
        for (Manga manga : mangaSet) {
            System.out.println(manga); // o Hash se baseia no equals do objeto para organizar o Set, assim como HashCode
        }

    }
}
