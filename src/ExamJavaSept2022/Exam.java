package ExamJavaSept2022;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        // За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
        double people=Double.parseDouble(scanner.nextLine());
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        double sum=0;
        for (int i = 1; i <=people ; i++) {
            double mark=Double.parseDouble(scanner.nextLine());
            sum=sum+mark;

            if (mark>=5){
                count1++;

            } else if (mark>=4&&mark<=4.99) {
                count2++;

            } else if (mark>=3&&mark<=3.99) {
                count3++;

            } else if (mark<3) {
                count4++;

            }
        }
        double average=sum/people;
        double group1=(count1 / people)*100;
        double group2=(count2 / people)*100;
        double group3=(count3/people)*100;
        double group4=(count4/people)*100;
        System.out.printf("Top students: %.2f%%%n",group1);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",group2);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",group3);
        System.out.printf("Fail: %.2f%%%n",group4);
        System.out.printf("Average: %.2f",average);
    }
}
