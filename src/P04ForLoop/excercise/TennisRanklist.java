package P04ForLoop.excercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Брой турнири, в които е участвал – цяло число в интервала [1…20]
        //• Начален брой точки в ранглистата - цяло число в интервала [1...4000]
        //За всеки турнир се прочита отделен ред:
        //• Достигнат етап от турнира – текст – "W", "F" или "SF"
        int numTournaments=Integer.parseInt(scanner.nextLine());
        int StartNumPoints=Integer.parseInt(scanner.nextLine());
        int points=0;
        int wincount=0;

        for (int i=0;i<numTournaments;i++){
            String tournamentPrize=scanner.nextLine();

            if(tournamentPrize.equals("W")){
                points+=2000;
                wincount++;
            }else if (tournamentPrize.equals("F")){
                points+=1200;
            }else if (tournamentPrize.equals("SF")){
                points+=720;
            }
        }
        System.out.printf("Final points: %s",StartNumPoints+points);
        System.out.println();
        System.out.printf("Average points: %s",points/numTournaments);
        System.out.println();
        System.out.printf("%.2f%%",1.0*wincount/numTournaments*100);


    }
}
