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
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        String sqlRequest = "select * from students where \"name\":\"Ivanov\"," +
                " \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";

        String[] str = sqlRequest.split("where", 2);
        result.append(str[0]);
        result.append("where");
        result.append(stringFilter(str[1]));
        System.out.println(result);
    }

    static StringBuilder stringFilter(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strFilter = str.split(",");
        for (int i = 0; i < strFilter.length; i++) {
            if (i == strFilter.length - 1 && !strFilter[i].endsWith("\"null\"")) {
                sb.append((strFilter[i].replace(":", " = ").replace("\"", "")));
            } else if (!strFilter[i].endsWith("\"null\"")) {
                sb.append((strFilter[i].replace(":", " = ").replace("\"", "")));
                if (i != strFilter.length - 2) {
                    sb.append(" and");
                }
            }
        }
        return sb;
    }
}
