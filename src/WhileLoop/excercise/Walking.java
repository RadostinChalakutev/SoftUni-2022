package WhileLoop.excercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int steps=0;
        int goal=10000;
        while (steps<goal){
            String input=scanner.nextLine();

            if (input.equals("Going home")){
                int wayhome=Integer.parseInt(scanner.nextLine());
                steps+=wayhome;
                break;
            }else {
                int current=Integer.parseInt(input);
                steps+=current;
            }
        }
        if (steps<goal){
            System.out.printf("%d more steps to reach goal.",goal-steps);
        }
        if (steps>=goal){
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!",steps-goal);
        }
    }
}
