/**
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки. Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * то есть должно получиться что-то вроде:
 * ... where name = Ivanov and country = Russia and city = Moscow
 */
package core.homeWork2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        String sqlRequest = "select * from students where ";
        String json = "\"name\":\"Ivanov\"," +
                " \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";

        String result = sqlRequest + streamFilter(json);
        System.out.println(result);
    }

    // это какая-то костыльная получилась сортировка
    static StringBuilder stringBuilderFilter(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strFilter = str.split(",");
        for (String s : strFilter) {
            if (!s.endsWith("\"null\"")) {
                sb.append((s.replace(":", " = ").replace("\"", "")));
                sb.append(" and");
            }
        }
        if (String.valueOf(sb).endsWith("and")) {
            sb.delete(sb.length() - 4, sb.length());
        }
        return sb;
    }

    static String streamFilter(String str) {
        String[] strFilter = str.split(",");
        return Arrays.stream(strFilter)
                        .filter(s -> !s.contains("null"))
                        .map(s -> s.replace(":"," = "))
                        .map(s -> s.replace("\"",""))
                        .collect(Collectors.joining(" and"));
    }
}


