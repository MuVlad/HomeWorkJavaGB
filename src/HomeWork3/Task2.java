package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(3);
        listNumbers.add(6);
        listNumbers.add(7);
        listNumbers.add(10);
        listNumbers.add(2);
        listNumbers.add(13);
        listNumbers.add(8);
        listNumbers.add(41);

        System.out.println(listNumbers);
        removingDuplicates(listNumbers);
        System.out.println(listNumbers);
    }

    private static void removingDuplicates(ArrayList<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            if (iter.next() %2 ==0){
                iter.remove();
            }
        }
    }
}


