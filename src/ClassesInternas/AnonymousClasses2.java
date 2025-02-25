package ClassesInternas;

import Coleções.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class SmartphoneSerialNumberComparator implements Comparator<Smartphone> {
//    @Override
//    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
//        return smartphone1.getSerialNumber().compareTo(smartphone2.getSerialNumber());
//    }
//}

public class AnonymousClasses2 { // classes que vão existir por um breve período dentro do código, mas não podem ser reutilizadas em nenhum outro lugar
    public static void main(String[] args) { // servem para mudar algo que não precisa ser mudado para sempre (como uma sobreposicao de uso unico)
        List<Smartphone> smartphoneList = new ArrayList<>(List.of(new Smartphone("110002","Xiaomi"), new Smartphone("333333","Apple"), new Smartphone("349211", "Pineapple")));

        smartphoneList.sort(new Comparator<Smartphone>() { // -> so funciona com classes abstratas
            @Override
            public int compare(Smartphone smartphone1, Smartphone smartphone2) {
                return smartphone1.getSerialNumber().compareTo(smartphone2.getSerialNumber());
            }
        }); // -> utilizando classes anonimas invés de criar uma classe comparator

        System.out.println(smartphoneList);
    }
}
