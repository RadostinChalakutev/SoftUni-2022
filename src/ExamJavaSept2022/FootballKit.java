package ExamJavaSept2022;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //На първия ред - цената на тениската – реално число в интервала [1.00 ... 1000.00]
        // На втория ред - сумата, която трябва да достигне, за да спечели топка – реално число в интервала
        //[100.00 ... 10 000.00]
        double priceShirt=Double.parseDouble(scanner.nextLine());
        double reachedSum=Double.parseDouble(scanner.nextLine());
        double priceShorts=priceShirt*0.75;
        double priceSocks=priceShorts*0.20;
        double priceShoes=(priceShirt+priceShorts)*2;
        double totalSum=priceShirt+priceShorts+priceSocks+priceShoes;
        double Sumafterdiscount=totalSum-(totalSum*0.15);
        if (Sumafterdiscount>=reachedSum){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",Sumafterdiscount);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",reachedSum-Sumafterdiscount);
        }
    }
}
