package P05WhileLoop.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String name=scanner.nextLine();
        int year=1;
        double sumGrade=0;
        int poorGradecount=0;
        while(year<=12){

            if (poorGradecount>1){
            break;
            }
            double grade=Double.parseDouble(scanner.nextLine());

            if (grade<4){
                poorGradecount++;
                continue;
            }
            sumGrade=sumGrade+grade;
            year++;

        }
        if (poorGradecount>1){
            System.out.printf("%s has been excluded at %d grade",name,year);
        }else{
            double average=sumGrade/12;
            System.out.printf("%s graduated. Average grade: %.2f",name,average);
        }


    }
}
