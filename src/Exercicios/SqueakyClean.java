package Exercicios;

import java.lang.Character;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder id = new StringBuilder(identifier);
        for (int i=0;i<id.length();i++){
            char current = id.charAt(i);
            if (Character.isWhitespace(current)){
                id.setCharAt(i,'_');
            } else if (current == '-'){
                id.deleteCharAt(i);
                id.setCharAt(i,Character.toUpperCase(id.charAt(i)));
            }else if (current == '4'){
                id.setCharAt(i,'a');
            } else if (current == '3'){
                id.setCharAt(i,'e');
            } else if (current == '0'){
                id.setCharAt(i,'o');
            } else if (current == '1'){
                id.setCharAt(i,'l');
            } else if (current == '7'){
                id.setCharAt(i,'t');
            } else if (!Character.isLetterOrDigit(current)){
                id.deleteCharAt(i);
                i--;
            }
        } return id.toString();
    }
}
