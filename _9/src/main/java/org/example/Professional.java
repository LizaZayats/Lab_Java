package org.example;

public abstract class Professional {
    private String name;
    private int experience;
    private double rating;

    public Professional(String name, int experience, double rating) {
        this.name = name;
        this.experience = experience;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public abstract void work();

    public abstract void getResponsibilities();

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Опыт:" + experience + " лет, Рэйтинг:" + rating);
    }
}


