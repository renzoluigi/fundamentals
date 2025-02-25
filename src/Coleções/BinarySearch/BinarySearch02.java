package Coleções.BinarySearch;

import Coleções.SortLists.Manga;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class MangaByPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(),manga2.getPreco());
    }
}

public class BinarySearch02 {
    public static void main(String[] args) {
        MangaByPrecoComparator mangaByPrecoComparator = new MangaByPrecoComparator();
        List<Manga> mangas = new LinkedList<>(List.of(new Manga(19, "Hellsing Ultimate", 8.75,0),
                new Manga(9, "Berserk", 9.99,0),
                new Manga(3, "Pokémon", 4.29,0),
                new Manga(11, "Attack on Titan", 2.99,4),
                new Manga(2, "Dragon Ball Z", 17.99,3)));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("--------------------------------------------------------");
//        Collections.sort(mangas);
        mangas.sort(mangaByPrecoComparator);

        Manga mangaToSearch = new Manga(22, "Naruto", 19.90,2);
        Manga mangaToSearch2 = new Manga(11, "Attack on Titan", 2.99,4);

//        System.out.println(Collections.binarySearch(mangas,mangaToSearch));
//        System.out.println(Collections.binarySearch(mangas,mangaToSearch2));
        System.out.println(Collections.binarySearch(mangas,mangaToSearch,mangaByPrecoComparator));
        System.out.println(Collections.binarySearch(mangas,mangaToSearch2,mangaByPrecoComparator));
    }
}
