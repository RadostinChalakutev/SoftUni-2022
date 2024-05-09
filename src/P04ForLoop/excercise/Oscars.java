package P04ForLoop.excercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Име на актьора - текст
        //• Точки от академията - реално число в интервала [2.0... 450.5]
        //• Брой оценяващи n - цяло число в интервала[1… 20]
        String actorname = scanner.nextLine();
        double startpoints = Double.parseDouble(scanner.nextLine());
        int pointerNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i<=pointerNum; i++) {
            String namepointer = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            double givenpoint = (namepointer.length() * points) / 2;
            startpoints += givenpoint;

            if (startpoints >= 1250.5) {
                break;
            }
        }
        if (startpoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorname, startpoints);
        }else {
            double diff=1250.5-startpoints;
            System.out.printf("Sorry, %s you need %.1f more!",actorname,diff);
        }
    }
}