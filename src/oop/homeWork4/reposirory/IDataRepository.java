package oop.homeWork4.reposirory;

import java.util.List;

public interface IDataRepository<ID, ENTITY> {
    void addTask(ENTITY entity);
    ENTITY readTask (ID id);
    List<ENTITY> readAllTasks();
    void delete (ID id);
}
