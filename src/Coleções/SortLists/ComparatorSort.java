package Coleções.SortLists;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//criação de um comparator
class MangaByNameComparator implements Comparator<Manga>{ //para usar comparator, deve ser implementado o metodo Comparable na classe

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.compareTo(manga2);
    }
}
public class ComparatorSort {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>(List.of(new Manga(19, "Hellsing Ultimate", 0,4),
                new Manga(9, "Berserk", 5,1),
                new Manga(3, "Pokémon", 0,0),
                new Manga(11, "Attack on Titan", 2,2),
                new Manga(2, "Dragon Ball Z", 0,3)));

        System.out.println("Mangas desordenados");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------");

        Collections.sort(mangas);
        System.out.println("Mangas ordenados por Id");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------");

        Collections.sort(mangas,new MangaByNameComparator()); //ou mangas.sort(new MangaByNameComparator);
        System.out.println("Mangas ordenados por nome: ");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
