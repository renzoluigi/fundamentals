package Exercicios;

import java.lang.Character;
class Bob {

    public boolean containLetters(String str){
        for (char c:str.toCharArray()){
            if (Character.isLetter(c)){
                return true;
            }
        } return false;
    }

    String hey(String input) {
        input = input.trim();
         if (input.isEmpty()) {
             return "Fine. Be that way!";
         } else if  (input.equals(input.toUpperCase()) && input.charAt(input.length()-1) == '?' && containLetters(input)){
            return "Calm down, I know what I'm doing!";
        } else if (input.charAt(input.length()-1) == '?'){
            return "Sure.";
        }  else if (input.equals(input.toUpperCase()) && containLetters(input)){
            return "Whoa, chill out!";
        } return "Whatever.";
    }

    public static void main(String[] args) {
        Bob bob = new Bob();
        System.out.println(bob.hey("         hmmmmmmm..."));
    }
}