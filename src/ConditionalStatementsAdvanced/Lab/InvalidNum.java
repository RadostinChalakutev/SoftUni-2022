package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class InvalidNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        boolean IsInvalid=num>=100&&num<=200||num==0;
        if(IsInvalid){
            System.out.println();
        }else {
            System.out.println("invalid");
        }
    }
}
