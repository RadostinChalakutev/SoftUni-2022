package pb28MarchExam;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
        //2. Размерът на сета - текст с възможности: "small" или "big"
        //3. Брой на поръчаните сетове - цяло число в интервала [1 … 10000]
        String fruits=scanner.nextLine();
        String size=scanner.nextLine();
        int numSets=Integer.parseInt(scanner.nextLine());
        double price=0;
        double sum=0;

        switch (fruits){
            case "Watermelon":
                if (size.equals("small")){
                    price=(56*2)*numSets;
                } else if (size.equals("big")) {
                    price=(28.70*5)*numSets;
                }
                break;
            case "Mango":
                if (size.equals("small")){
                    price=(36.66*numSets)*2;
                } else if (size.equals("big")) {
                    price=(19.60*numSets)*5;
                }
                break;
            case "Pineapple":
                if (size.equals("small")){
                    price=(42.10*numSets)*2;
                } else if (size.equals("big")) {
                    price=(24.80*numSets)*5;
                }
                break;
            case "Raspberry":
                if (size.equals("small")){
                    price=(20*numSets)*2;
                } else if (size.equals("big")) {
                    price=(15.20*numSets)*5;
                }
                break;
        }
        if (price>=400&&price<=1000){
            sum=0.15*price;
        } else if (price>1000) {
            sum=0.5*price;
        }
        double endSum=price-sum;
        System.out.printf("%.2f lv.",endSum);;
    }
}
