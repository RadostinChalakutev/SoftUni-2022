package P01FirstStepsInCoding.other;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Входящи данни:b1,b2,h
        //Отпечатваме лице на трапец с закръгляне до втория знак
        //%2f,лице
        double b1=Double.parseDouble(scanner.nextLine());
        double b2= Double.parseDouble(scanner.nextLine());
        double h=Double.parseDouble(scanner.nextLine());
        double square=((b1+b2)*h)/2;
        System.out.printf( "%.2f",square);
    }
}
