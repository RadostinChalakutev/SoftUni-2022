package P01FirstStepsInCoding.other;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double PriceStrawberry=Double.parseDouble(scanner.nextLine());
        double BananasInKg=Double.parseDouble(scanner.nextLine());
        double OrangeInKg=Double.parseDouble(scanner.nextLine());
        double RaspberryInKg=Double.parseDouble(scanner.nextLine());
        double StrawberryInKg=Double.parseDouble(scanner.nextLine());
        //цената на малините е на половина по-ниска от тази на ягодите;
        //цената на портокалите е с 40% по-ниска от цената на малините;
        //цената на бананите е с 80% по-ниска от цената на малините.
        double RaspberryPrice=PriceStrawberry-(PriceStrawberry*0.5);
        double OrangePrice=RaspberryPrice-(RaspberryPrice*0.4);
        double BananasPrice=RaspberryPrice-(RaspberryPrice*0.8);
        double SumStrawberry=PriceStrawberry*StrawberryInKg;
        double SumBananas= BananasPrice*BananasInKg;
        double SumOrange=OrangeInKg*OrangePrice;
        double SumRaspberry=RaspberryInKg*RaspberryPrice;
        double AllSum=SumBananas+SumOrange+SumRaspberry+SumStrawberry;
        System.out.printf("%.2f",AllSum);


    }
}
