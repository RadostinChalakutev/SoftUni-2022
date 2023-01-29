package ConditionalStatementsAdvanced.other;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //На първия ред – броят биткойни. Цяло число в интервала [0…20]
        // На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
        // На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]
        int bitcoin=Integer.parseInt(scanner.nextLine());
        double uan=Double.parseDouble(scanner.nextLine());
        double commission=Double.parseDouble(scanner.nextLine());

        double BGN1=bitcoin*1168;
        double USD=uan*0.15;
        double BGN2=USD*1.76;
        double BGN3=BGN1+BGN2;
        double EURO=BGN3/1.95;
        double commissions=commission/100*EURO;
        double result=EURO-commissions;
        System.out.printf("%.2f",result);


    }
}
