package Exercicios;

public class Lasagna {
    public int expectedMinutesInOven(){
            return 40;
    }
    public int remainingMinutesInOven(int minutes){
        return expectedMinutesInOven() - minutes;
    }
    public int preparationTimeInMinutes(int minutes){
        return minutes*2;
    }
    public int totalTimeInMinutes(int layers,int minutes){
        return preparationTimeInMinutes(layers) + minutes;
    }
}