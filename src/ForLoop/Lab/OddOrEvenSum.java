package ForLoop.Lab;

import java.util.Scanner;

public class OddOrEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int evenSum=0;
        int oddSum=0;
    for  (int i=1;i<=n;i++) {
        int currentNum = Integer.parseInt(scanner.nextLine());
        if (i % 2 == 0) {
            evenSum = evenSum + currentNum;
        } else {
            oddSum = oddSum + currentNum;
        }
    }
        if (oddSum==evenSum){
            System.out.printf("Yes%nSum = %d",evenSum);
        }else {
            int diff=Math.abs(evenSum-oddSum);
            System.out.printf("No %nDiff = %d",diff);

        }
    }
}
