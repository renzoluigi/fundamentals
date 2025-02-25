package Coleções.Teste;

import Coleções.Dominio.Smartphone;

public class Equals {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1POO2","iPhone");
        Smartphone s2 = new Smartphone("IP33A","Samsung");
        Smartphone s3 = s1;
        System.out.println(s1.equals(s2)); //false
        //compara as referencias (composicao) dos objetos,
        System.out.println(s1.equals(s3)); // true

    }
}
