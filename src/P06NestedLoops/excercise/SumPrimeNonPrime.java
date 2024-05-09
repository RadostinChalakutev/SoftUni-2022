package P06NestedLoops.excercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int SumSimple = 0;
        int SumPerfect = 0;


        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                SumSimple += number;
            } else {
                SumPerfect += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", SumSimple);
        System.out.printf("Sum of all non prime numbers is: %d", SumPerfect);
    }
}
