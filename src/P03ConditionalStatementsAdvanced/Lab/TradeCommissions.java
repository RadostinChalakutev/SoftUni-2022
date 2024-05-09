package P03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());
        double result = 0;
        boolean IsVaidData = true;
        if (town.equals("Sofia")) {
            if (0 <= income && income <= 500) {
                result = income * 0.05;
            } else if (500 < income && income <= 1000) {
                result = income * 0.07;
            } else if (1000 < income && income <= 10000) {
                result = income * 0.08;
            } else if (income > 10000) {
                result = income * 0.12;
            } else {
                IsVaidData = false;
            }

        } else if (town.equals("Varna")) {
            if (0 <= income && income <= 500) {
                result = income * 0.045;
            } else if (500 < income && income <= 1000) {
                result = income * 0.075;
            } else if (1000 < income && income <= 10000) {
                result = income * 0.1;
            } else if (income > 10000) {
                result = income * 0.13;
            } else {
                IsVaidData = false;
            }

        } else if (town.equals("Plovdiv")) {
            if (0 <= income && income <= 500) {
                result = income * 0.055;
            } else if (500 < income && income <= 1000) {
                result = income * 0.08;
            } else if (1000 < income && income <= 10000) {
                result = income * 0.12;
            } else if (income > 10000) {
                result = income * 0.145;
            } else {
                IsVaidData = false;
            }

        } else {
            IsVaidData = false;
        }
        if (!IsVaidData) {
            System.out.println("error");

        } else {
            System.out.printf("%.2f", result);
        }
    }
}
