package org.example;

import java.io.*;
import java.util.Scanner;

public class Main4 {
    static void main() {

        String fileName = "time.txt";
        Scanner console = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите 15 значений времени в секундах:");
            for (int i = 0; i < 15; i++) {
                System.out.print("Значение " + (i + 1) + ": ");
                while (!console.hasNextDouble()) {
                    System.out.print("Ошибка! Введите число: ");
                    console.next();
                }
                double value = console.nextDouble();
                writer.write(String.valueOf(value).replace(',', '.') + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nЗначения из файла:");
            while ((line = reader.readLine()) != null) {
                double value = Double.parseDouble(line.trim().replace(',', '.'));
                System.out.println(value);
                sum += value;
                count++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка формата: " + e.getMessage());
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("\nСреднее время: %.3f секунд%n", average);
        } else {
            System.out.println("Нет данных для расчёта.");
        }
    }
}
