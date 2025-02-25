package Exercicios;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4){
            return speed*221;
        } else if (speed >= 5 && speed <= 8 ) {
            return speed*221*90/100.0;
        } else if (speed == 9){
            return speed*221*80/100.0;
        } else {
            return speed*221*77/100.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
