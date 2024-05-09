package P03ConditionalStatementsAdvanced.excercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String typeflowers=scanner.nextLine();
        int numflowers=Integer.parseInt(scanner.nextLine());
        int Budget=Integer.parseInt(scanner.nextLine());
        double totalprice=0;
//"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //• Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
        //• Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //• Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //• Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        switch (typeflowers){
            case "Roses":
                totalprice=numflowers*5;
                if (numflowers>80) {
                    totalprice = totalprice - (totalprice * 0.10);
                }
                break;

            case "Dahlias":
                totalprice=numflowers*3.80;
                if (numflowers>90) {
                    totalprice = totalprice - (totalprice * 0.15);
                }
                break;
            case "Tulips":
                totalprice=numflowers*2.80;
                if (numflowers>80) {
                    totalprice=totalprice-(totalprice*0.15);
                }
                break;
            case "Narcissus":
                totalprice=numflowers*3;
                if (numflowers<120) {
                    totalprice = totalprice + (totalprice * 0.15);
                }
                break;
            case "Gladiolus":
                totalprice=numflowers*2.50;
                if (numflowers<80){
                    totalprice=totalprice+(totalprice*0.20);
                }

                break;


        }
        if (totalprice<=Budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                    ,numflowers,typeflowers,(Budget-totalprice));
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",totalprice-Budget);
        }
    }
}
