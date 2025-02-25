package Comportamento;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametro01 { //tres tipos de filtragens diferentes, criadas uma por uma manualmente
    public static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 2018), new Car("Emerald", 2007));

    public static List<Car> filterGreen(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("Green")) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    public static List<Car> filterByColor(List<Car> cars,String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    public static List<Car> filterByColorAndYearAfter(List<Car> cars, String color, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase(color) && car.getYear() >= year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public static void main(String[] args) {
        System.out.println(filterGreen(cars));
        System.out.println(filterByColor(cars,"Black"));
        System.out.println(filterByColorAndYearAfter(cars,"Black",2018));
    }

}
