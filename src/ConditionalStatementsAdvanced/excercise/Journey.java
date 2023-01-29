package ConditionalStatementsAdvanced.excercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double Budget=Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        double price=0;
        String nameDestination="";
        String typeHoliday="";
        //При 100лв. или по-малко – някъде в България
        //o Лято – 30% от бюджета
        //o Зима – 70% от бюджета
        //• При 1000лв. или по малко – някъде на Балканите
        //o Лято – 40% от бюджета
        //o Зима – 80% от бюджета
        //• При повече от 1000лв. – някъде из Европа

        if (Budget<=100){
            nameDestination="Bulgaria";
            switch (season){
                case "summer":
                    price=0.3*Budget;
                    typeHoliday="Camp";
                    break;
                case "winter":
                    price=0.7*Budget;
                    typeHoliday="Hotel";
                    break;
            }
        }else if (Budget>100&&Budget<=1000){
            nameDestination="Balkans";
            switch (season){
                case "summer":
                    price=0.4*Budget;
                    typeHoliday="Camp";
                    break;
                case "winter":
                    price=0.8*Budget;
                    typeHoliday="Hotel";
                    break;
            }
        } else if (Budget>1000) {
            nameDestination="Europe";
           switch (season) {
               case "summer":
                   price = 0.9 * Budget;
                   typeHoliday="Hotel";
                   break;
               case "winter":
                   price = 0.9 * Budget;
                   typeHoliday="Hotel";
                   break;
           }
        }
        System.out.printf("Somewhere in %s%n",nameDestination);
        System.out.printf("%s - %.2f",typeHoliday,price);

    }
}
