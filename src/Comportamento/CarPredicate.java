package Comportamento;

@FunctionalInterface
public interface CarPredicate { // uma interface funcional: contem apenas um metodo
    boolean test(Car car);
}
