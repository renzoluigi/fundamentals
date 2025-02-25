import java.util.Arrays;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        String texto = "renzooluigi@hotmail.com,sofia@gmail.com,5@f!4@gmail.com.br,teste@outlook.com,invalido@mail";
        System.out.println(Arrays.asList(texto.split(",")));
        System.out.println(texto.split(",")[1]);
    }
}