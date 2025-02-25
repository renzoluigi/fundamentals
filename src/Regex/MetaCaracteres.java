package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCaracteres { //atalho para capturar determinados caracteres
    public static void main(String[] args) {
        // \d -> todos os digitos
        // \D -> tudo o que não for dígito
        // \s -> todos os espaços em branco (incluindo \t \n \f \r)
        // \S -> tudo que não for espaço em branco
        // \w -> tudo que for de a-z ou A-Z, dígitos, _ (excluindo todos os caracteres especiais
        // \W -> tudo que nao for incluso em \w (caracteres especiais

        //range
        // [] -> procura pelos caracteres informados dentro dos colchetes, como [abcABC] senco "a","b","c","A","B","C" separadamente
        // [a-zA-C] -> o hífen "-" pode ser usado para procurar de uma letra ate outra, como A-Z procurando todas as letras dentro do intervalo A-Z
        // 0[xX][a-fA-F\\d] -> procura numeros hexadecimais, procurando pela expressao regular que contenha 0 + x/X + (letras entre a/A - f/F ou digitos)
        // 0[xX][(a-fA-F\\d)]+(\\s|$) -> 0 + x/X + [(letras entre a/A - f/F ou digitos)]+ (representando uma ou mais ocorrencia dessas letras/digitos) + espaço ou fim da linha

        //modificadores
        // ? -> zero ou uma
        // * -> zero ou mais
        // + -> uma ou mais
        // {} -> {n,m}: de n até m ocorrências, como {0,3}: 0 a 3 ocorrências
        // () -> agrupamento
        // | -> o(c|v)o: ovo | oco
        // $ -> da ocorrência até o fim da linha
        // . -> caractere curinga, como em 1.3: 123 | 133 | 1@3 | 1A3 (qualquer coisa entre 1 e 3)
        // ^ -> começo da linha ou negação: ¨^\\w+¨ retorna do começo da linha até um caractere que não seja letra/digito/underscore, [^abc] retorna tudo que não for a | b | c (negação

        //zona de teste
        String regex = "([\\w\\._-])+@([\\w])+(\\.([\\w])+)+"; //expressao regular
        String texto = "renzooluigi@hotmail.com,sofia@gmail.com,5@f!4@gmail.com.br,teste@outlook.com,invalido@mail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);

        System.out.println("Email válido?" + "sofia@gmail.com".matches(regex));

        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.println("Posição:" + matcher.start() + " Caractere:" + matcher.group());
        }

    }
}

