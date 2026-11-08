import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Laptop lap1=new Laptop("Cool_Laptop",360,500,234.56);
        double newPrice = lap1.applyDiscount(20);
        System.out.printf("Цена со скидкой: %.2f", newPrice);
    }
}