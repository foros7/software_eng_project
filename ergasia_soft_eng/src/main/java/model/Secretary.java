package model;

public class Secretary extends Credentials {
    private String name;
    private String id;

    public Secretary(String name, String id, String username, String password) {
        super(username, password);
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Methods from diagram
    public void createStud() {
    }

    public void createProf() {
    }

    public void createAssignment() {
    }

    public void verify() {
    }
}