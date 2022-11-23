/**
 * 3. Реализовать простой калькулятор
 */
package homeWork1;


import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    private static final char[] SYMBOL_Operation = {'+', '-', '*', '/'};

    public static void main(String[] args) {

        double firstNumber = dataInput();
        double secondNumber = dataInput();
        char operation = inputOperation();
        System.out.println(calculator(firstNumber, secondNumber, operation));


    }

    private static double calculator(double firstNumber, double secondNumber, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
            break;

            case '-':
                result = firstNumber - secondNumber;
            break;

            case '*':
                result = firstNumber * secondNumber;
            break;

            case '/':
                result = firstNumber / secondNumber;
            break;
            default:
                System.out.println("Сложно! что-то не могу сосчитать");
                result = 0;
        }
        return result;
    }

    private static char inputOperation() {
        char operation;
        System.out.print("+  -  *  /\nВыбирите одну из операций предложенных выше: ");

        operation = scanner.next().charAt(0);
        if (!isOperation(operation)) {
            System.out.println("Не корректный ввод, попробуйте еще раз");
            operation = inputOperation();
        }

        return operation;
    }

    private static boolean isOperation(char symbol) {
        for (char c : SYMBOL_Operation) {
            if (symbol == c) return true;
        }
        return false;
    }

    private static int dataInput() {
        System.out.print("Введите целое положительное число: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Введеные вами данные не являются целым числом! Попробуйте еще раз");
            scanner.next();
            number = dataInput();
        }
        return number;
    }
}
