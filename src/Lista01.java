import java.util.LinkedList;
import java.util.List;

public class Lista01 {
    public static void main(String[] args) {
        List <Integer> listaInteiros = new LinkedList<>();
        for (int i=0;i<=10;i++){
            listaInteiros.add(i);
        }
        System.out.println(listaInteiros);
    }
}
