public class IndexString {
    public static void main(String[] args) {

        String str = "Esse é um exemplo de string.";

        //usando contains()
        System.out.println(str.contains("Luxxta")); //retorna false
        System.out.println(str.contains("string")); //retorna true

        //usando indexOf()
        System.out.println(str.indexOf("Luxxta")); //retorna a index da palavra, se nao estiver dentro da String, é retornado -1.
        System.out.println(str.indexOf("string"));
    }
}
