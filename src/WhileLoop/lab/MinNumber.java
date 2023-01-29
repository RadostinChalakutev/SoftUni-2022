package WhileLoop.lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        int minValue=Integer.MAX_VALUE;
        while(!input.equals("Stop")){
            int currentNum=Integer.parseInt(input);

            if (currentNum<minValue){
                minValue=currentNum;
            }
            input=scanner.nextLine();

        }
        System.out.println(minValue);
    }
}
