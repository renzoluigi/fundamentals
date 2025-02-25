package ClassesInternas;

class Animal {
    public void walk(){
        System.out.println("Animal walking");
    }
}
public class AnonymousClasses { // classes que vão existir por um breve período dentro do código, mas não podem ser reutilizadas em nenhum outro lugar
    public static void main(String[] args) { // servem para mudar algo que não precisa ser mudado para sempre (como uma sobreposicao de uso unico)
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");;
            }
        };
        animal.walk();

    }
}
