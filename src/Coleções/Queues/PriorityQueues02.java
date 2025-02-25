package Coleções.Queues;

import Coleções.Maps.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues02 {
    public static void main(String[] args) { // Queue (Fila) -> FIFO: First In First Out
        Consumidor consumidor1 = new Consumidor("Renzo");
        Consumidor consumidor2 = new Consumidor("Sofia");

        Queue<Consumidor> consumidorQueue = new PriorityQueue<>(((o1, o2) -> o1.getId().compareTo(o2.getId()))); //adicao de um comparator

        consumidorQueue.add(consumidor1); // ClassCastException -> não contém Comparable implementado
        consumidorQueue.add(consumidor2);

        while (!consumidorQueue.isEmpty()){
            System.out.println(consumidorQueue.poll());;
        }
        //Queues sâo úteis para dar prioridade, ou seja, como em uma fila, em que o primeiro a entrar deve ser priorizado, e nesse caso, a fila está ordenada por nome
    }
}
