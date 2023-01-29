package FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // 1 USD = 1.79549 BGN
        double USD= Double.parseDouble(scanner.nextLine());
        double BGN= 1.79549* USD;
        System.out.println(BGN);
    }
}
