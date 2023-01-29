package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Името на архитекта
        String name = scanner.nextLine();
        int project=Integer.parseInt(scanner.nextLine());
        int neededTime= project*3;
        //"The architect {името на архитекта} will need {необходими часове} hours to complete
        //{брой на проектите} project/s."
        System.out.printf("The architect " + name+ " will need "+ neededTime+ " hours to complete " + project+ " project/s.");

    }
}
