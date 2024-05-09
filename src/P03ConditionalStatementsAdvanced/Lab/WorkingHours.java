package P03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        boolean IsWorkingDays = dayOfWeek.equals("Monday")
                || dayOfWeek.equals("Tuesday")
                || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday")
                || dayOfWeek.equals("Friday")
                || dayOfWeek.equals("Saturday");
        boolean IsWorkingHours = hours >= 10 && hours <= 18;
        if (IsWorkingDays && IsWorkingHours) {
            System.out.println("open");

        } else {
            System.out.println("closed");
        }
    }
}
