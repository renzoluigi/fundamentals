import java.lang.Character;

public class Chars {
    public static void main(String[] args) {
        char letra = 'Z'; //chars sao representados com aspas simples, strings com aspas duplas
        int code = letra;
        char n = '9';
        letra = Character.toLowerCase(letra);
        int number = Character.getNumericValue(n);
        number += 4;
        System.out.println(number);
        System.out.println(Character.isDigit(n));
    }
}
