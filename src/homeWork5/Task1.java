package homeWork5;

import java.util.*;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {
    public static void main(String[] args) {
        phoneBook();
    }

    private static void phoneBook() {
        Scanner scan = new Scanner(System.in);
        Map<String, List<Integer>> peopleAndNumbers = new HashMap<>();

        List<Integer> personNumbers = new ArrayList<>();
        personNumbers.add(1234);
        personNumbers.add(4321);

        List<Integer> person2Numbers = new ArrayList<>();
        person2Numbers.add(98765);
        person2Numbers.add(56789);

        peopleAndNumbers.put("Иванов", personNumbers);
        peopleAndNumbers.put("Петров", person2Numbers);

        while (true) {
            System.out.print("Введите ФИО для добавления записи, либо введите 'exit' для выхода: ");
            String namePerson = scan.next();

            if (namePerson.equals("exit")) {
                break;
            } else if (peopleAndNumbers.containsKey(namePerson)) {
                System.out.println("Такой человек есть, давайте добавим номер");
                System.out.print("Введите номер: ");
                peopleAndNumbers.get(namePerson).add(scan.nextInt());
            } else {
                List<Integer> numbers = new ArrayList<>();
                System.out.print("Введите номер: ");
                numbers.add(scan.nextInt());
                peopleAndNumbers.put(namePerson, numbers);
            }
        }
        System.out.println(peopleAndNumbers);
    }
}
