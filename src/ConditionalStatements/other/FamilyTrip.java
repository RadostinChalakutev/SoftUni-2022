package ConditionalStatements.other;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        //Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        // Брой нощувки – цяло число в интервала [0 … 1000]
        // Цена за нощувка – реално число в интервала [1.00 … 500.00]
        // Процент за допълнителни разходи – цяло число в интервала [0 … 100]

       Scanner scanner=new Scanner(System.in);
       double budget=Double.parseDouble(scanner.nextLine());
       int SleepyNum=Integer.parseInt(scanner.nextLine());
       double PriceSleepy=Double.parseDouble(scanner.nextLine());
       int PercentExtraMinus=Integer.parseInt(scanner.nextLine());
       double SumSleepy=SleepyNum*PriceSleepy;
       double SumExtraMinus=(PercentExtraMinus*budget)/100;
       double TripSum=SumSleepy+SumExtraMinus;

       // ако броят на нощувките е по-голям от 7, цената за нощувка се намаля с 5%.

        if (SleepyNum>7) {
            SumSleepy = SumSleepy - (SumSleepy * 0.05);
        }
        if (budget>TripSum){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-TripSum);
        } else if (TripSum>budget) {
            System.out.printf("%.2f leva needed.",TripSum-budget);
        }
    }
}
