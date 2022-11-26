/**
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */
package homeWork2;


import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    static Logger logger = Logger.getLogger(Task2.class.getName());

    public static void main(String[] args) {
        int[] array = {12, 65, 23, 1, 25, 22, 8, 11};
        initialLogger();
        bubbleSort(array);
    }

    private static void initialLogger() {
        logger.setLevel(Level.INFO);
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }

    static void bubbleSort(int[] ar) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < ar.length; i++) {
                if (ar[i] < ar[i - 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i - 1];
                    ar[i - 1] = temp;
                    isSorted = false;
                }
            }
            logger.info(String.valueOf(convertToStringBuilder(ar)));
        }
    }

    static StringBuilder convertToStringBuilder(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        return sb.append("]");
    }
}



