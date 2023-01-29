package ConditionalStatements.Excercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int m = minutes + 15;
        if (minutes < 45) {
            System.out.printf("%d:%02d%n", hours, (minutes + 15));
        } else if (hours == 23) {
            System.out.printf("0:%02d%n", (minutes - 45));
        } else {
            System.out.printf("%d:%02d%n", (hours + 1), (minutes - 45));
        }
    }
}