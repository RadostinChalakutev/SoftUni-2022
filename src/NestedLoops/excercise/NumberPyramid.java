package NestedLoops.excercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int current=1;

        for (int row = 1; row <=n ; row++) {
            for (int cols = 1; cols <= row ; cols++) {

                if(current>n){
                    break;
                }

                System.out.print(current+ " ");
                current++;
            }
            if (current>n){
                break;
            }
            System.out.println();

        }
    }
}
