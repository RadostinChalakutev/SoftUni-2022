package ConditionalStatements.Excercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3. Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
        double RecordsInSec=Double.parseDouble(scanner.nextLine());
        double DistanceInMeters=Double.parseDouble(scanner.nextLine());
        double TimeInSec=Double.parseDouble(scanner.nextLine());
        double IvanTimeInSec=DistanceInMeters*TimeInSec;
       double SlowDown=Math.floor(DistanceInMeters/15)*12.5;
       double finalresult=IvanTimeInSec+SlowDown;

       if (finalresult<RecordsInSec){
           System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",finalresult);
       }else {
           System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(RecordsInSec-finalresult));
       }
    }
}
