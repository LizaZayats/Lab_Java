package org.example;
import java.io.*;
import java.util.Scanner;

public class Main5 {
    static void main() {
        String fileName = "f3.txt";
        Scanner console = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                while (!console.hasNextInt()) {
                    System.out.print("Ошибка! Введите целое число: ");
                    console.next();
                }
                int num = console.nextInt();
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int countLessThanMinus10 = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nЧисла из файла:");
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.println(num);
                if (num < -10) {
                    countLessThanMinus10++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка формата: " + e.getMessage());
        }

        System.out.println("\nКоличество чисел, меньших -10: " + countLessThanMinus10);
    }
}
