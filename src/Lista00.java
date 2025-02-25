import java.util.ArrayList;
import java.util.List;

public class Lista00 {
    public static void main(String[] args) {
        List <String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("Python");
        listaStrings.add(1,"Go");
        listaStrings.add("JavaScript");

        System.out.println("Lista: " + listaStrings);

        System.out.println("Primeiro elemento: " + listaStrings.get(0)); //ou listaStrings.getFirst()

        listaStrings.set(0,"Kotlin"); //sobrepoe o elemento na posicao desejada da lista, ou adiciona
        System.out.println("Lista modificada" + listaStrings);

        listaStrings.remove("Kotlin"); //ou listaStrings.remove(1); (index)
        System.out.println("Após remoção: " + listaStrings);

        System.out.println("Tamanho da lista: " + listaStrings.size());

        System.out.println("O elemento 'Java' está presente na lista? " + listaStrings.contains("Java"));

        listaStrings.add(2,"Go");
        System.out.println("Primeira aparição de 'Go': " + listaStrings.indexOf("Go")); //se nao estiver na lista retorna -1
        System.out.println("Ultima aparição de 'Go': " + listaStrings.lastIndexOf("Go")); //se nao estiver na lista retorna -1


        List <String> subLista = listaStrings.subList(1,3);
        System.out.println("Sublista: " + subLista);

        listaStrings.clear(); //limpa a lista
        System.out.println("A lista está vazia? " + listaStrings.isEmpty()); //a sublista esta ligada a lista principal, portanto, a sublista tambem sofreu o metodo clear

    }
}

