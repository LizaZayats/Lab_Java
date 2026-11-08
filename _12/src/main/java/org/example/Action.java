package org.example;

public class Action extends Film {
    private int explosions;

    public Action(String title, int id, double duration, int explosions) {
        super(title, id, duration);
        this.explosions = explosions;
    }

    public int getExplosions() {
        return explosions;
    }

    public void setExplosions(int explosions) {
        this.explosions = explosions;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(", количество взрывов: " + explosions +" штук\n");
    }
}
