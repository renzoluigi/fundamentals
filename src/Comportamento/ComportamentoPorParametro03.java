package Comportamento;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametro03 { //mesmo tipo de filtragem, porem inves de usar classes anonimas, utiliza de lambdas (funcoes anonima,faz a mesma coisa, porem com uma estrutura mais simplificada).
    public static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 2018), new Car("Emerald", 2007));


    public static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars,car -> car.getColor().equalsIgnoreCase("Green"));
        List<Car> yearsBeforeCar = filter(cars,car -> car.getYear()<2001);
        System.out.println(greenCars);
        System.out.println(yearsBeforeCar);
    }
}

