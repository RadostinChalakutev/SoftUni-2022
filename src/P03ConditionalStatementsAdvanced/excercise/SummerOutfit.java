package P03ConditionalStatementsAdvanced.excercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String timeofDay = scanner.nextLine();
        String Outfit = "";
        String Shoes = "";
        switch (timeofDay) {
            case "Morning":
                if (degrees>=10&&degrees<=18) {
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";
                } else if (degrees>18 && degrees <= 24) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                } else if (degrees >= 25) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }
                break;

            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                } else if (degrees >= 25) {
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                }
                break;

            case "Evening":
                Outfit="Shirt";
                Shoes="Moccasins";
                    break;
                }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, Outfit, Shoes);
        }

    }
