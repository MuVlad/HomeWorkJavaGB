/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
package homeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.print("Введите целое положительное число: ");

        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введеные вами данные не являются целым числом!");
            e.printStackTrace();
        }

        if (!isPositiveDigit(number)) {
            System.out.println("Число должно быть положительным!");
        }
        System.out.printf("Треугольного число %d = %d%n", number, calculateTriangularNumber(number));
        System.out.printf("Факториал числа %d = %d%n", number,calculateFactorial(number));
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
