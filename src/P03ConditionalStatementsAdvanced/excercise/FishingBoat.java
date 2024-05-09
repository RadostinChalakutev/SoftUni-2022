package P03ConditionalStatementsAdvanced.excercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Бюджет на групата – цяло число в интервала [1…8000]
        //• Сезон – текст : "Spring", "Summer", "Autumn", "Winter"
        //• Брой рибари – цяло число в интервала [4…18]
        int Budget=Integer.parseInt(scanner.nextLine());
        String season=scanner.nextLine();
        int fishmanNum=Integer.parseInt(scanner.nextLine());
        double price=0;
       //Цената за наем на кораба през пролетта е 3000 лв.
        //• Цената за наем на кораба през лятото и есента е 4200 лв.
        //• Цената за наем на кораба през зимата е 2600 лв.
        switch (season){
            case"Spring":
                price=3000;
                break;
            case "Summer":
            case "Autumn":
                price=4200;
                break;
            case "Winter":
                price=2600;
                break;
        }
        //Ако групата е до 6 човека включително – отстъпка от 10%.
        //• Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
        //• Ако групата е от 12 нагоре – отстъпка от 25%.
        if (fishmanNum<=6){
            price=price*0.9;
        } else if (fishmanNum>=7&&fishmanNum<=11) {
            price=price*0.85;

        } else if (fishmanNum>=12) {
            price=price*0.75;

        }
        if (fishmanNum%2==0 &&!(season.equals("Autumn"))) {
            price = price * 0.95;
        }
    //Yes! You have {останалите пари} leva left."
    if(Budget>=price){
        System.out.printf("Yes! You have %.2f leva left.",Budget-price);
    }
//"Not enough money! You need {сумата, която не достига} leva.""
    else {
        System.out.printf("Not enough money! You need %.2f leva.",price-Budget);

    }

    }
}
