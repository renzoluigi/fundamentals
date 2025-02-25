package Coleções.Sets;

import Coleções.Dominio.Smartphone;
import Coleções.SortLists.Manga;

import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

//class SmartphoneByMarca implements Comparator<Smartphone> {
//    @Override
//    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
//        return smartphone1.getMarca().compareTo(smartphone2.getMarca());
//    }
//}

public class NavigableSetTreeSet { // TreeSet deve ser usado quando a classe implementa Comparable
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphoneNavigableSet = new TreeSet<>((o1, o2) -> o1.getMarca().compareTo(o2.getMarca())); // trabalha com classes que implementem Comparable, pelo metodo compare To (para realizar a organização do set), e como Smartphone não tem, foi instanciado um comparator / classe anonima / criacao de um comparator
        smartphoneNavigableSet.add(new Smartphone("1091022", "Kotix"));
        smartphoneNavigableSet.add(new Smartphone("22102006", "Apple"));
        for (Smartphone smartphone : smartphoneNavigableSet) {
            System.out.println(smartphone);
        }

        System.out.println("___________________________________________");
        NavigableSet<Manga> mangaNavigableSet = new TreeSet<>(List.of(
                new Manga(19, "Hellsing Ultimate", 8.75, 0),
                new Manga(9, "Berserk", 9.99, 0),
                new Manga(3, "Pokémon", 4.29, 0),
                new Manga(11, "Attack on Titan", 2.99, 4),
                new Manga(2, "Dragon Ball Z", 17.99, 3))); // Classe "Manga" tem compareTo (id)
        for (Manga manga : mangaNavigableSet.descendingSet()) { // -> inverte a ordem
            System.out.println(manga);
        }

        System.out.println("___________________________________________");
        Manga mangaDeComparacao = new Manga(11, "Boku no Hero", 5.59, 3);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(mangaNavigableSet.lower(mangaDeComparacao)); // -> trás o imediatamente menor
        System.out.println(mangaNavigableSet.floor(mangaDeComparacao)); // -> imediatamente menor ou igual
        System.out.println(mangaNavigableSet.higher(mangaDeComparacao)); // -> imediatamente maior
        System.out.println(mangaNavigableSet.ceiling(mangaDeComparacao)); // -> imediatamente maior ou igual

        System.out.println(mangaNavigableSet.size());
        System.out.println(mangaNavigableSet.pollFirst()); // -> retorna e remove o primeiro elemento do set
        System.out.println(mangaNavigableSet.pollLast()); // -> retorna e remove o ultimo elemento do set
    }
}
// poderia ser usado tambem na linha 20:

//        NavigableSet<Smartphone> smartphoneNavigableSet = new TreeSet<>(new Comparator<Smartphone>() {
//            @Override
//            public int compare(Smartphone o1, Smartphone o2) {
//                return o1.getMarca().compareTo(o2.getMarca());
//            }
//        });
// ou
//        NavigableSet<Smartphone> smartphoneNavigableSet = new TreeSet<>(new SmartphoneByMarca());