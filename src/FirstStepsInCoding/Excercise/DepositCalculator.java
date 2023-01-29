package FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double depositSum=Double.parseDouble(scanner.nextLine());
        int term=Integer.parseInt(scanner.nextLine());
        double annualInterestRate=Double.parseDouble(scanner.next());
        double percent=annualInterestRate/100;
        double sum=depositSum+term*((depositSum*percent)/12);
        System.out.println(sum);
    }

}
