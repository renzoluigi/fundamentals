package Exercicios;

public class ElonsToyCar {
    public int totalDistance;
    public int remainingBattery = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar toyCar = new ElonsToyCar();
        return toyCar;
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters";
    }

    public String batteryDisplay() {
        return remainingBattery > 0 ? "Battery at " + remainingBattery + "%" : "Battery empty";
    }

    public void drive() {
        if (this.remainingBattery > 0){
            this.totalDistance+=20;
            this.remainingBattery--;
        }
    }
}
