package Exercicios;

public class GameMaster {

    public String describe(Exercicios.Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod travelMethod) {
        return "You're traveling to your destination on " + travelMethod.getMethod();
    }

    public String describe(Exercicios.Character character, Destination destination, TravelMethod travelMethod) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points." + " You're traveling to your destination on " + travelMethod.getMethod() + " You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(Character character, Destination destination) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points." + " You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

}