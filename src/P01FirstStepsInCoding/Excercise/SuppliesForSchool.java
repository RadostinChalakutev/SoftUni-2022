package P01FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Брой пакети химикали - цяло число в интервала [0...100]
        //• Брой пакети маркери - цяло число в интервала [0...100]
        //• Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //• Процент намаление - цяло число в интервала [0...100]
        double packPens = Double.parseDouble(scanner.nextLine());
        double packMarkers = Double.parseDouble(scanner.nextLine());
        double savex = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        //Пакет химикали - 5.80 лв.
        //• Пакет маркери - 7.20 лв.
        //• Препарат - 1.20 лв (за литър)
        double PricePens = 5.80 * packPens;
        double PriceMarkers = 7.20 * packMarkers;
        double SavexPrice = 1.20 * savex;
        double totalSum = PricePens + PriceMarkers + SavexPrice;
     System.out.println(totalSum-(discount/100)*totalSum);
    }
}
