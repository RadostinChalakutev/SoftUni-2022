package FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int chickMenu=Integer.parseInt(scanner.nextLine());
        int FMenu=Integer.parseInt(scanner.nextLine());
        int VegMenu=Integer.parseInt(scanner.nextLine());
        //Пилешко меню – 10.35 лв.
        //• Меню с риба – 12.40 лв.
        //• Вегетарианско меню – 8.15 лв.
        double chickenMenu=chickMenu*10.35;
        double FishMenu=FMenu*12.40;
        double VegetableMenu=VegMenu*8.15;
        double Sum=chickenMenu+VegetableMenu+FishMenu;
        double Dessert=Sum*0.2;
        double delivery=2.50;
        double AllSum=Sum+delivery+Dessert;
        System.out.println(AllSum);


    }

}
