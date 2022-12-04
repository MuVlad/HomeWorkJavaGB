package homeWork4;

import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class Task1 {

    public static void main(String[] args) {
        LinkedList<String> listString = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            listString.add("Строка" + i);
        }
        System.out.println(listString);
        revers(listString);
        System.out.println(listString);
    }

    private static void revers(LinkedList<String> list) {
        String temp;
        for (int i = 0; i < list.size()/2; i++) {
            temp = list.remove(i);
            list.add(i, list.remove(list.size() - i - 1));
            list.add(list.size() - i, temp);
        }
    }
}
