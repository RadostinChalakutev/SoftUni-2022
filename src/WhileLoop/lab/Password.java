package WhileLoop.lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String regName=scanner.nextLine();
        String regPass=scanner.nextLine();
        String input=scanner.nextLine();
        while(!input.equals(regPass)){
            input=scanner.nextLine();
        }
        System.out.printf("Welcome %s!",regName);
    }
}
