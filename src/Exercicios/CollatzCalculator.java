package Exercicios;

class CollatzCalculator {

    int computeStepCount(int start) {
        int repeats = 0;
        if (start <= 0){
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
         while (start != 1){
             start = start % 2 == 0 ? start/2:start*3+1;
             repeats++;
         } return repeats;
    }

}
