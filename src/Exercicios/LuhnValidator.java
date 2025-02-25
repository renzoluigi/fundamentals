package Exercicios;

import java.lang.Character;

class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replace(" ", "");
        if (candidate.isEmpty() || !candidate.matches("\\d+")) {
            return false;
        }
        if (candidate.length() == 1 && candidate.charAt(0) == '0') {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < candidate.length(); i++) {
            int digit = Character.getNumericValue(candidate.charAt(candidate.length() - 1 - i));
            if (i % 2 == 1) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }return sum % 10 == 0;
    }
}