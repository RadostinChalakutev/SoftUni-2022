package WhileLoop.excercise;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double changeInLv=Double.parseDouble(scanner.nextLine());
        double ChangeInSt=Math.round(changeInLv*100);
        int counter=0;

        while(ChangeInSt>0){
            if(ChangeInSt>=200){
                ChangeInSt-=200;
                counter++;
            } else if (ChangeInSt>=100) {
                ChangeInSt-=100;
                counter++;
            } else if (ChangeInSt>=50) {
                ChangeInSt-=50;
                counter++;
            }else if (ChangeInSt>=20){
                ChangeInSt-=20;
                counter++;
            } else if (ChangeInSt>=10) {
                ChangeInSt-=10;
                counter++;
            } else if (ChangeInSt>=5) {
                ChangeInSt-=5;
                counter++;
            } else if (ChangeInSt>=2) {
                ChangeInSt-=2;
                counter++;
            } else if (ChangeInSt>=1) {
                ChangeInSt-=1;
                counter++;
            }
        }
        System.out.println(counter);
    }

}
