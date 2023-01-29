package FirstStepsInCoding.other;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        //От конзолата се четат 4 числа, по едно на ред:
        //Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
        Scanner scanner=new Scanner(System.in);
        double PriceVegetablesPerKg=Double.parseDouble(scanner.nextLine());
        double PriceFruitPerKg=Double.parseDouble(scanner.nextLine());
        double AllKgVegetables=Double.parseDouble(scanner.nextLine());
        double AllKgFruit=Double.parseDouble(scanner.nextLine());
        double AllPriceFruit=PriceFruitPerKg*AllKgFruit;
        double AllPriceVegetables=PriceVegetablesPerKg*AllKgVegetables;
        double AllSum=AllPriceFruit+AllPriceVegetables;
// ако приемем, че едно евро е равно на 1.94лв)
        double SumInLv=AllSum/1.94;
        System.out.printf("%.2f",SumInLv);

        //Да се отпечата на конзолата едно число: приходите от всички плодове и зеленчуци в евро.
        //Резултата да се форматира до втория знак след десетичния разделител.
    }
}
