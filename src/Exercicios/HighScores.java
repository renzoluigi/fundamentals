package Exercicios;

import java.util.*;

class HighScores {
    List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return this.highScores.getLast();
    }

    Integer personalBest() {
        return Collections.max(this.highScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> copy = new ArrayList<>();
        copy.addAll(highScores);
        Collections.sort(copy, Comparator.reverseOrder());
        List<Integer> topThree = new ArrayList<>();
        for (int scr:copy){
            if (topThree.size() < 3){
                topThree.add(scr);
            }
        } return topThree;
    }

}
