package ConditionalStatementsAdvanced.other;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
        // На втория ред е категорията – "VIP" или "Normal"
        // На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]
        double Budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double sum = 0;
        double VIP = 499.99;
        double Normal = 249.99;

        switch (category) {
            case "VIP":
                if (people<5){
                    price=0.75*Budget;
                    sum=VIP*people;
                }
                else if (people <= 9) {
                    price = 0.60 * Budget;
                    sum = VIP * people;
                } else if (people <= 24) {
                    price = 0.50 * Budget;
                    sum = VIP * people;
                } else if (people <= 49) {
                    price = 0.40 * Budget;
                    sum = VIP * people;
                } else if (people>50){
                    price = Budget * 0.25;
                    sum = VIP * people;
                }
                break;
            case "Normal":

                if (people<5){
                    price=0.75*Budget;
                    sum=Normal*people;
                }
                else if ( people <= 9) {
                    price = 0.60 * Budget;
                    sum = Normal * people;
                } else if (people <= 24) {
                    price = 0.50 * Budget;
                    sum = Normal * people;
                } else if ( people <= 49) {
                    price = 0.40 * Budget;
                    sum = Normal * people;
                } else if(people>50) {
                    price = Budget * 0.25;
                    sum = Normal * people;
                }
                break;

        }
        double total =Budget-price;
        if (total > sum) {
            System.out.printf("Yes! You have %.2f leva left.", (total - sum));
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(sum-total));
        }
    }
}
