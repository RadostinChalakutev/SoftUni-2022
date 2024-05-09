package P04ForLoop.excercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int maxNum=Integer.MIN_VALUE;
        int sum=0;

        for (int i=1;n>=i;i++){
            int currentNum=Integer.parseInt(scanner.nextLine());
            if(maxNum<currentNum){
                maxNum=currentNum;

            }
            sum+=currentNum;
        }
        sum=sum-maxNum;
        if (sum==maxNum){
            System.out.printf("Yes%nSum = %d",sum);
        }else {
            int modul=Math.abs(sum-maxNum);
            System.out.printf("No%nDiff = %d",modul);
        }

    }
}
