package pb28MarchExam;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double loan=Double.parseDouble(scanner.nextLine());
        double cake=0.2*loan;
        double drinks=cake-(0.45*cake);
        double animator=loan/3;
        double needMoney=loan+cake+drinks+animator;
        System.out.println(needMoney);
    }
}
