package core.homeWork4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 1) Написать метод, который принимает массив элементов,
 * помещает их в стэк и выводит на консоль содержимое стэка.
 * 2) Написать метод, который принимает массив элементов,
 * помещает их в очередь и выводит на консоль содержимое очереди.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arrayNumbers = {32,45,12,5,9,2,17,25};
        System.out.println(convertToStack(arrayNumbers));
        System.out.println(convertToQueue(arrayNumbers));

    }
    private static Stack<Integer> convertToStack(int[] array) {
        Stack<Integer> stackNumbers = new Stack<>();
        for (int i : array) {
            stackNumbers.add(i);
        }
        return stackNumbers;
    }

    private static Queue<Integer> convertToQueue(int[] array) {
        Queue<Integer> queueNumbers = new LinkedList<>();
        for (int i : array) {
            queueNumbers.add(i);
        }
        return queueNumbers;
    }
}
