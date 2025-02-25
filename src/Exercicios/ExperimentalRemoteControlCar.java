package Exercicios;

public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int tot=0;

    public void drive() {
        tot+=20;
    }

    @Override
    public int getDistanceTravelled() {
        return tot;
    }
}
