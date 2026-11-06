import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания(1,2,3): ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.print("Введите 5 чисел через enter: ");
                int sumNum = 0;
                int count = 0;
                do {
                    int num = scanner.nextInt();
                    sumNum += num;
                    count++;
                }
                while (count < 5);
                int avg = sumNum / 5;
                System.out.print("Среднее арифметическое этих 5 чисел = " + avg);
                break;
            case 2:
                System.out.print("Введите сумму покупки: ");
                double sum = scanner.nextDouble();
                double SumWithSale;
                if (sum > 1000) {
                    SumWithSale = sum - (sum * 10 / 100);
                    System.out.print("Скидка 10%, итогавая сумма: " + SumWithSale);
                } else {
                    SumWithSale = sum - (sum * 5 / 100);
                    System.out.print("Скидка 5%, итогавая сумма: " + SumWithSale);
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.print("Вы ввели неправильное значение!");
        }
        scanner.close();
    }
}