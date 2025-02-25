package Exercicios;

class Scrabble {

    private String word;
    private int score;

    Scrabble(String word) {
        this.word = word;
        int score = 0;
        StringBuilder w = new StringBuilder(word.toUpperCase());
        for(int pos=0;pos<w.length();pos++){
            switch (w.charAt(pos)){
                case 'A', 'E', 'I', 'O', 'U','L', 'N', 'R', 'S', 'T' -> score += 1;
                case 'D', 'G' -> score += 2;
                case 'B', 'C', 'M', 'P' -> score += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> score += 4;
                case 'K' -> score += 5;
                case 'J','X' -> score += 8;
                case 'Q','Z' -> score += 10;
            }
        } this.score = score;
    }

    int getScore() {
        return this.score;
    }

}
