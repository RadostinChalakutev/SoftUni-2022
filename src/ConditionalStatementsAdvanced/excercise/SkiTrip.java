package ConditionalStatementsAdvanced.excercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//"room for one person" – 18.00 лв за нощувка
//▪ "apartment" – 25.00 лв за нощувка
//▪ "president apartment" – 35.00 лв за нощувка
        int day = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String mark = scanner.nextLine();
        double Nightprice = 0;
        double discount = 0.0;
        double nights = day - 1;
        double total = 0;

        switch (type) {
            case "room for one person":
                Nightprice = 18.0;
                total = nights * Nightprice;
                break;
            case "apartment":
                Nightprice = 25.0;
                total = nights * Nightprice;
                if (nights <= 10) {
                    total = total * 0.70;
                } else if (nights > 10 && nights <= 15) {
                    total = total * 0.65;
                } else {
                    total = total * 0.50;
                }
                break;
            case "president apartment":
                Nightprice = 35.00;
                total = nights * Nightprice;
                if (nights <= 10) {
                    total = total * 0.9;
                } else if (nights > 10 && nights <= 15) {
                    total = total * 0.85;
                } else {
                    total = total * 0.80;
                }
                break;
        }
        if (mark.equals("positive")) {
            total = total * 1.25;
            System.out.printf("%.2f", total);
        } else if (mark.equals("negative")) {
            total = total * 0.90;
            System.out.printf("%.2f", total);
        }


    }
}
