package P02ConditionalStatements.Excercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num=Double.parseDouble(scanner.nextLine());
double bonus=0.0;

        if (num<=100) {
            bonus=5;
        } else if (num<1000) {
             bonus=num*0.2;
        } else if (num>1000) {
            bonus=num*0.1;

            
        }
        if (num%2==0){
           bonus=bonus+1;
        } else if (num%10==5) {
            bonus=bonus+2;


        }
        System.out.println(bonus);
        System.out.println(num+bonus);
    }
}
