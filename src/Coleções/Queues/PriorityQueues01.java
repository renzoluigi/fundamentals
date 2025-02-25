package Coleções.Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues01 {
    public static void main(String[] args) { // Queue (Fila) -> FIFO: First In First Out
        Queue<String> fila = new PriorityQueue<>();
        fila.add("B");
        fila.add("D");
        fila.add("C");
        fila.add("A");
        while (!fila.isEmpty()) {
            System.out.println(fila.peek()); // -> retorna mas não remove a HEAD da Queue
            System.out.println(fila.poll()); // -> retorna e remove a HEAD da Queue
        }
    }
}
