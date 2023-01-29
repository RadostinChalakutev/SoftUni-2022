package ExamJavaSept2022;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double goalforTheday = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double sum = 0;

        while (!input.equals("closed")) {
            String object1 = input;//podstrigwane ili boqdiswane
            if (input.equals("haircut")) {
                String haircuttype = scanner.nextLine();
                switch (haircuttype) {
                    case "mens":
                        price = 15;
                        break;
                    case "ladies":
                        price = 20;
                        break;
                    case "kids":
                        price = 10;
                        break;

                }
            } else if (input.equals("color")) {
                String colorType = scanner.nextLine();
                switch (colorType) {
                    case "touch up":
                        price = 20;
                        break;
                    case "full color":
                        price = 30;
                        break;
                }

            }
            sum = sum + price;
            if (sum >= goalforTheday) {
                break;
            }
            input = scanner.nextLine();
        }
        if (goalforTheday <= sum) {
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %.0flv.", sum);
        } else {
            System.out.printf("Target not reached! You need %.0flv. more.%n",goalforTheday-sum);
            System.out.printf("Earned money: %.0flv.", sum);

        }
    }
}
