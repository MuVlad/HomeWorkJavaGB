package homeWork5;

import java.util.*;

/**
 * Пусть дан список сотрудников:Иван Иванов Светлана Петрова Кристина Белова Анна Мусина
 * Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова
 * Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> names = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");

        printMap(repeatedNames(names));
    }

    private static Map<String, Integer> repeatedNames(List<String> list) {
        Map<String, Integer> namesAndRepetitions = new LinkedHashMap<>();

        for (String name : list) {
            String[] s = name.split(" ");
            if (namesAndRepetitions.containsKey(s[0])) {
                int count = namesAndRepetitions.get(s[0]);
                namesAndRepetitions.put(s[0], count + 1);
            } else namesAndRepetitions.put(s[0], 1);
        }
        Map<String, Integer> forIteration = new LinkedHashMap<>(namesAndRepetitions);
        for (Map.Entry<String, Integer> stringIntegerEntry : forIteration.entrySet()) {
            if (stringIntegerEntry.getValue() < 2) {
                namesAndRepetitions.remove(stringIntegerEntry.getKey());
            }
        }
        sortedMap(namesAndRepetitions);
        return namesAndRepetitions;
    }

    private static void sortedMap(Map<String, Integer> map) {
        List list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " колличество повторений = " + stringIntegerEntry.getValue());
        }
    }
}
