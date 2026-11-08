package org.example;

class Hotel {
    private String name;
    private double pricePerNight;
    private int stars;

    public Hotel() {
        this.name = "Нет";
        this.pricePerNight = 0;
        this.stars = 0;
    }

    public Hotel(String name, double pricePerNight, int stars) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getStars() {
        return stars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public static Hotel maxStars(Hotel[] hotels) {
        Hotel hs = hotels[0];
        for (Hotel h : hotels) {
            if (h.stars > hs.stars) {
                hs = h;
            }
        }
        return hs;
    }

    public static Hotel maxPrice(Hotel[] hotels) {
        Hotel hp = hotels[0];
        for (Hotel h : hotels) {
            if (h.pricePerNight > hp.pricePerNight) {
                hp = h;
            }
        }
        return hp;
    }

    @Override
    public String toString() {
        return String.format("%s (звезд: %d, %.2f руб/ночь)", name, stars, pricePerNight);
    }
}