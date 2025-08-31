package com.app.to_do_app.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String taskName;
    private LocalDateTime dueTime;
    private String priority;
    private String status;
    private boolean isActive;

    public Tasks() {
    }

    public Tasks(long id, String taskName, LocalDateTime dueTime, String priority, String status, boolean isActive) {
        this.id = id;
        this.taskName = taskName;
        this.dueTime = dueTime;
        this.priority = priority;
        this.status = status;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDateTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalDateTime dueTime) {
        this.dueTime = dueTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
