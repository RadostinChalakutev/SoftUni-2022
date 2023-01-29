package ProgrammingBasicsOnlineExam18July2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price20kg = Double.parseDouble(scanner.nextLine());
        double BagKg = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int NumBag = Integer.parseInt(scanner.nextLine());
        double taxBag = 0;
        double priceBag = 0;
        double totalprice = 0;


        //повече от 30 дни - цената на багажа се оскъпява с 10%
        // между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
        // по-малко от 7 дни - цената на багажа се оскъпява с 40%
        if (BagKg <= 10) {
            taxBag = 0.2 * price20kg;
            if (daysToTrip >= 30) {
                priceBag = price20kg * 0.9;
            } else if (daysToTrip >= 7) {
                totalprice = price20kg * 0.85;
            } else {
                totalprice = price20kg * 0.60;
            }

        } else if (BagKg <= 20) {
            taxBag = 0.50 * price20kg;
            if (daysToTrip >= 30) {
                totalprice = price20kg * 0.9;
            } else if (daysToTrip >= 7) {
                totalprice = (price20kg / NumBag) * 0.15;
            } else {
                totalprice = totalprice * 0.60;
            }
        }

        double sum=(price20kg/priceBag)+totalprice;
        System.out.printf("The total price of bags is: %.2f", sum);


    }
}
