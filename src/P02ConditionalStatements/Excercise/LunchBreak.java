
package P02ConditionalStatements.Excercise;


import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //       Име на сериал – текст
        //       2. Продължителност на епизод – цяло число в диапазона [10… 90]
        //        3. Продължителност на почивката – цяло число в диапазона [10… 120]
        String Serial = scanner.nextLine();
        int watchtime = Integer.parseInt(scanner.nextLine());
        int Break = Integer.parseInt(scanner.nextLine());
        double timeforLunch = Break / 8.0;
        double sleep = Break / 4.0;
        double TimeLeft = Break * 1.0 - timeforLunch - sleep;
        if (TimeLeft >= watchtime) {
            System.out.printf("You have enough time to watch %s " +
                    "and left with %.0f minutes free time.", Serial, Math.ceil(TimeLeft - watchtime));
        } else {
            System.out.printf("You don't have enough time to watch " +
                    "%s, you need %.0f more minutes.", Serial, Math.ceil(watchtime - TimeLeft));
        }
        //"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."


    }
}