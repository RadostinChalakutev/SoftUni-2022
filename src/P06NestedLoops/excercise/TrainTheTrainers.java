package P06NestedLoops.excercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
        int n=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        double AllgradesSum=0;
        int counterPresentations=0;

        while(!input.equals("Finish")){
            String presentation=input;
            counterPresentations++;
            double gradeSum=0.0;
            double averagegrade=0.0;

            for (int i = 1; i <=n ; i++) {
                double grade=Double.parseDouble(scanner.nextLine());
                gradeSum+=grade;

            }
            averagegrade=gradeSum/n;
            AllgradesSum+=averagegrade;

            System.out.printf("%s - %.2f.%n",presentation,averagegrade);

            input=scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",AllgradesSum/counterPresentations);
    }
}
