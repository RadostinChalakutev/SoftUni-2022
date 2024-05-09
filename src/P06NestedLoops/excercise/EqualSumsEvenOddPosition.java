package P06NestedLoops.excercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());


        for (int i = n; i <= m; i++) {
            int oddSum = 0;
            int evenSum = 0;
            int current = i;

            for (int j = 6; j >= 1; j--) {
                int digit=current%10; //за да вземем последната цифра

                if (j % 2 == 0) {
                    evenSum+=digit;
                }else {
                    oddSum+=digit;
                }
                current=current/10; //за да махнем последната цифра, която сме взели
            }
            if (evenSum==oddSum){
                System.out.print(i+ " ");
            }

        }
    }
}
