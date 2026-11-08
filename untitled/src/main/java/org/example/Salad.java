package org.example;

class Salad extends Food {
    private String dressing;

    public Salad(String name, int calories, int cookingTime, String dressing) {
        super(name, calories, cookingTime);
        this.dressing = dressing;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    @Override
    public void cook() {
        System.out.println("Салат " + getName() + " нарезается и смешивается.");
    }

    public void addDressing(String newDressing) {
        this.dressing = newDressing;
        System.out.println("Заправка для салата изменена на: " + newDressing);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}