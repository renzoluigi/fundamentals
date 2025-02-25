package Exercicios;

import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        boolean reverse = true;
        String strOfNumber = Integer.toBinaryString(number);
        while (strOfNumber.length() >= 5){
            if (strOfNumber.length()==5 && strOfNumber.charAt(0) == '1'){
                reverse = false;
            }
            int i = 1;
            strOfNumber = strOfNumber.substring(i);
        }
        int count = 0;
        List<Signal> lst = new ArrayList<>();
        for (char c: strOfNumber.toCharArray()){
            count++;
            if (c == '1'){
                String conv = c + String.valueOf("0").repeat(strOfNumber.length()-count);
                for (Signal s: Signal.values()){
                    if (s.getBin() == Integer.parseInt(conv)){
                        lst.add(s);
                    }
                }
            }
        } return reverse ? lst.reversed():lst;
    }

    public static void main(String[] args) {
        HandshakeCalculator a1 = new HandshakeCalculator();
        System.out.println(a1.calculateHandshake(2));
    }
}
