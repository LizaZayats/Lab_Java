package org.example;

public class Film {
    private String title;
    private int id;
    private double duration;//prodolzitelnost

    public Film(String title, int id, double duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public double getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void printInfo() {
        System.out.printf("%s, длительность: %.2f часа", title, duration);
    }
}
