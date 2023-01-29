package ForLoop.excercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        //На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
        //• За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
        Scanner scanner = new Scanner(System.in);

        int numgrouptrecking = Integer.parseInt(scanner.nextLine());
        int percent1 = 0;
        int percent2 = 0;
        int percent3 = 0;
        int percent4 = 0;
        int percent5 = 0;


        for (int i = 1; i<=numgrouptrecking; i++) {
            int numbersofpeople = Integer.parseInt(scanner.nextLine());

            if (numbersofpeople <= 5) {
                percent1 += numbersofpeople;
            } else if (numbersofpeople <= 12) {
                percent2 += numbersofpeople;
            } else if (numbersofpeople <= 25) {
                percent3 += numbersofpeople;
            } else if (numbersofpeople <= 40) {
                percent4 += numbersofpeople;
            } else if (numbersofpeople > 40) {
                percent5 += numbersofpeople;
            }
        }
        int totalpeople = percent1 + percent2 + percent3 + percent4 + percent5;

        System.out.printf("%.2f%%%n",(percent1*1.00/totalpeople)*100);
        System.out.printf("%.2f%%%n",(percent2*1.00/totalpeople)*100);
        System.out.printf("%.2f%%%n",(percent3*1.00/totalpeople)*100);
        System.out.printf("%.2f%%%n",(percent4*1.00/totalpeople)*100);
        System.out.printf("%.2f%%%n",(percent5*1.00/totalpeople)*100);
    }
}
