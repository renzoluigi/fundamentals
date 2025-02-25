package Exercicios;

public class StringBuilds {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Renzo"); //A diferenca da classe involucra String para StringBuilder eh que enquanto String eh imutavel, StringBuilder eh totalmente mutavel

        sb.append(" Cutrim"); //adiciono " Cutrim" a string

        sb.insert(6,"Luigi "); //insiro "Luigi " na posicao 6
        System.out.println(sb);

        sb.delete(6,11); //deleto os caracteres de 6 a 11

        sb.replace(6,sb.length(),"de Lima"); //apago o conteudo da posicao 6 ate o final da String e realoco a string "de Lima" nessa mesma posicao
        System.out.println(sb);

        sb.reverse(); //a String tem seus caracteres invertidos
        System.out.println(sb);

        System.out.println(sb.charAt(2)); //mostra o caractere na posicao 2

        System.out.println(sb.substring(5,10));//mostra a substring de 5a10, tambem serve para instanciar uma nova String a partir da substring

        sb.setLength(0); //limpa a string
        System.out.println(sb);
    }
}
