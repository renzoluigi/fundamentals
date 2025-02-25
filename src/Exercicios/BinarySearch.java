package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BinarySearch {
    List<Integer> items;

    BinarySearch(List<Integer> items) {
        Collections.sort(new ArrayList<>(items));
        this.items = items;
    }

    int indexOf(int item) throws ValueNotFoundException {
        if (!items.contains(item)) {
            throw new ValueNotFoundException("Value not in array");
        }
        return Collections.binarySearch(items, item);
    }
}
