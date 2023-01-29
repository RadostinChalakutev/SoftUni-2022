package ExamJavaSept2022;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Първи ред – брой хора – цяло число в интервала [1 … 20]
        //2. Втори ред – сезон – текст с възможности - "spring", "summer", "autumn" или "winter"
        int numOfPeople=Integer.parseInt(scanner.nextLine());
        String season=scanner.nextLine();
        double price=0;
        double dicountOrNot=0;

        switch (season){
            case "spring":
                if (numOfPeople<=5){
                    price=50.00;
                }else {
                    price=48.00;
                }
                break;
            case "summer":
                if (numOfPeople<=5){
                    price=48.50;
                }else {
                    price=45.00;
                }
                break;
            case "autumn":
                if (numOfPeople<=5){
                    price=60.00;
                }else {
                    price=49.50;
                }
                break;
            case "winter":
                if (numOfPeople<=5){
                    price=86.00;
                }else {
                    price=85.00;
                }
                break;

        }
        double totalSum=price*numOfPeople;
        if (season.equals("summer")){
            totalSum=totalSum-(totalSum*0.15);
        } else if (season.equals("winter")) {
            totalSum=totalSum+(totalSum*0.08);

        }
        System.out.printf("%.2f leva.",totalSum);
    }
}
