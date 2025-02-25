package Exercicios;

import java.lang.Character;

class RotationalCipher {
    public int shiftKey;
    public String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder rotationalCipher = new StringBuilder(data);
        for (int i=0;i<rotationalCipher.length();i++){
            if (Character.isLetter(rotationalCipher.charAt(i))){
                if (Character.isUpperCase(rotationalCipher.charAt(i))){
                    rotationalCipher.setCharAt(i,Character.toUpperCase(alphabet.charAt(alphabet.indexOf(rotationalCipher.substring(i,i+1).toLowerCase())+shiftKey)));
                } else {
                    rotationalCipher.setCharAt(i,(alphabet.charAt(alphabet.indexOf(rotationalCipher.substring(i,i+1))+shiftKey)));
                }
            }
        }
        return rotationalCipher.toString();
    }

    public static void main(String[] args) {
        RotationalCipher rotationalCipher = new RotationalCipher(13);
        System.out.println(rotationalCipher.rotate("The quick brown fox jumps over the lazy dog"));
    }
}
