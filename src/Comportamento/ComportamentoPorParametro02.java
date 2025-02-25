package Comportamento;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametro02 { //filtragem feita dentro do psvm, usando classes anonimas, com a interface CarPredicate sendo sobscrita com "@Override"
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
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("Green");
            }
        });
        System.out.println(greenCars);

        List<Car> yearsBeforeCar  = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2001;
            }
        });
        System.out.println(yearsBeforeCar);
    }
}