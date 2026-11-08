package org.example;

public class Main {
    static void main(String[] args) {
        Food[] menu = new Food[5];
        menu[0] = new Pizza("Маргарита", 1200, 20, "Сыр, томаты");
        menu[1] = new Pizza("Пепперони", 1500, 25, "Колбаса, сыр");
        menu[2] = new Pizza("4 Сыра", 1600, 22, "Моцарелла, Пармезан");
        menu[3] = new Salad("Цезарь", 350, 10, "Майонез");
        menu[4] = new Salad("Греческий", 200, 8, "Оливковое масло");
        for (Food food : menu) {
            food.displayInfo();
            food.cook();
        }
        Pizza myPizza = (Pizza) menu[0];
        myPizza.addTopping("Оливки");
        Salad mySalad = (Salad) menu[3];
        mySalad.addDressing("Соус Цезарь");
    }
}
