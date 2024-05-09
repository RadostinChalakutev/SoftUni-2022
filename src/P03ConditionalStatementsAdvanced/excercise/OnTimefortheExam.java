package P03ConditionalStatementsAdvanced.excercise;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourstest = Integer.parseInt(scanner.nextLine());
        int minutetest = Integer.parseInt(scanner.nextLine());
        int hourA = Integer.parseInt(scanner.nextLine());
        int minutesA = Integer.parseInt(scanner.nextLine());
        int totalMin = hourstest * 60 + minutetest;
        int totalMinA = hourA * 60 + minutesA;
        int diff = totalMin - totalMinA;

        if (diff == 0) {
            System.out.println("On time ");
        } else if (diff > 0 && diff <= 30) {
            System.out.printf("On time%n%d minutes before the start", Math.abs(diff));

        } else if (diff < 0) {
            diff = Math.abs(diff);
            System.out.println("Late");
            if (diff >= 60) {
                hourstest = diff / 60;
                minutetest = diff % 60;
                System.out.printf("%d:%02d hours after the start", hourstest, minutetest);

            } else {
                System.out.printf("%d minutes after the start", diff);
            }

        } else {
            System.out.println("Early");
            if (diff >= 60) {
                hourstest = diff / 60;
                minutetest = diff % 60;
                System.out.printf("%d:%02d hours before the start", hourstest, minutetest);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }

    }
}

