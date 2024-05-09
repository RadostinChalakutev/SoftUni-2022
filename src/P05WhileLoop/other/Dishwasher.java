package P05WhileLoop.other;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double numbottles=Double.parseDouble(scanner.nextLine());
        String input=scanner.nextLine();
        double volume=numbottles*750;// количество препарат
        int counter=0;//боряч на цикъл
        double pots=0;
        double volumedishes=0;
        double numdishes=0;

        while(!input.equals("End")){
           numdishes=Double.parseDouble(input);
            if (volume<=0){
                break;
            }
            volumedishes=numdishes*5;//чиниите по 5 мл.
            volume=volume-volumedishes;//останало количество препарат
            counter++;

            if (counter%3==0){
                 pots=Double.parseDouble(scanner.nextLine());
                double volumepots=pots*15;
                volume=volume-volumepots;

            }
            input=scanner.nextLine();
        }
        if(volume<=0){
            System.out.printf("Not enough detergent,%.0f ml. more necessary!",volume);

        }else {
            System.out.println("Detergent was enough!");
            System.out.printf("%.0f dishes and %.0f pots were washed.",volumedishes,pots);
            System.out.printf("Leftover detergent %.0f ml.",volume);

        }
    }

}
