package oop.homeWork4;

import oop.homeWork4.entity.Task;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        int flag = o1.getLevel() - o2.getLevel();
        if (flag == 0) {
            String o1Date = o2.getDateEnd().replace(".", "");
            String o2Date = o2.getDateEnd().replace(".", "");
            flag = o1Date.compareTo(o2Date);
        }
        return flag;
    }
}
