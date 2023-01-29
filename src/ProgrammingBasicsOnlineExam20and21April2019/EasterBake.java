package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Integer.parseInt(scanner.nextLine());
        double sumSugar = 0;
        double sumFlour = 0;
        double packSugar = 0;
        double packFlour = 0;
        double maxSugar = 0;
        double maxFlour = 0;

        for (int i = 1; i <= n; i++) {
            double  sugar = Integer.parseInt(scanner.nextLine());
            double  flour = Integer.parseInt(scanner.nextLine());

            sumSugar += sugar;
            sumFlour += flour;

            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }

        }
        packSugar = Math.ceil(sumSugar / 950);
        packFlour = Math.ceil(sumFlour / 750);
        System.out.printf("Sugar: %.0f%n", packSugar);
        System.out.printf("Flour: %.0f%n", packFlour);
        System.out.printf("Max used flour is %.0f grams, max used sugar is %.0f grams.", maxFlour, maxSugar);

    }
}
