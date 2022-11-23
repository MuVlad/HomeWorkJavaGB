/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
package homeWork1;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = inputData();
        System.out.printf("Треугольного число %d = %d%n", number, calculateTriangularNumber(number));
        System.out.printf("Факториал числа %d = %d%n", number, calculateFactorial(number));

    }

    private static int inputData() {
        System.out.print("Введите целое положительное число: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (!isPositiveDigit(number)) {
                System.out.println("Необходимо ввести положительное число");
                number = inputData();
            }
        } else {
            System.out.println("Введеные вами данные не являются целым числом! Попробуйте еще раз");
            scanner.next();
            number = inputData();
        }
        return number;
    }

    private static boolean isPositiveDigit(int number) {
        return number > 0;
    }

    private static int calculateTriangularNumber(int number) {
        int triangularNumber = 0;
        for (int i = 1; i <= number; i++) {
            triangularNumber += i;
        }
        return triangularNumber;
    }

    private static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
