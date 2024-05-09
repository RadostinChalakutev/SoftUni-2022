package P01FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        //Дължина в см – цяло число в интервала [10 … 500]
        //2. Широчина в см – цяло число в интервала [10 … 300]
        //3. Височина в см – цяло число в интервала [10… 200]
        //4. Процент – реално число в интервала [0.000 … 100.000]
        Scanner scanner=new Scanner(System.in);
        double lenght=Double.parseDouble(scanner.nextLine());
        double width=Double.parseDouble(scanner.nextLine());
        double height=Double.parseDouble(scanner.nextLine());
        double percent=Double.parseDouble(scanner.nextLine());
        double Volume=lenght*width*height;
        double VolumeInLiter=Volume/1000;
        double freeArea=percent/100;
        double Volume1=VolumeInLiter*(1-freeArea);
        //литрите вода, които ще събира аквариума.
        System.out.println(Volume1);
    }
}
