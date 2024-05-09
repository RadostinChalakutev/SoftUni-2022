package P06NestedLoops.excercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int allTicketCount = 0;
        int studentcount = 0;
        int starndartcount = 0;
        int kidcout = 0;


        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int ticketcount = 0;//bileti za konkreten film

            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String typeticket = command;
                allTicketCount++;
                ticketcount++;

                switch (typeticket) {
                    case "student":
                        studentcount++;
                        break;
                    case "standard":
                        starndartcount++;
                        break;
                    case "kid":
                        kidcout++;
                        break;
                }
                if (freeSeats == ticketcount) {
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, ticketcount * 100.0 / freeSeats);
            input=scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allTicketCount);
        System.out.printf("%.2f%% student tickets.%n", (studentcount * 100.0) / allTicketCount);
        System.out.printf("%.2f%%  standard tickets.%n", (starndartcount * 100.0) / allTicketCount);
        System.out.printf("%.2f%% kids tickets.", (kidcout * 100.0) / allTicketCount);


    }
}

