package WhileLoop.excercise;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int piece = length * width;

        while (!command.equals("STOP")) {
            int currentpieces = Integer.parseInt(command);
            piece = piece - currentpieces;

            if(piece<=0){
                break;
            }


            command=scanner.nextLine();
        }
        if (piece<=0) {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(piece));

        } else {

            System.out.printf("%d pieces are left.", piece);
        }
    }
}
