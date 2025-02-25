package Lambdas;

import java.util.function.Consumer;
import java.util.List;

public class LambdasConsumer { //Utilizando Consumer com Lambdas, apenas um void, pode servir como for each
    public static void main(String[] args) {
        List<String> strings = List.of("Renzo", "Denize", "Sofia");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(strings, str -> System.out.println(str));
        forEach(integers, i -> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
