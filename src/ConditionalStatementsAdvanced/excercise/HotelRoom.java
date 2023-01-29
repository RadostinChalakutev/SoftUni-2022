package ConditionalStatementsAdvanced.excercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //На първия ред е месецът – May, June, July, August, September или October
        //• На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
        String month = scanner.nextLine();
        int nightnum = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = nightnum*50;
                priceApartment = nightnum*65;
                if (nightnum > 14) {
                    priceStudio = priceStudio *0.70;
                    priceApartment = priceApartment *0.90;
                } else if (nightnum > 7) {
                    priceStudio = priceStudio *0.95;


                }
                break;

            case "June":
            case "September":
                priceStudio = 75.20 * nightnum;
                priceApartment = 68.70 * nightnum;
                if (nightnum > 14) {
                    priceStudio = priceStudio*0.80;
                    priceApartment = priceApartment*0.9;
                }
                break;

            case "July":
            case "August":
                priceStudio = 76 * nightnum;
                priceApartment = 77 * nightnum;
                if (nightnum > 14) {
                    priceApartment = priceApartment *0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n",priceApartment);
        System.out.printf("Studio: %.2f lv.",priceStudio);
    }
}
