package model;

public class Professor extends Credentials {
    private String name;

    public Professor(String name, String username, String password) {
        super(username, password);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods from diagram
    public void verify() {
    }

    public void createAppointments() {
    }

    public void markAssignment() {
    }

    public void getReports() {
    }
}