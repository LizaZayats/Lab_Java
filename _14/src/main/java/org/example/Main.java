package org.example;
import java.io. *;


public class Main {
    static void main() {

        String fileName = "game_info.txt";
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Любимая игра: Disco Elysium\n");
            writer.write("Жанр: RPG / детектив / визуальная новелла\n");
            writer.write("Разработчик: ZA/UM\n");
            writer.write("Издатель: ZA/UM\n");
            writer.write("Год выпуска: 2019\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("\nДанные о файле");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());


        System.out.println("\nСодержимое файла");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
