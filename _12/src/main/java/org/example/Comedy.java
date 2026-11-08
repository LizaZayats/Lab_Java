package org.example;

public class Comedy extends Film {
    private double funnyRating;

    public Comedy(String title, int id, double duration, double funnyRating) {
        super(title, id, duration);
        this.funnyRating = funnyRating;
    }

    public double getFunnyRating() {
        return funnyRating;
    }

    public void setFunnyRating(double funnyRating) {
        this.funnyRating = funnyRating;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(", рейтинг смеха: " + funnyRating + " звезд\n");
    }
}
