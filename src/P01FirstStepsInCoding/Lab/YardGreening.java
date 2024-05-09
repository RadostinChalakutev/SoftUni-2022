package P01FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double totalPriceNoDiscount= area * 7.61;
        double discount = (totalPriceNoDiscount * 0.18);
        double TotalPrice = totalPriceNoDiscount - discount;


        //"The final price is: {крайна цена на услугата} lv."
        //• "The discount is: {отстъпка} lv."
        System.out.printf("The final price is: %f lv.",TotalPrice  );
        System.out.printf("The discount is: %f lv. ",discount);



    }
}
