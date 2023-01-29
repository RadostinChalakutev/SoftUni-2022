package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity=Double.parseDouble(scanner.nextLine());
        double price = 0;
        if (town.equals("Sofia")) {
            if (Product.equals("coffee"))
                price = 0.50;
            else if (Product.equals("water")) {
                price = 0.80;
            } else if (Product.equals("beer")) {
                price = 1.20;
            } else if (Product.equals("sweets")) {
                price = 1.45;
            } else if (Product.equals("peanuts")) {
                price = 1.60;
            }
        } else if (town.equals("Plovdiv")) {
            if (Product.equals("coffee"))
                price = 0.40;
            else if (Product.equals("water")) {
                price = 0.70;
            } else if (Product.equals("beer")) {
                price = 1.15;
            } else if (Product.equals("sweets")) {
                price = 1.30;
            } else if (Product.equals("peanuts")) {
                price = 1.50;
            }

        } else if (town.equals("Varna")) {
            if (Product.equals("coffee"))
                price = 0.45;
            else if (Product.equals("water")) {
                price = 0.70;
            } else if (Product.equals("beer")) {
                price = 1.10;
            } else if (Product.equals("sweets")) {
                price = 1.35;
            } else if (Product.equals("peanuts")) {
                price = 1.55;
            }

        }double sum=quantity*price;
        if (price>0){
            System.out.println(sum);
        }else {
            System.out.println("error");
        }
    }
}
