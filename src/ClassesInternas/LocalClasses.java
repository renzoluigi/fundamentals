package ClassesInternas;

public class LocalClasses {
    // classes locais: são classes dentro de métodos
    private String name = "Midoriya";

    void print(String param) {
        name = "Renzo";
        //param = ""; //-> é final, portanto não pode ter seu valor alterado
        String lastName = "Izuku"; // é automaticamente final
        //lastName = "ABC"; //-> é final, portanto não pode ter seu valor alterado

        final class LocalClass { // classe pode ser abstrata ou final
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        // o único jeito de acessar a classe é instanciando ela dentro do metodo
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
        // ou
        // new LocalClass.printLocal();
    }

    public static void main(String[] args) {
        LocalClasses localClasses = new LocalClasses();
        localClasses.print("parametros tambem sao finais");
    }
}
