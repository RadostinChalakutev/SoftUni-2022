package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double allPrice = 0;
        double basket = 1.50;
        double wreath = 3.80;
        double chocolateBunny = 7;
        int counter = 0;
        double discount = 0;

        double totalSum = 0;

        for (int i = 1; i <= people; i++) {
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                switch (input) {
                    case "basket":
                        totalSum += basket;
                        counter++;
                        break;
                    case "wreath":
                        totalSum += wreath;
                        counter++;
                        break;
                    case "chocolate bunny":
                        totalSum += chocolateBunny;
                        counter++;
                        break;
                }
                input = scanner.nextLine();

            }
            if (counter % 2 == 0) {
                discount = 0.2 * totalSum;
                totalSum = totalSum - discount;
            }

            if (input.equals("Finish")) {
                allPrice += totalSum;
                System.out.printf("You purchased %d items for %.2f leva.%n", counter, totalSum);
                counter = 0;
                totalSum = 0;
            }
        }
        double average=allPrice/people;
        System.out.printf("Average bill per client is: %.2f leva.",average);
    }
}

