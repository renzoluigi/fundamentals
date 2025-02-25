package ClassesInternas;

public class OuterClasses { // classe externa
    private String name = "Monkey D. Luffy";

    private class Inner { // classe interna
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // sempre se refere ao objeto em questão (interno)
            System.out.println(OuterClasses.this); // para referenciar o objeto externo

        }
    }

    public static void main(String[] args) {
        OuterClasses outerClass = new OuterClasses();
        Inner inner = outerClass.new Inner();
        // ou
        Inner inner2 = new OuterClasses().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
