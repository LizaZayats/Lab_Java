import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите номер задания (1,2,3,4): ");
        int v = scanner.nextInt();
        scanner.nextLine();
        switch (v) {
            case 1:
                System.out.print("Введите строку начиная с большой буквы: ");
                String str = scanner.nextLine();
                boolean isHi = str.startsWith("Привет");
                if (isHi) {
                    System.out.print("Строка начинается с подстроки Привет");
                } else {
                    System.out.print("Строка не начинается с подстроки Привет");
                }
                break;
            case 2:
                System.out.print("Введите белорусский номер телефона: ");
                String rgstr = scanner.nextLine();
                boolean res = rgstr.matches("\\+375\\s?\\d{2}\\s?\\d{7}");
                if (res) {
                    System.out.print("Спасибо, номер корректный");
                } else {
                    System.out.print("Вы ввели некорректный номер");
                }
                break;
            case 3:
                Employee[] emp = {
                        new Employee("Иванов Андрей Сергеевич", 1500.452),
                        new Employee("Шистексовская Ксения Андреевна", 2500.41),
                        new Employee("Анханскелькая Надежда Сергеевна", 2300.50)
                };
                Report.generateReport(emp);
                break;
            case 4:
                String str4 = "aba abba abbba abbbba";
                String[] as = str4.split(" ");
                Pattern p = Pattern.compile("ab{3}a");
                Matcher m = p.matcher(str4);
                while (m.find()) {
                    System.out.println(m.group());
                }
                break;
            default:
                System.out.print("Вы ввели ошибочное значение");
        }
        scanner.close();
    }
}