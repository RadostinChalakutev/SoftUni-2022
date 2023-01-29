package ForLoop.Lab;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftsum = 0;
        for (int i = 1; i <= n; i++) {
            int currentnum = Integer.parseInt(scanner.nextLine());
            leftsum = leftsum + currentnum;
        }
        int rightsum = 0;
        for (int i = 1; i <= n; i++) {

            int currentnum = Integer.parseInt(scanner.nextLine());
            rightsum = rightsum + currentnum;
        }
        if (leftsum==rightsum){
            System.out.printf("Yes, sum = %d",leftsum);
        }else {
            int sum=Math.abs(leftsum-rightsum);
            System.out.printf("No, diff = %d",sum);
        }
    }
}