package core.homeWork4;

import java.util.LinkedList;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    static LinkedList<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        System.out.println(queue);
        System.out.println(dequeue() + " -> " + queue);
        System.out.println(first() + " -> " + queue);
    }

    private static void enqueue(int num) {
        queue.addLast(num);
    }

    private static int dequeue() {
        return queue.removeFirst();
    }

    private static int first() {
        return queue.getFirst();
    }
}

