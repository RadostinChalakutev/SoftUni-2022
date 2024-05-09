package P02ConditionalStatements.other;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        // 2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        // 3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        // 4ти ред: брой работници – цяло число в интервала [1 … 20]
        double area=Double.parseDouble(scanner.nextLine());
        double areaPerGrapes=Double.parseDouble(scanner.nextLine());
        double neededLitraVine=Double.parseDouble(scanner.nextLine());
        double numpeople=Double.parseDouble(scanner.nextLine());
        double totalVine=area*areaPerGrapes;
        double Vine=(0.4*totalVine)/2.5;
        double disclaim=Vine-neededLitraVine;
        double literPerPerson=disclaim/numpeople;
        if (Vine>neededLitraVine){
            //Good harvest this year! Total wine: 208 liters.
            //33 liters left -> 11 liters per person.
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Vine);
            System.out.printf("%.0f liters left -> %.0f liters per person.",disclaim,literPerPerson);
        }else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",neededLitraVine-Vine);
        }

    }
}
