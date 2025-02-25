import java.util.LinkedList;
import java.util.Queue;

public class EstruturaQueue { //FIFO (First In, First Out)
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //adicionar
        fila.add("Renzo");
        fila.add("Denize");
        fila.add("Sofia");

        //mostrar a fila
        System.out.println("Fila: " + fila);

        //tirar pessoas da fila
        fila.poll();
        System.out.println("Fila depois do .pool: " + fila);

        //ver primeiro
        System.out.println("Primeiro da fila (HEAD): " + fila.peek());

        //vazio?
        System.out.println("A lista está vazia? " + fila.isEmpty());
    }
}
