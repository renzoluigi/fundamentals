package Exercicios;

class NeedForSpeed {
    int speed;
    int batteryDrain;
    int metersDriven;
    int battery = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery<this.batteryDrain;
    }

    public int distanceDriven() {
        return this.metersDriven;
    }

    public void drive() {
        if (!batteryDrained()){
            this.metersDriven += this.speed;
            this.battery-=batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return  car.batteryDrain*((float) distance/car.speed) <= car.battery;
    }
}

