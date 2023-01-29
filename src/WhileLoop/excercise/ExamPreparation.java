package WhileLoop.excercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int badGrade=Integer.parseInt(scanner.nextLine());
        int counterBadGrade=0;
        double GradeSum=0;
        int solvedProblemsCounter=0;
        String lastProblem="";
        boolean isFailed=true;

        while(counterBadGrade<badGrade){
            String nameProblem=scanner.nextLine();


            if (nameProblem.equals("Enough")){
                isFailed=false;
                break;
            }

            int grade=Integer.parseInt(scanner.nextLine());
            if (grade<=4) {
                counterBadGrade++;
            }

            GradeSum=GradeSum+grade;
            solvedProblemsCounter++;
            lastProblem=nameProblem;

        }
        if (isFailed){
            System.out.printf("You need a break, %d poor grades.",counterBadGrade);
        }else {
            double average=GradeSum/solvedProblemsCounter;
            System.out.printf("Average score: %.2f%n",average);
            System.out.printf("Number of problems: %d%n",solvedProblemsCounter);
            System.out.printf("Last problem: %s",lastProblem);
        }

    }
}
