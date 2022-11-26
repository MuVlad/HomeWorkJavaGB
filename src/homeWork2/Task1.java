/**
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки. Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * то есть должно получиться что-то вроде:
 * ... where name = Ivanov and country = Russia and city = Moscow
 */
package homeWork2;

//код получился весь из костылей надеюсь вы покажите хорошее решение!
public class Task1 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String sqlRequest = "select * from students where ";
        String json = "\"name\":\"Ivanov\"," +
                " \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"18\"";

        result.append(sqlRequest);
        result.append(stringFilter(json));
        System.out.println(result);
    }

    static StringBuilder stringFilter(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strFilter = str.split(",");
        for (int i = 0; i < strFilter.length; i++) {
            if (!strFilter[i].endsWith("\"null\"")) {
                sb.append((strFilter[i].replace(":", " = ").replace("\"", "")));
                sb.append(" and");
            }
        }
        return sb;
    }
}


