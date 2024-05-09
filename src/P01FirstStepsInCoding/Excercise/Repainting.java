package P01FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nylon=Integer.parseInt(scanner.nextLine());
        int paint=Integer.parseInt(scanner.nextLine());
        int thinner=Integer.parseInt(scanner.nextLine());
        int hours=Integer.parseInt(scanner.nextLine());
        double sumNylon=(nylon+2)*1.50;
        double sumPaint=(paint+(paint*0.1))*14.50;
        double SumThinner=thinner*5.00;
        double pack=0.40;
        double endSum=sumNylon+sumPaint+SumThinner+pack;
        double workPerHour=0.30*endSum;
        double salary=hours*workPerHour;

        //обща цена= количество найлон,количество боя,количество разредител,торбички
        //сума найлон=(количество найлон+2)*цена найлон
        //сума боя=(количество боя+10%)*цена боя
        //сума разредител=количество разредител*цена разредител
        //торбички=0.40
        //работници=часове работа*цена за час
        //цена за час=30% * цялата сума
        double endSum2=endSum+salary;
        System.out.println(endSum2);

    }
}
