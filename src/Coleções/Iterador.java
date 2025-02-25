package Coleções;

import Coleções.SortLists.Manga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Iterador {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>(List.of(new Manga(19, "Hellsing Ultimate", 0,4),
                new Manga(9, "Berserk", 5,1),
                new Manga(3, "Pokémon", 0,0),
                new Manga(11, "Attack on Titan", 2,2),
                new Manga(2, "Dragon Ball Z", 0,3)));

//        Iterator<Manga> iterator = mangas.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().getQuantidade() == 0){
//                iterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getId() == 0);
        System.out.println(mangas);
    }
}
