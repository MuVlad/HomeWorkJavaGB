package oop.homeWork4.reposirory;

import oop.homeWork4.entity.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskRepository implements IDataRepository<Long, Task> {
    private Map<Long, Task> taskMap = new HashMap<>();
    private Long taskId = 1L;

    public TaskRepository() {
    }
    public TaskRepository(Map<Long, Task> map) {
        this.taskMap = map;
    }

    @Override
    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Попытка сохранить null задачу!");
        }
        if (taskMap.isEmpty()) {
            task.setId(taskId);
        }
        for (Long id : taskMap.keySet()) {
            if (!id.equals(taskId)) {
                task.setId(taskId);
            }
        }
        taskMap.put(taskId++, task);
    }

    @Override
    public Task readTask(Long id) {
        Task getTask = taskMap.get(id);
        if (getTask == null) {
            throw new IllegalArgumentException("Такая задача не найдена!");
        }
        return getTask;
    }

    @Override
    public List<Task> readAllTasks() {
        return new ArrayList<>(taskMap.values());
    }

    @Override
    public void delete(Long id) {
        taskMap.remove(id);
    }
}
