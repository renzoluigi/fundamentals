package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasFunction {
    //Map costuma ser o nome da função que recebe algo e retorna algo diferente do que recebeu, como outra classe ou tipo
    private static <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            //R r = function.apply(e)
            result.add(function.apply(e));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Natu","Lucario","Greninja");
        System.out.println(LambdasFunction.map(strings,s -> s.length()));
        System.out.println(LambdasFunction.map(strings,s -> s.toUpperCase()));
    }
}
