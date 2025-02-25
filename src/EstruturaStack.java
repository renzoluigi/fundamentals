import java.util.Stack;

public class EstruturaStack {
    public static void main(String[] args){ //FILO (First In, Last Out)
        Stack<String> pilha = new Stack<>();
        pilha.push("Renzo");
        pilha.push("Denize");
        pilha.push("Sofia");

        System.out.println("Elemento do topo da Stack: " + pilha.peek());

        System.out.println("Elemento removido: " + pilha.pop()); //30
        System.out.println("Elemento removido: " + pilha.pop()); //20

        System.out.println("A pilha está vazia? " + pilha.isEmpty()); //false

        System.out.println("Tamanho da pilha: " + pilha.size()); //1
    }
}
