package pb28MarchExam;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
        // Пол - символ ('m' за мъж и 'f' за жена)
        // Възраст - цяло число в интервала [5…105]
        // Спорт - текст (една от възможностите в таблицата)
        double Budget = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;
        double discount=0;


        if (gender.equals("m")) {
            switch (sport) {
                case "Gym":
                    price = 42;
                    break;
                case "Boxing":
                    price = 41;
                    break;
                case "Yoga":
                    price = 45;
                    break;
                case "Zumba":
                    price = 34;
                    break;
                case "Dances":
                    price = 51;
                    break;
                case "Pilates":
                    price = 39;
                    break;
            }

        } else if (gender.equals("f")) {
            switch (sport) {
                case "Gym":
                    price = 35;
                    break;
                case "Boxing":
                    price = 37;
                    break;
                case "Yoga":
                    price = 42;
                    break;
                case "Zumba":
                    price = 31;
                    break;
                case "Dances":
                    price = 53;
                    break;
                case "Pilates":
                    price = 37;
                    break;
            }

        }
        if (age<=19) {
            discount=price*0.20;

        }else {
            discount=0;
        }
        double allSum=price-discount;
        if (Budget>=allSum){
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.",allSum-Budget);
        }


    }
}

