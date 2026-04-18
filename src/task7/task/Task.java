package task7.task;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
private static int id;
private int taskId;
private String taskName;
private String description;
private Status status;
private Priority priority;
private LocalDate deadline;

    public Task(String taskName, String description, Status status, Priority priority, LocalDate deadline) {
        this.taskName = taskName;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.deadline = deadline;
        this.taskId=++id;
    }

    public int getTaskId() {
        return taskId;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return taskId == task.taskId && Objects.equals(taskName, task.taskName) && Objects.equals(description, task.description) && status == task.status && priority == task.priority && Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, description, status, priority, deadline);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}
