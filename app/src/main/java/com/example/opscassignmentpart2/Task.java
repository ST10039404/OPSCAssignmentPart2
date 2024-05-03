package com.example.opscassignmentpart2;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Task {

    private int task_id;
    private String Name;
    private String Category;
    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;

    public Task(String Name, String Category, Date startDate, Date endDate, Time startTime, Time endTime)
    {
        this.Name = Name;
        this.Category = Category;
        try
        {
            this.startDate = startDate;
            this.endDate = endDate;
        } catch(Exception e) {
            setDefaultDates();
        }


        try
        {
            this.startTime = startTime;
            this.endTime = endTime;
        } catch(Exception e) {
            setDefaultTimes();
        }
    }

    public Task()
    {

    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public void setDefaultTimes() {
        this.startTime = Time.valueOf("12:00:00");
        this.endTime = Time.valueOf("12:00:00");
    }

    public void setDefaultDates() {
        this.startDate = Date.valueOf("0001-01-01");
        this.endDate = Date.valueOf("1999-12-31");
    }
}
