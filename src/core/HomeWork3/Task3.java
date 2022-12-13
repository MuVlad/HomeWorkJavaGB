package core.HomeWork3;

import java.util.*;

/**
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее из этого списка.
 */
public class Task3 {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            listNumbers.add((int) (Math.random() * 100));

//            так я думаю нельзя
//            Collections.min(listNumbers);
//            Collections.max(listNumbers);

        System.out.println(listNumbers);
        System.out.println("min: " + searchMin(listNumbers));
        System.out.println("max: " + searchMax(listNumbers));
        System.out.println("average: " + searchAverage(listNumbers));
    }

    private static int searchMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    private static int searchMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    private static double searchAverage(List<Integer> list) {
        double average = 0;
        for (Integer integer : list) {
            average += integer;
        }
        return average / list.size();
    }
}
