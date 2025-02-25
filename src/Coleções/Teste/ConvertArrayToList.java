package Coleções.Teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer[] listToArray = integerList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray)); //visualizacao de array

        System.out.println("---------");
        Integer[] integersArray = new Integer[3];
        integersArray[0] = 1;
        integersArray[1] = 2;
        integersArray[2] = 3;
        List<Integer> arrayToList = Arrays.asList(integersArray); // !!lista ligada ao Array
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(integersArray));
        System.out.println(arrayToList);
//        arrayToList.remove(2); //UnsupportedOperationException

        System.out.println("---------");
        //para criar uma lista nao ligada ao array
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(integersArray));
        arrayList.add(4);
        arrayList.removeFirst();
        System.out.println(arrayList);

        // tambem pode ser usado como:
        System.out.println("---------");
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5); // ou List.of(1,2,3,4,5)

    }
}
