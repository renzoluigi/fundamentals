package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
    public int tot = 0;
    List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
    public int numberOfVictories;

    @Override
    public void drive() {
        tot+=10;
    }

    @Override
    public int getDistanceTravelled() {
        return tot;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(this.getNumberOfVictories(),o.getNumberOfVictories());
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
}