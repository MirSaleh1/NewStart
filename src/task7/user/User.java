package task7.user;

import task7.task.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private int personId;
    private static int id=0;
    private String userName;
    private String password;
    private List<Task>tasks=new ArrayList<>();


    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        personId=++id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return personId == user.personId && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(tasks, user.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, userName, password, tasks);
    }
}
