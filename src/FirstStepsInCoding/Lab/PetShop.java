package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FoodDog = Integer.parseInt(scanner.nextLine());
        int FoodCat= Integer.parseInt(scanner.nextLine());
        double FinalPrice=(FoodDog*2.5)+(FoodCat*4);
        System.out.println(FinalPrice+" lv.");
    }
}
