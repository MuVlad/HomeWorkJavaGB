package oop.homeWork4.importExportData;

import oop.homeWork4.entity.Task;
import oop.homeWork4.entity.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ImportDataCSVFile implements IImportDataFile<Long, Task> {
    public ImportDataCSVFile() {
    }

    @Override
    public Map<Long, Task> read() {
        Map<Long, Task> dataMap = new HashMap<>();
        Task task;
        User user;
        try (Scanner scan = new Scanner(new File("src/oop/homeWork4/data.csv"))) {
            while (scan.hasNextLine()) {
                task = new Task();
                user = new User();
                String str = scan.nextLine();
                String[] split = str.split(",");
                for (String s : split) {
                    String[] split1 = s.split(":");
                    for (int j = 0; j < split1.length; j++) {
                        if (split1[j].contains("id")) {
                            task.setId(Long.valueOf(split1[j + 1]));
                        } else if (split1[j].contains("уровень приоритета")) {
                            task.setLevel(Integer.parseInt(split1[j + 1]));
                        } else if (split1[j].contains("описание задачи")) {
                            task.setDescriptionTask(split1[j + 1]);
                        } else if (split1[j].contains("дата создания задачи")) {
                            task.setDateStart(split1[j + 1]);
                        } else if (split1[j].contains("дедлайн задачи")) {
                            task.setDateEnd(split1[j + 1]);
                        } else if (split1[j].contains("фио автора")) {
                            String[] split2 = split1[j + 1].split(" ");
                            user.setFirstName(split2[0]);
                            user.setLastName(split2[1]);
                        }
                    }
                }
                task.setUser(user);
                user.addTask(task);
                dataMap.put(task.getId(), task);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return dataMap;
    }
}
