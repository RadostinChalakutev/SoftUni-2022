package pb28MarchExam;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //На първия ред - минути разходка на ден - цяло число в интервала [1...50]
        // На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
        // На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]
        int minutes = Integer.parseInt(scanner.nextLine());
        int numberwalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int sumMinutes = minutes * numberwalks;
        int sumCalories = 5 * sumMinutes;

        double percent = 0.5 * calories;

        if (sumCalories >= percent) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", sumCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", sumCalories);
        }


    }
}
