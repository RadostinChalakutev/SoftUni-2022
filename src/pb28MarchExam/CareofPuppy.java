package pb28MarchExam;

import java.util.Scanner;

public class CareofPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
        //• На всеки следващ ред до получаване на команда Adopted ще получавате колко грама изяжда
        //кученцето на всяко хранене - цяло число в интервала [10 …1000]
        int foodinKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sum = 0;
        int boughtGrams = 0;
        boolean isTrue = false;
        while (!input.equals("Adopted")) {
            int currentNumber = Integer.parseInt(input);
            sum = sum + currentNumber;
            boughtGrams = foodinKg * 1000;
            if (boughtGrams > sum) {
                isTrue = true;
            }
            input = scanner.nextLine();

        }
        if (boughtGrams >= sum) {
            System.out.printf("Food is enough! Leftovers: %.0f grams.",boughtGrams-sum);
        } else {
            System.out.printf("Food is not enough. You need %.0f grams more.",Math.abs(sum-boughtGrams));;
        }
    }
}

