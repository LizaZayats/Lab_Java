package org.example;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<String, Film> film = new HashMap<>();
        film.put("Первый экшн фильм", new Action("Реальные события", 0, 2.40, 15));
        film.put("Второй экшн фильм", new Action("Взрывные котята", 1, 1.40, 1));
        film.put("Третий экшн фильм", new Action("Физика", 2, 3.40, 99));
        film.put("Первый комедийный фильм", new Comedy("Мэм", 0, 1.10, 9.2));
        film.put("Второй комедийный фильм", new Comedy("Хиханьки", 1, 1.30, 7.2));
        film.put("Третий комедийный фильм", new Comedy("Хаханьки", 2, 0.90, 10));
        film.put("Первый драмматичный фильм", new Drama("Конец семестра", 0, 2.30, 1));
        film.put("Второй драмматичный фильм", new Drama("Сессия", 1, 2.50, 3));

        for (Map.Entry<String, Film> f : film.entrySet()) {
            System.out.print(f.getKey() + ": ");
            f.getValue().printInfo();
        }
    }
}
