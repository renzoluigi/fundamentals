package Exercicios;

class ReverseString {
    String reverse(String inputString) {
        StringBuilder reversed = new StringBuilder(inputString).reverse();
        return reversed.toString();
    }
}
