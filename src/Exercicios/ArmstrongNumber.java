package Exercicios;

import java.lang.Character;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int tot = 0;
        String strNumber = String.valueOf(numberToCheck);
        for (int i = 0; i < strNumber.length(); i++) {
            int actual = Character.getNumericValue(strNumber.charAt(i));
            actual = (int) Math.pow(actual, strNumber.length());
            tot += actual;
        }
        return tot==numberToCheck;
    }
}
