package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String regex = "aba"; //expressao regular
        String texto = "abaaba";
        String texto2 = "ababba";
        String texto3 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(texto);
        Matcher matcher2 = pattern.matcher(texto2);
        Matcher matcher3 = pattern.matcher(texto3);


        System.out.println("Texto: " + texto);
        System.out.println("Texto2: " + texto2);
        System.out.println("Regex: " + regex);

        System.out.println("Posições encontradas em Texto: ");
        while (matcher1.find()) {
            System.out.print(matcher1.start() + " " + matcher1.group() + " ");
        }

        System.out.println();
        System.out.println("Posições encontradas em Texto2: ");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " " + matcher2.group() + " ");
        }

        System.out.println();
        System.out.println("Posições encontradas em Texto3: ");
        while (matcher3.find()) {
            System.out.print(matcher3.start() + " " + matcher3.group() + " ");
        }
    }
}
