package Exercicios;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        int count;
        for (int i=0;i<phrase.length();i++){
            count = 0;
            for (int v=0;v<phrase.length();v++){
                if (phrase.toLowerCase().charAt(i) == phrase.toLowerCase().charAt(v) && phrase.toLowerCase().charAt(i) != '-' && phrase.toLowerCase().charAt(i) != ' '){
                    count++;
                    if (count > 1){
                        return false;
                    }
                }
            }
        } return true;
    }

}
