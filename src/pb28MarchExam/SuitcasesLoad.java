package pb28MarchExam;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        double sumvolume = 0;
        double newVolume = 0;
        boolean isTrue = true;
        int counterbagage=0;


        while (!input.equals("End")) {
            double volume = Double.parseDouble(input);
            counter++;
            if (counter % 3 == 0) {
                volume = volume * 1.10;
            }
            if (n - volume < 0) {
                break;
            }
            counterbagage++;
            n -= volume;

            input = scanner.nextLine();
        }
        if (input.equals("End")) {
            System.out.printf("Congratulations! All suitcases are loaded!%n");
            System.out.printf("Statistic: %d suitcases loaded.", counterbagage);
        } else {
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.", counterbagage);
        }
    }
}
