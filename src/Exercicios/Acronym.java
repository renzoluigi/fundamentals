package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Character;

class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String ac = "";
        List<Character> chars = new ArrayList<>(Arrays.asList(',', '\'', '-', '_'));
        for (char c : chars) {
            if (c == '\''){
                phrase.replace(String.valueOf(c),"");
            } else{
                phrase = phrase.replace(c, ' ');
            }

        }
        List<String> splitted = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        for (String s:splitted){
            if (!s.isEmpty()){
                StringBuilder acBuilder = new StringBuilder(s);
                ac += acBuilder.charAt(0);
            }
        } return ac.toUpperCase();
    }

    public static void main(String[] args) {
        Acronym ac = new Acronym("The Road _Not_ Taken");
        System.out.println(ac.get());
    }
}
