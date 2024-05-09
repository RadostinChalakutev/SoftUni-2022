package P03ConditionalStatementsAdvanced.excercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //тип прожекция (стринг), брой редове и брой колони в залата
        String typeProjection=scanner.nextLine();
        int row=Integer.parseInt(scanner.nextLine());
        int column=Integer.parseInt(scanner.nextLine());
        int seats=row*column;
        double income=0;
        //Premiere – премиерна прожекция, на цена 12.00 лева.
        //• Normal – стандартна прожекция, на цена 7.50 лева.
        //• Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        if(typeProjection.equals("Premiere")){
            income=seats*12;

        }else if(typeProjection.equals("Normal")){
            income=seats*7.50;
        } else if (typeProjection.equals("Discount")) {
            income=seats*5;
        }
        System.out.printf("%.2f leva",income);

    }
}
