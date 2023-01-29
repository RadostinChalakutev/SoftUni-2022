package ExamJavaSept2022;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //а първи ред: цената в долари за процесора – реално число в интервала [200.00 … 3000.00]
        //• На втори ред: цената в долари за видео карта – реално число в интервала [100.00 … 1500.00]
        // На трети ред: цената в долари за една RAM памет – реално число в интервала [80.00 ... 500.00]
        //• На четвърти: ред брой RAM памети – цяло число в интервала [1 ... 4]
        //• На пети ред: процент отстъпка – реално число в интервала [0.01 … 0.1]
        double processorInDolars=Double.parseDouble(scanner.nextLine());
        double GraphicCardInDolars=Double.parseDouble(scanner.nextLine());
        double RAMInDolars=Double.parseDouble(scanner.nextLine());
        double numRam=Double.parseDouble(scanner.nextLine());
        double discount=Double.parseDouble(scanner.nextLine());
        double processorInLv=processorInDolars*1.57;
        double GraphicCardInLv=GraphicCardInDolars*1.57;
        double RamInLv=RAMInDolars*1.57;
        double sumRam=RamInLv*numRam;
        double processorAfterdiscount=processorInLv-(processorInLv*discount);
        double GraphicCardAfterDiscount=GraphicCardInLv-(GraphicCardInLv*discount);
        double AllSum=processorAfterdiscount+GraphicCardAfterDiscount+sumRam;
        System.out.printf("Money needed - %.2f leva.",AllSum);
    }
}
