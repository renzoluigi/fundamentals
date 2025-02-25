package Exercicios;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetHash { //set eh uma interface.
    public static void main(String[] args) {
        Set <String> conjunto = new HashSet<>();
        conjunto.add("Renzo"); //retorna true se o elemento foi adicionado, caso contrario ou se o elemento nao estiver na lista, retorna false
        conjunto.add("Denize");
        conjunto.add("");
        System.out.println(conjunto);//[, Renzo, Denize], HashSet não mantém a ordem de inserção.!

        conjunto.remove("Sofia"); //retorna true se o elemento foi removido, caso contrario ou se o elemento nao estiver na lista, retorna false

        conjunto.contains("Renzo"); //true or false

        conjunto.size(); //retorna o tamanho do set

        conjunto.isEmpty();//true or false

        //Operacoes com conjuntos (sets)

        //União
        Set<String> cj1 = new HashSet<>(Arrays.asList("Renzo","Sofia","Denize"));
        Set<String> cj2 = new HashSet<>(Arrays.asList("Renzo","Andrey","Patrick"));
        cj1.addAll(cj2);
        System.out.println(cj1);//[Patrick, Renzo, Sofia, Andrey, Denize]

        //Intersecção
        Set<String> cj3 = new HashSet<>(Arrays.asList("Renzo","Sofia","Denize"));
        Set<String> cj4 = new HashSet<>(Arrays.asList("Renzo","Andrey","Patrick"));
        cj3.retainAll(cj4);
        System.out.println(cj3);//[Renzo]

        //Diferença
        Set<String> cj5 = new HashSet<>(Arrays.asList("Renzo","Sofia","Denize"));
        Set<String> cj6 = new HashSet<>(Arrays.asList("Renzo","Andrey","Patrick"));
        cj5.removeAll(cj6);
        System.out.println(cj5);//[Sofia, Denize]

        /*Iterador<String> iterador = conjunto.iterator(); estudar sobre iteradores em Java
        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }*/
    }
}
