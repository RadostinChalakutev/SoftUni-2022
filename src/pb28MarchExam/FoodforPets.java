package pb28MarchExam;

import java.util.Scanner;

public class FoodforPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Брой дни – цяло число в диапазона [1…30]
        // Общо количество храна – реално число в диапазона [0.00…10000.00]
        int days = Integer.parseInt(scanner.nextLine());
        double volume = Double.parseDouble(scanner.nextLine());
        double sumDog = 0;
        double sumCat = 0;
        int counter = 0;
        double gift = 0;
        double allSum=0;
        double allGift=0;

        for (int i = 1; i <= days; i++) {
            double volumeDog = Double.parseDouble(scanner.nextLine());
            double volumeCat = Double.parseDouble(scanner.nextLine());
            sumDog = sumDog + volumeDog;
            sumCat = sumCat + volumeCat;
            counter++;
            if (i % 3 == 0) {
                gift = 0.1 * (volumeDog + volumeCat);
                allGift+=gift;

            }
        }
         allSum = sumCat + sumDog;
        double percentallSum = (allSum / volume) * 100;
        double percentDog = (sumDog / allSum) * 100;
        double percentCat = (sumCat / allSum) * 100;


        System.out.printf("Total eaten biscuits: %.0fgr.%n", allGift);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentallSum);
        System.out.printf("%.2f%% eaten from the dog.%n", percentDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentCat);


    }
}
