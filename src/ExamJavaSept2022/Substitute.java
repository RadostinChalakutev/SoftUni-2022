package ExamJavaSept2022;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //• K – цяло число в интервала [0..8]
        //• L – цяло число в интервала [0..9]
        //• M– цяло число в интервала [0..8]
        //• N – цяло число в интервала [0..9
        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean hasEnded = false;

        for (int FirstNumFirstDig = K; FirstNumFirstDig <= 8; FirstNumFirstDig++) {
            for (int FirstNumSecDig = 9; FirstNumSecDig >= L; FirstNumSecDig--) {
                for (int SecondNumFirstDig = M; SecondNumFirstDig <= 8; SecondNumFirstDig++) {
                    for (int SecondNumSecondDig = 9; SecondNumSecondDig >= N; SecondNumSecondDig--) {
                        boolean isValid = FirstNumFirstDig % 2 == 0
                                && SecondNumFirstDig % 2 == 0
                                && FirstNumSecDig % 2 != 0
                                && SecondNumSecondDig % 2 != 0;
                        int firstNum = FirstNumFirstDig * 10 + FirstNumSecDig;
                        int secNum = SecondNumFirstDig * 10 + SecondNumSecondDig;

                        if (isValid && firstNum == secNum) {
                            System.out.println("Cannot change the same player.");
                        } else if (isValid && firstNum != secNum) {
                            System.out.printf("%d%d - %d%d%n", FirstNumFirstDig, FirstNumSecDig, SecondNumFirstDig, SecondNumSecondDig);
                            counter++;
                        }
                        if (counter >= 6) {
                            hasEnded = true;
                        }
                        if (hasEnded) {
                            break;
                        }
                    }
                    if (hasEnded) {
                        break;
                    }
                }
                if (hasEnded) {
                    break;
                }

            }
            if (hasEnded) {
                break;
            }
        }
    }
}
