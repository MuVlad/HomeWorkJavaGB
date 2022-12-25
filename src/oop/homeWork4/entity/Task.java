package oop.homeWork4.entity;

import oop.homeWork4.taskLevels.IPriorityLevel;
import oop.homeWork4.taskLevels.PriorityLevelAverage;
import oop.homeWork4.taskLevels.PriorityLevelHigh;
import oop.homeWork4.taskLevels.PriorityLevelLow;

public class Task {
    private Long id;
    private IPriorityLevel level;
    private String descriptionTask;
    private String dateStart;
    private String dateEnd;
    private User user;

    public Task(IPriorityLevel level, String descriptionTask, String dateStart, String dateEnd, User user) {
        this.level = level;
        this.descriptionTask = descriptionTask;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.user = user;
    }

    public Task() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLevel() {
        return level.getLevel();
    }

    public void setLevel(IPriorityLevel level) {
        this.level = level;
    }

    public void setLevel(int i) {
        switch (i) {
            case 1:
                this.level = new PriorityLevelLow();
                break;
            case 2:
                this.level = new PriorityLevelAverage();
                break;
            case 3:
                this.level = new PriorityLevelHigh();
                break;
        }

    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", level=" + level.getLevel() +
                ", descriptionTask='" + descriptionTask + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", user=" + user.getFullName() +
                '}';
    }
}
