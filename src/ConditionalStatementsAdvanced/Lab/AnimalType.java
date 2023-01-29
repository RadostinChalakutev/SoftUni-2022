package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        //crocodile, tortoise, snake -> reptile
        //• others -> unknown
        switch (name){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
