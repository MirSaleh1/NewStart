package task7;

import task7.task.Priority;
import task7.task.Status;
import task7.task.Task;
import task7.task.TaskService;
import task7.user.User;
import task7.user.UserService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    private static boolean finish = false;
    public static void main(String[] args) {

        while (!finish) {
            if (UserService.users.isEmpty()) {
                System.out.println("1-Regist");
                System.out.println("2-Exit");
                int choise=Integer.parseInt(sc.nextLine());
                switch (choise) {
                    case 1:
                        userRegist();
                        break;
                    case 2:
                        finish = true;
                        break;
                    default:
                        System.out.println("invalude argument");
                        break;
                }
            } else {
                afterOneRegistr();
            }
        }
    }
    private static void menuAfterOneRegistr() {
        System.out.println("1-Regist");
        System.out.println("2-Login");
        System.out.println("3-Exit");
    }
    private static void menuAfterLogin() {
        System.out.println("1-Add task for user");
        System.out.println("2-remove task for user");
        System.out.println("3-find user task");
        System.out.println("4-look user all tasks");
        System.out.println("5-canceled");
    }

    private static void afterOneRegistr() {
        menuAfterOneRegistr();
        int choise=Integer.parseInt(sc.nextLine());
        switch (choise) {
            case 1: userRegist();break;
            case 2: afterLogin();break;
            case 3:finish=true;break;
            default:
                System.out.println("invalude argumet");break;
        }
    }
    private static void afterLogin() {
        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();
        System.out.print("Please enter your password: ");
        String password = sc.nextLine();
        User curretUser = UserService.login(userName, password);
        while (curretUser != null) {
            menuAfterLogin();
            int choise = Integer.parseInt(sc.nextLine());

            switch (choise) {
                case 1:
                    TaskService.addTask(curretUser);
                    break;
                case 2:
                    TaskService.removeTask(curretUser);
                    break;
                case 3:
                    Task task=TaskService.findTask(curretUser);
                    if (task!=null) System.out.println(task);
                    else System.out.println("Task dosent exist");
                    break;
                case 4:
                    TaskService.printUserTask(curretUser);
                    break;
                case 5:
                    curretUser = null;
                    break;
                default:
                    System.out.println("invalude argument");
                    break;
            }
        }
    }
    private static void userRegist() {
        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();
        System.out.print("Please enter your password: ");
        String password = sc.nextLine();
        UserService.regist(userName, password);
    }
}

