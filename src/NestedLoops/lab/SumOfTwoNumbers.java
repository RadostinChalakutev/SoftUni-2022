package NestedLoops.lab;

import java.beans.IntrospectionException;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Първи ред – начало на интервала – цяло число в интервала [1...999]
        //
        //· Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        //
        //· Трети ред – магическото число – цяло число в интервала [1...10000]
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isValid=false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                int sum = i + j;
                count++;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,magicNumber);
                    isValid=true;
                    break;
                }

            }
            if (isValid){
                break;
            }
        }
        if (!isValid){
            System.out.printf("%d combinations - neither equals %d",count,magicNumber);
        }
    }

}

