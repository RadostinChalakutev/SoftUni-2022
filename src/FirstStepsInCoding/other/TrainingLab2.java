package FirstStepsInCoding.other;

import java.util.Scanner;

public class TrainingLab2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        double  w = Double.parseDouble(scanner.nextLine());
        double h= Double.parseDouble(scanner.nextLine());

       double column=w-1;
       double row= h/1.2;
       double total=column*row;
       System.out.println(total-3);


    }
}
