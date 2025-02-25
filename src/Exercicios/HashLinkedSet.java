package Exercicios;

import java.util.Set;
import java.util.LinkedHashSet;

public class HashLinkedSet {
    public static void main(String[] args) {
        Set<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Renzo");
        conjunto.add("Denize");
        conjunto.add("");
        System.out.println(conjunto);//[Renzo, Denize, ], LinkedHashSet mantém a ordem de inserção dos elementos.!
    }
}
