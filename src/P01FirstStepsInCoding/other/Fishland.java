package P01FirstStepsInCoding.other;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Паламуд – 60% по-скъп от скумрията
        //Сафрид – 80% по-скъп от цацата
        //Миди – 7.50 лв. за килограм
        //Входни данни:
        // Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        //Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        //Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
        //Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
        //Пети ред – килограма миди. Цяло число в интервала [0 ... 100]
        double skumriq=Double.parseDouble(scanner.nextLine());
        double caca=Double.parseDouble(scanner.nextLine());
        double palamud=Double.parseDouble(scanner.nextLine());
        double safrid=Double.parseDouble(scanner.nextLine());
        double midi= Double.parseDouble(scanner.nextLine());
        double CenaPalamud=skumriq+skumriq*0.60;
        double SumSafrid=caca+caca*0.80;
        double SumMidi=midi*7.50;
        double AllSum= SumMidi+SumSafrid;
        //Цена на паламуда = 6.90 + 6.90 * 0.60 = 11.04 лв. за килограм
        //Сума паламуд = 1.5 * 11.04 = 16.56
        //Цена на сафрид = 4.20 + 4.20 * 0.80 =  7.56 лв. за килограм
        //Сума сафрид = 2.5 * 7.56 = 18.90
        //Сума миди = 1 * 7.50 = 7.50
        //Сметка = 16.56 + 18.90 + 7.50 = 42.96

        System.out.printf("%.2f",AllSum);



    }
}
