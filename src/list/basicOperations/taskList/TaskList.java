package list.basicOperations.taskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public static void main(String[] args) {
        TaskList tasks = new TaskList();
        tasks.addTask("task 1");
        System.out.printf("Você tem %d tarefa(s)\n", tasks.totalTasks());
        tasks.addTask("task 2");
        System.out.printf("Você tem %d tarefa(s)\n", tasks.totalTasks());
        tasks.addTask("task 3");
        System.out.printf("Você tem %d tarefa(s)\n", tasks.totalTasks());
        tasks.removeTask("task 1");
        System.out.printf("Você tem %d tarefa(s)\n", tasks.totalTasks());

        tasks.showTasks();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> toRemove = new ArrayList<>();
        for(Task t : taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                toRemove.add(t);
            }
        }

        taskList.removeAll(toRemove);
    }

    public int totalTasks() {
        return taskList.size();
    }

    public void showTasks() {
        if (taskList.isEmpty()) {
            System.out.println("Você não tem task cadastradas.");
        } else {
            taskList.forEach(task -> System.out.println(task.toString()));
        }
    }
}
