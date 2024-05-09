package P02ConditionalStatements.Excercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int First=Integer.parseInt(scanner.nextLine());
        int Second=Integer.parseInt(scanner.nextLine());
        int Third=Integer.parseInt(scanner.nextLine());
        int total=First+Second+Third;
        int minutes= total/60;
        int seconds=total %60;

        if (seconds<10){
            System.out.printf("%d:0%d",minutes,seconds);
        }else {
            System.out.printf("%d:%d",minutes,seconds);
        }
    }
}
