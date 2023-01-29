package ForLoop.excercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
       
       Scanner scanner=new Scanner(System.in);
       //Възрастта на Лили - цяло число в интервала [1...77]
        //
        //· Цената на пералнята - число в интервала [1.00...10 000.00]
        //
        //· Единична цена на играчка - цяло число в интервала [0...40]
        
        int age =Integer.parseInt(scanner.nextLine());
        double PriceWashMachine=Double.parseDouble(scanner.nextLine());
        int priceToy=Integer.parseInt(scanner.nextLine());
        double money=0;
        double numToys=0;
        double savemoney=0;
        double giftSum=0;

       for (int birthday=1;birthday<=age;birthday++){

           if (birthday%2==0){
               giftSum+=10;
               savemoney+=giftSum-1;

               //pari

           }else {
               //igrachka
               numToys++;
           }
        }

        double totalsum=(numToys*priceToy)+savemoney;
       if (totalsum>=PriceWashMachine){
           System.out.printf("Yes! %.2f",totalsum-PriceWashMachine);

       }else {
           double diff=PriceWashMachine-totalsum;
           System.out.printf("No! %.2f",diff);
       }
    }
}
