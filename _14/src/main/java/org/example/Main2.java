package org.example;
import java.io.*;
import java.util.Scanner;

public class Main2 {
    static void main() {
        String fileName = "f.txt";
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
        }

        System.out.println("\nЧисла из файла:");
        int sumNegative = 0;
        int countNegative = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.println(num);
                if (num < 0) {
                    sumNegative += num;
                    countNegative++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка формата числа: " + e.getMessage());
        }

        System.out.println("\nКоличество отрицательных чисел: " + countNegative);
        System.out.println("Сумма отрицательных чисел: " + sumNegative);
    }
}
