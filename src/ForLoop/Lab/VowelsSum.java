package ForLoop.Lab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int value = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            switch (symbol) {
                case 'a':
                    value = value + 1;
                    break;
                case 'e':
                    value = value + 2;
                    break;
                case 'i':
                    value = value + 3;
                    break;
                case 'o':
                    value = value + 4;
                    break;
                case 'u':
                    value = value + 5;
                    break;
            }

        }
        System.out.println(value);

    }
}

