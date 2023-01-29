package ConditionalStatements.Excercise;

import java.awt.*;
import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Budget = Double.parseDouble(scanner.nextLine());
        double NumExtra = Double.parseDouble(scanner.nextLine());
        double PriceOfDress = Double.parseDouble(scanner.nextLine());
        double decor =Budget*0.1;
        double SumDress=PriceOfDress*NumExtra;

        if (NumExtra>150){
             SumDress=SumDress*0.9;

        }
        double totalSum=decor+SumDress;
        if (totalSum>Budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalSum-Budget);
        } else{
            System.out.println("Action!" );
            System.out.printf("Wingard starts filming with %.2f leva left.",Budget-totalSum);
        }

    }
}
