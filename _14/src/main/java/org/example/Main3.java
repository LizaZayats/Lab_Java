package org.example;
import java.util.Random;
import java.io.*;

public class Main3 {
    static void main() {
        String fileF = "f2.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";
        Random random = new Random();

        try (FileWriter writerF = new FileWriter(fileF)) {
            for (int i = 0; i < 20; i++) {
                int num = random.nextInt(201) - 100;
                writerF.write(num + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в f2: " + e.getMessage());
            return;
        }

        System.out.println("Содержимое файла f2:");
        try (BufferedReader readerF = new BufferedReader(new FileReader(fileF));
             FileWriter writerG = new FileWriter(fileG);
             FileWriter writerH = new FileWriter(fileH)) {

            String line;
            while ((line = readerF.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.println(num);

                if (num % 10 == 0) {
                    writerG.write(num + "\n");
                } else {
                    writerH.write(num + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка обработки: " + e.getMessage());
        }

        System.out.println("\nФайл g (кратные 10):");
        printFile(fileG);
        System.out.println("\nФайл h (остальные):");
        printFile(fileH);
    }

    private static void printFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения " + fileName + ": " + e.getMessage());
        }
    }
}
