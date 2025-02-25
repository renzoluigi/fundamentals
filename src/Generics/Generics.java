package Generics;

public class Generics {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramentas(new Kunai("Explosiva"));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Salamaleico"));
        bolsaNinja.adicionarFerramentas(new Kunai("Invisivel"));
        bolsaNinja.adicionarFerramentas(new Shuriken(40));

        System.out.println("Itens da nossa bolsa ninja:");
        bolsaNinja.mostrarFerramentas();
    }
}
