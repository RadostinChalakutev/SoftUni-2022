package P01FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Брой страници в текущата книга – цяло число в интервала [1…1000]
        //2. Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        //3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
        int BookPages=Integer.parseInt(scanner.nextLine());
        int pagesPerHour=Integer.parseInt(scanner.nextLine());
        int days= Integer.parseInt(scanner.nextLine());
        int pagesPerDay=BookPages/pagesPerHour;
        int HoursPerDay=pagesPerDay/days;
        System.out.println(HoursPerDay);

    }
}
