package model;

import java.util.Date;

public class Appointment {
    private Date dayTime;
    private boolean isOpen;
    private String profId;
    private String studentId;

    public Appointment(Date dayTime, boolean isOpen, String profId, String studentId) {
        this.dayTime = dayTime;
        this.isOpen = isOpen;
        this.profId = profId;
        this.studentId = studentId;
    }

    public Date getDayTime() {
        return dayTime;
    }

    public void setDayTime(Date dayTime) {
        this.dayTime = dayTime;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getProfId() {
        return profId;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void showDate() {
    }

    public void availability() {
    }
}