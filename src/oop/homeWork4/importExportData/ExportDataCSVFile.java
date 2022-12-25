package oop.homeWork4.importExportData;

import oop.homeWork4.TaskComparator;
import oop.homeWork4.entity.Task;
import oop.homeWork4.reposirory.TaskRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportDataCSVFile implements IExportDataFile<TaskRepository> {
    public ExportDataCSVFile() {
    }

    public void write(TaskRepository repository) {
        try (FileWriter writer = new FileWriter("src/oop/homeWork4/data.csv", true)) {
            StringBuilder sBuilder = new StringBuilder();
            List<Task> tasks = repository.readAllTasks();
            tasks.sort(new TaskComparator());
            for (Task task : tasks) {
                sBuilder.append("id:").append(task.getId()).append(",");
                sBuilder.append("уровень приоритета:").append(task.getLevel()).append(",");
                sBuilder.append("описание задачи:").append(task.getDescriptionTask()).append(",");
                sBuilder.append("дата создания задачи:").append(task.getDateStart()).append(",");
                sBuilder.append("дедлайн задачи:").append(task.getDateEnd()).append(",");
                sBuilder.append("фио автора:").append(task.getUser().getFullName()).append("\n");
            }
            writer.write(sBuilder.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
