package P02ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String TypeFigure = scanner.nextLine();

        if (TypeFigure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.printf("%.3f",area);

        } else if (TypeFigure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            System.out.printf("%.3f",area);

        } else if (TypeFigure.equals("circle")) {
            double a=Double.parseDouble(scanner.nextLine());
            double area = Math.PI * a * a;
            System.out.printf("%.3f",area);


        }  else if (TypeFigure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = (a * b) / 2;
            System.out.printf("%.3f",area);

        }
    }
}
