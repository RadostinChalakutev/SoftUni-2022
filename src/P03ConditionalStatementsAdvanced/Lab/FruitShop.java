package P03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0;
        String Product = scanner.nextLine();
        String DayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        if (DayOfWeek.equals("Monday") ||
                DayOfWeek.equals("Tuesday") ||
                DayOfWeek.equals("Wednesday") ||
                DayOfWeek.equals("Thursday") ||
                DayOfWeek.equals("Friday")) {

            if (Product.equals("banana")) {
                price = 2.50;
            } else if (Product.equals("apple")) {
                price = 1.20;
            } else if (Product.equals("orange")) {
                price = 0.85;
            } else if (Product.equals("grapefruit")) {
                price = 1.45;
            } else if (Product.equals("kiwi")) {
                price = 2.70;
            } else if (Product.equals("pineapple")) {
                price = 5.50;
            } else if (Product.equals("grapes")) {
                price = 3.85;
            } else {
                System.out.println("error");
            }
        } else if (DayOfWeek.equals("Saturday")
                || DayOfWeek.equals("Sunday")) {


            if (Product.equals("banana")) {
                price = 2.70;
            } else if (Product.equals("apple")) {
                price = 1.25;
            } else if (Product.equals("orange")) {
                price = 0.90;
            } else if (Product.equals("grapefruit")) {
                price = 1.60;
            } else if (Product.equals("kiwi")) {
                price = 3.00;
            } else if (Product.equals("pineapple")) {
                price = 5.60;
            } else if (Product.equals("grapes")) {
                price = 4.20;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

        double sum = quantity * price;
        if (sum > 0) {
            System.out.printf("%.2f", sum);
        } else{
            System.out.println();
        }
    }
}

