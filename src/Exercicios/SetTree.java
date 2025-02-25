package Exercicios;

import java.util.Set;
import java.util.TreeSet;

public class SetTree {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Renzo");
        conjunto.add("Denize");
        conjunto.add("");
        System.out.println(conjunto);//[, Denize, Renzo], TreeSet mantém os elementos ordenados (ordem natural ou usando um Comparator).
    }
}
