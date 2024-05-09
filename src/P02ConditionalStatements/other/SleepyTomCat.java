package P02ConditionalStatements.other;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Нормата е 30 000 часа в годината
        double holidays=Integer.parseInt(scanner.nextLine());
        double workingDay=365-holidays;
        double realTimeForPlay=(workingDay*63)+(holidays*127);
        double norm=Math.abs(30000-realTimeForPlay);
        double hours=Math.floor(norm/60);
        double minutes=norm%60;

        if (30000<realTimeForPlay){
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play",hours,minutes);
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play",hours,minutes);
        }
    }
}
