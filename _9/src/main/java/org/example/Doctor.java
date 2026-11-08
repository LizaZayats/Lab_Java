package org.example;

class Doctor extends Professional {
    private String specialization;

    public Doctor(String name, int experience, double rating, String specialization) {
        super(name, experience, rating);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Лечит пациентов");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Диагностика и лечение");
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + getName() + ", Специализация: " + specialization + ", Опыт: " + getExperience() + " лет, Рэйтинг: " + getRating());
    }

}