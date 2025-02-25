package Exercicios;

import java.util.*;

class DnDCharacter {
    private final int strength, dexterity, constitution, intelligence, wisdom, charisma;
    DnDCharacter(){
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }
    int ability(List<Integer> scores) {
        List<Integer> copy = new ArrayList<>(scores);
        Collections.sort(copy,Comparator.reverseOrder());
        return copy.getFirst()+copy.get(1)+copy.get(2);
    }

    List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();
        for (int i=0;i<4;i++){
            scores.add((int) (1+Math.random()*6));
        }return scores;
    }

    int modifier(int input) {
        return (int) Math.floor((input-10)/2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

    public static void main(String[] args) {
        DnDCharacter d = new DnDCharacter();
        System.out.println(d.ability(List.of(4, 3, 2, 1)));
    }
}
