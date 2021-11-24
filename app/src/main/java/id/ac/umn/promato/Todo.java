package id.ac.umn.promato;

import java.util.Date;

public class Todo {
    private String userEmail;
    private String task;
    private String date;

    public Todo() {

    }

    public Todo( String task, String date) {
//        this.userEmail = userEmail;
        this.task = task;
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}