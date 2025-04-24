package com.example.cookingsystem.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "progress_updates")
public class ProgressUpdate {

    @Id
    private String id;

    private String title;            // Title of the progress update
    private String update;           // Description of what happened
    private boolean goalsAchieved;   // Whether user achieved their goal

    @DBRef
    private User user;               // Reference to the user

    private Date createdAt;          // Timestamp

    // Constructors

    public ProgressUpdate() {
        this.createdAt = new Date();
    }

    public ProgressUpdate(String title, String update, boolean goalsAchieved, User user) {
        this.title = title;
        this.update = update;
        this.goalsAchieved = goalsAchieved;
        this.user = user;
        this.createdAt = new Date();
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public boolean isGoalsAchieved() {
        return goalsAchieved;
    }

    public void setGoalsAchieved(boolean goalsAchieved) {
        this.goalsAchieved = goalsAchieved;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}