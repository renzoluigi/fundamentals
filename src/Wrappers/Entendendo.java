package Wrappers;

public class Entendendo {
    public static void main(String[] args) {
        //tipo primitivos
        byte aByte = 1;
        short aShort = 1;
        int anInt = 1;
        long aLong = 10L; //ou apenas 10
        float aFloat = 1f;
        double aDouble = 10d; // ou 10f;
        char aChar =  'W';
        boolean aBoolean = false;

        //classes wrapper (objetos)
        Byte wByte = 1;
        Short wShort = 1; //autoboxing ou boxing, tipo (primitivo -> wrapper)
        Integer wInt = 1;
        Long wLong = 10L;
        Float wFloat = 1f;
        Double wDouble = 10d; // apenas 10d;
        Character wChar = 'W';
        Boolean wBoolean = false;

        //unboxing (wrapper -> tipo primitivo)
        int i = wInt;
        boolean verdadeiro = Boolean.parseBoolean("tRUE"); //se nao for um valor valido, torna false
        System.out.println(verdadeiro);

        //tipos de referencia (começam sempre com a letra maiúscula), tambem objetos
        String a = "String";

    }
}
