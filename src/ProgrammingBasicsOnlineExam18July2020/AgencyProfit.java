package ProgrammingBasicsOnlineExam18July2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Име на авиокомпанията - текст
        //2. Брой билети за възрастни – цяло число в диапазона [1…400]
        //3. Брой детски билети – цяло число в диапазона [25…120]
        //4. Нетна цена на билет за възрастен – реално число в диапазона [100.0…1600.0]
        //5. Цената на такса обслужване - реално число в диапазона [10.0…50.0]
        String name=scanner.nextLine();
        int numticketadult=Integer.parseInt(scanner.nextLine());
        int numticketkid=Integer.parseInt(scanner.nextLine());
        double priceadult=Double.parseDouble(scanner.nextLine());
        double pricetax=Double.parseDouble(scanner.nextLine());
        double priceKid=priceadult-(priceadult*0.7);
        double oneticketAdult=priceadult+pricetax;
        double SumAdult=oneticketAdult*numticketadult;
        double oneticketKid=priceKid+pricetax;
        double SumKid=oneticketKid*numticketkid;
        double ALlSum=SumAdult+SumKid;
        double discount=0.20*ALlSum;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name,discount);
    }
}
