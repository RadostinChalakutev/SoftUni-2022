package ConditionalStatements.other;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        // Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        // Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        // Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала
        //[1.0…24.00]
        double V=Double.parseDouble(scanner.nextLine());
        double P1=Double.parseDouble(scanner.nextLine());
        double P2=Double.parseDouble(scanner.nextLine());
        double H=Double.parseDouble(scanner.nextLine());
        double Pipe1=P1*H;
        double Pipe2=P2*H;
        double PipesSum=Pipe1+Pipe2;
        double percentPipe1=(Pipe1/PipesSum)*100;
        double percentPipe2=(Pipe2/PipesSum)*100;
        double totalPercent=(PipesSum/V)*100;

        if (PipesSum<=V){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%% Pipe 2: %.2f%%.",totalPercent,percentPipe1,percentPipe2);
        }else {
            double overflows=PipesSum-V;
            System.out.printf("For %.1f hours the pool overflows with %.2f liters.",H,overflows);
        }
    }
}
