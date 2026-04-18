package task7.task;

import task7.Main;
import task7.user.User;

import java.time.LocalDate;
public class TaskService {

    private static String taskName;
    public static void addTask(User user){
        Task currentTask=findTask(user);
        if (currentTask!=null){
            System.out.println("this task already exist");
            return;
        }
        user.getTasks().add(creatTask(taskName));

    }
    public static void removeTask(User user){
        Task currentTask=findTask(user);
        if (currentTask==null){
            System.out.println("this task dosent exist");
            return;
        }
        user.getTasks().remove(currentTask);
    }
    public static Task findTask(User user){
        System.out.print("Please enter task name: ");
         taskName = Main.sc.nextLine();
        for(Task currentTask:user.getTasks()){
            if (currentTask.getTaskName().equalsIgnoreCase(taskName)){
                return currentTask;
            }
        }
        return null;
    }
    public static void printUserTask(User user){
        for (Task task: user.getTasks()){
            System.out.println(task);
        }
    }
    private static Task creatTask(String taskName){
        System.out.print("Please enter description: ");
        String description = Main.sc.nextLine();
        Status status=getStatusFromUser();
        Priority priority=getPriorityFromUser();
        System.out.print("Year (e.g., 2026): ");
        int year = Integer.parseInt(Main.sc.nextLine());
        System.out.print("Month (1-12): ");
        int month = Integer.parseInt(Main.sc.nextLine());
        System.out.print("Day (1-31): ");
        int day = Integer.parseInt(Main.sc.nextLine());
        LocalDate deadline = LocalDate.of(year, month, day);
        return new Task(taskName, description, status, priority, deadline);
    }
    private static void statusMenu(){
        System.out.println("\nPlease choose status:");
        System.out.println("1. TODO");
        System.out.println("2. IN_PROGRESS");
        System.out.println("3. DONE");
        System.out.print("Your choice (1-3): ");
    }
    private static void priorityMenu(){
        System.out.println("\nPlease choose priority:");
        System.out.println("1. LOW");
        System.out.println("2. MEDIUM");
        System.out.println("3. HIGH");
        System.out.print("Your choice (1-3): ");
    }
    private static Status getStatusFromUser(){
        Status status = null;
        while (status == null) {
            statusMenu();
            String choice = Main.sc.nextLine();
            switch (choice) {
                case "1":
                    status = Status.TODO;
                    break;
                case "2":
                    status = Status.IN_PROGRESS;
                    break;
                case "3":
                    status = Status.DONE;
                    break;
                default:
                    System.out.println("Error: pls input 1, 2 or 3.");
            }
        }
        return status;
    }
    private static Priority getPriorityFromUser(){
        Priority priority = null;
        while (priority == null) {
            priorityMenu();
            String choice = Main.sc.nextLine();
            switch (choice) {
                case "1":
                    priority = Priority.LOW;
                    break;
                case "2":
                    priority = Priority.MEDIUM;
                    break;
                case "3":
                    priority = Priority.HIGH;
                    break;
                default:
                    System.out.println("Error: pls input 1, 2 or 3.");
            }
        }
        return priority;
    }
}
