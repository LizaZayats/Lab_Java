package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Hotel> hotels = new ArrayList<>();

        try {
            hotels.add(new Hotel("Grand Plaza", "Минск", 5, 2));
            hotels.add(new Hotel("City Inn", "Гомель", 3, 3));
            hotels.add(new Hotel("Sunrise", "Брест", 4, 1));
            hotels.add(new Hotel("Old Town", "Гродно", 2, 5));
            hotels.add(new Hotel("Skyline", "Витебск", 5, 4));
        } catch (InvalidHotelDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        System.out.println("до");
        for (Hotel h : hotels) System.out.println(h);

        try {
            hotels.get(0).bookRoom();
            hotels.get(0).bookRoom();
            hotels.get(0).bookRoom();
        } catch (RoomNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            hotels.get(1).checkOut();
            hotels.get(1).checkOut();
        } catch (InvalidHotelDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        Hotel notFound = null;
        try {
            if (notFound == null)
                throw new HotelNotFoundException("Отель не найден");
            notFound.bookRoom();
        } catch (HotelNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (RoomNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("после");
        for (Hotel h : hotels) System.out.println(h);

    }
}
