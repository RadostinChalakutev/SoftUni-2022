package P02ConditionalStatements.Excercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double exPrice=Double.parseDouble(scanner.nextLine());
        double puzzle=Double.parseDouble(scanner.nextLine());
        double dolls=Double.parseDouble(scanner.nextLine());
        double  bears=Double.parseDouble(scanner.nextLine());
        double minions=Double.parseDouble(scanner.nextLine());
        double truck=Double.parseDouble(scanner.nextLine());
        double ToysCount=puzzle+dolls+bears+minions+truck;

        double Sum=puzzle*2.60+dolls*3+bears*4.10+minions*8.20+truck*2;
        if (ToysCount>=50){
            Sum=Sum*0.75;
        }
        Sum=Sum*0.9;
        if (exPrice<=Sum){
            System.out.printf("Yes! %.2f lv left.",Sum-exPrice);
        } else  {
            System.out.printf("Not enough money! %.2f lv needed.",exPrice-Sum);
        }
    }
}
