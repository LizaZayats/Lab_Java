package org.example;

public class App {
    public static void main(String[] args) {
        //1
        Product p1 = new Product("Морковь", 2.50, 10);
        System.out.println("Общая стоимость: " + p1.totalCost());
        System.out.println(p1);
        //2
        Hotel[] arrHotel = {
                new Hotel("Лизяо", 190.90, 3),
                new Hotel("Зингер", 200.50, 5),
                new Hotel("Полиндрик", 450.50, 4),
                new Hotel("NotCool", 40.50, 1),
                new Hotel("Lol", 67.69, 2),
                new Hotel("idk", 100.17, 3)
        };
        System.out.println("Отель с максимальным кол-вом звезд: " + Hotel.maxStars(arrHotel));
        System.out.println("Самый дорогой отель: " + Hotel.maxPrice(arrHotel));

        //3
        Book[] arrBook = {
                new Book("Лизяо", Genre.FICTION),
                new Book("Зингер", Genre.NON_FICTION),
                new Book("Полиндрик", Genre.FANTASY),
                new Book("CoolBook", Genre.FANTASY),
                new Book("Страх", Genre.HISTORY)
        };
        System.out.println("Фэнтези-книги: " + Book.findFantasy(arrBook));
    }
}
