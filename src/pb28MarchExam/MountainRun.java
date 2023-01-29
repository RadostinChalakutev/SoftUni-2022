package pb28MarchExam;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3. Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]
        double recordsInSecond=Double.parseDouble(scanner.nextLine());
        double pathInMeters=Double.parseDouble(scanner.nextLine());
        double timeInSeconds=Double.parseDouble(scanner.nextLine());

        double GeorgiTime=pathInMeters*timeInSeconds;
        double slow=Math.floor(pathInMeters/50);
        double slowSec=slow*30;
        double allTime=GeorgiTime+slowSec;
        if (allTime>=recordsInSecond){
            System.out.printf("No! He was %.2f seconds slower.",allTime-recordsInSecond);
        }else if (allTime<recordsInSecond){
            System.out.printf("Yes! The new record is %.2f seconds.",allTime);
            //10164
            //1400
            //25
        }
    }
}
