package Exercicios;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Separado por virgula,ponto.e espacos  duplos";
        String[] arr = str.split("[,\\s.]+");
        for (String s :arr){
            System.out.println(s);
        }
    }
}
