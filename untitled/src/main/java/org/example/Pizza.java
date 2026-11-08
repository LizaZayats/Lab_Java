package org.example;

class Pizza extends Food {
    private String toppings;

    public Pizza(String name, int calories, int cookingTime, String toppings) {
        super(name, calories, cookingTime);
        this.toppings = toppings;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public void cook() {
        System.out.println("Пицца " + getName() + " запекается в духовке.");
    }

    public void addTopping(String newTopping) {
        this.toppings += ", " + newTopping;
        System.out.println("Добавлена начинка: " + newTopping + ". Теперь начинки: " + this.toppings);
    }
}
