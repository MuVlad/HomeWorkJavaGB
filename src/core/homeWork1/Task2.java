/**
 * 2. Вывести все простые числа от 1 до 1000
 */
package core.homeWork1;

public class Task2 {
    public static void main(String[] args) {
        int limit = 1000;

        for (int i = 1; i < limit; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int j = 2; j * j <= number; j++) {
            if ((number % j) == 0) {
                return false;
            }
        }
        return true;
    }
}
