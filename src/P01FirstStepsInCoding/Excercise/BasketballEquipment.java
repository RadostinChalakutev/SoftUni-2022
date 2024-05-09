package P01FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       double Tax=Double.parseDouble(scanner.nextLine());
       double percent=40;
       double percent1=20;
       double sneakers=Tax-(percent/100*Tax);
       double kit=sneakers-(percent1/100*sneakers);
       double ball=0.25*kit;
       double hang=0.2*ball;
       double AllSum=Tax+kit+ball+hang+sneakers;
       System.out.println(AllSum);

        // Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

    }
}
