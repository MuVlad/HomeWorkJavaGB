package oop.homeWork4;

import oop.homeWork4.entity.Task;
import oop.homeWork4.entity.User;
import oop.homeWork4.importExportData.ExportDataCSVFile;
import oop.homeWork4.importExportData.ImportDataCSVFile;
import oop.homeWork4.reposirory.TaskRepository;
import oop.homeWork4.taskLevels.PriorityLevelAverage;
import oop.homeWork4.taskLevels.PriorityLevelHigh;
import oop.homeWork4.taskLevels.PriorityLevelLow;

/**
 * С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
 * Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
 * Например:
 * определить уровень приоритетов: низкий, средний, немедленное выполнение
 * выделить компоненту для хранения данных
 * выделить компоненту для организации импорта\экспорта данных
 * Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
 * данные хранятся в файле csv/jsom/xml
 * другие компоненты
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", "Pupkin");
        Task task1 = new Task(new PriorityLevelHigh(), "Сделать сайт Диме", "25.12.2022", "17.12.2022", user);
        Task task3 = new Task(new PriorityLevelLow(), "Сделать сайт Ане", "14.10.2022", "18.03.2023", user);
        Task task4 = new Task(new PriorityLevelHigh(), "Сделать сайт Пете", "25.12.2022", "18.01.2023", user);
        Task task2 = new Task(new PriorityLevelAverage(), "Сделать сайт Саше", "25.12.2022", "11.01.2023", user);
        ExportDataCSVFile exportData = new ExportDataCSVFile();
        ImportDataCSVFile importData = new ImportDataCSVFile();
        user.addTask(task1);
        user.addTask(task3);
        user.addTask(task2);
        user.addTask(task4);
        TaskRepository repo = new TaskRepository();
        repo.addTask(task1);
        repo.addTask(task2);
        repo.addTask(task3);
        repo.addTask(task4);

        // сортированный вывод задач(сортировка по уровню приоритетов, а если приоритеты равны то по дедлайну)
//        List<Task> sortTasks = repo.readAllTasks();
//        sortTasks.sort(new TaskComparator());
//        for (Task task : sortTasks) {
//            System.out.println(task);
//        }

        //Вывод на экран списока всех задач у всех пользователей
//        List<Task> taskList = repo.readAllTasks();
//        for (Task task : taskList) {
//            System.out.println(task.toString());
//        }

        //вывод на экран конкретоной задачи у конкретного пользователя
//        System.out.println(user.getTask(1));

        //вывод на экран всех задачь конкретного пользователя
//        List<Task> allTasks = user.getAllTasks();
//        for (Task task : allTasks) {
//            System.out.println(task.toString());
//        }

//        запись в файл всех задач у всех пользователей(Export)
//        exportData.write(repo);

//        чтение из файла всех задач всех у пользователей(Import)
//        TaskRepository map = new TaskRepository(importData.read());


    }
}
