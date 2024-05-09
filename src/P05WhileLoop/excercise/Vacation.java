package P05WhileLoop.excercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        //• Налични пари - реално число в интервала [0.00...25000.00]
        double needsMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int dayscounter=0;
        int spendingcounter=0;

        while (needsMoney > ownedMoney&&spendingcounter<5) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            dayscounter++;

            if (action.equals("save")) {
                ownedMoney+=sum;
                spendingcounter=0;

            }else if (action.equals("spend")){
                ownedMoney-=sum;
                spendingcounter+=1;
            }
            if (ownedMoney<0){
               ownedMoney=0;
            }


        }
        if (spendingcounter==5){
            System.out.printf("You can't save the money.%n%d",dayscounter);
        }
        if (ownedMoney>=needsMoney){
            System.out.printf("You saved the money for %d days.",dayscounter);
        }
    }
}
