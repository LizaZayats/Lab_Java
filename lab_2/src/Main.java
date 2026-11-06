import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите номер задания (1,2): ");
        int v = scanner.nextInt();
        switch (v) {
            case 1:
                System.out.print("Введите размер массива: ");
                int n = scanner.nextInt();
                double[] arr = new double[n];
                double sum = 0;
                System.out.print("Введите значения массива: ");
                for (int i = 0; i < n; i++) {
                    double numb = scanner.nextDouble();
                    arr[i] = numb;
                    if (i % 2 == 0) {
                        sum += arr[i];
                    }
                }
                System.out.print("Сумма элементов на четных позициях: " + sum);
                break;
            case 2:
                System.out.println("Значения элементов главной диагонали возведены в квадрат.");
                int[][] ary = new int[4][4];
                for (int i = 0; i < ary.length; i++) {
                    for (int j = 0; j < ary[i].length; j++) {
                        ary[i][j] = random.nextInt(100);
                        System.out.print(ary[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Значения элементов главной диагонали возведены в квадрат.");
                for (int i = 0; i < ary.length; i++) {
                    System.out.print((int) Math.pow(ary[i][i], 2) + " ");
                }
                break;
            default:
                System.out.print("Вы ввели ошибочное значение");
        }
        scanner.close();
    }
}