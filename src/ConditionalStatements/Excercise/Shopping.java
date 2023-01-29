package ConditionalStatements.Excercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PeterBudget = Double.parseDouble(scanner.nextLine());

        int GraphicCardNum = Integer.parseInt(scanner.nextLine());

        int ProcessorsNum = Integer.parseInt(scanner.nextLine());

        int RamNum = Integer.parseInt(scanner.nextLine());

        double PriceGraphicCard=GraphicCardNum*250;
        double PriceProcessor = 0.35 * PriceGraphicCard;
        double PriceRam = PriceGraphicCard * 0.10;
        double totalPrice=PriceGraphicCard+PriceProcessor*ProcessorsNum+RamNum*PriceRam;

        if (GraphicCardNum >ProcessorsNum) {
            totalPrice=totalPrice*0.85;
        }
        if (PeterBudget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", PeterBudget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - PeterBudget);
        }
    }
}
