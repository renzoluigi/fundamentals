package Comportamento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametro04 { //utilizando generics e lambdas, mesma estrutura, porem com generics aplicado junto ao Predicate<T>, que eh uma interface funcional que contem a funcao test(), que eh sobrescrita ao longo do programa, definindo a funcao como portadora de qualquer tipo de classe
    public static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 2018), new Car("Emerald", 2007));


    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e:list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars,car -> car.getColor().equalsIgnoreCase("Green"));
        List<Car> yearsBeforeCar = filter(cars,car -> car.getYear()<2001);
        System.out.println(greenCars);
        System.out.println(greenCars);
        List<Integer> listaDeInteiros = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(listaDeInteiros,num -> num >= 5)); //uma especie de for each
    }
}
