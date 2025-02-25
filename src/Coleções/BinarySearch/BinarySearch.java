package Coleções.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(3);
        numeros.add(7);
        numeros.add(5);
        numeros.add(4);

        Collections.sort(numeros); // deve ser ordenado
        System.out.println(Collections.binarySearch(numeros,3));
        System.out.println(Collections.binarySearch(numeros,8)); // se o valor nao for encontrado na lista: (-(ponto de insercao) -1)

    }
}
