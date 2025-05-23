package model;

public class Assignment {
    private String topic;
    private String startDate;
    private String language;
    private String technologies;
    private String proodos;

    public Assignment(String topic, String startDate, String language, String technologies, String proodos) {
        this.topic = topic;
        this.startDate = startDate;
        this.language = language;
        this.technologies = technologies;
        this.proodos = proodos;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getProodos() {
        return proodos;
    }

    public void setProodos(String proodos) {
        this.proodos = proodos;
    }

    public void showProodos() {
    }

    public void showDetails() {
    }
}