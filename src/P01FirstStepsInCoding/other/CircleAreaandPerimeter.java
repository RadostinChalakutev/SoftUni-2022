package P01FirstStepsInCoding.other;

import java.util.Scanner;

public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double Area = Math.PI * r * r;
        double Parameter = 2 * Math.PI * r;
        //"<calculated area>"
        //"<calculated parameter>"
        System.out.printf("%.2f", Area);
        System.out.printf("%.2f", Parameter);
    }
}
