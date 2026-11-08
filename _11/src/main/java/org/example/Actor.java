package org.example;

public class Actor {
    private String name;
    private int age;
    private String genre;

    public Actor(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public void perform() {
        System.out.println("Выступает");
    }

    public void perform(String role) {
        System.out.println(name + " играет роль " + role);
    }

    public void perform(int scenes) {
        System.out.println(name + " играет в " + scenes + " сценах");
    }

    public void getAwards() {
        System.out.println("Нет наград");
    }
}
