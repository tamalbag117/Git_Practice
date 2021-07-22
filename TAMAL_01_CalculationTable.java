import java.util.Scanner;
import java.lang.Math;
public class TAMAL_01_CalculationTable {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        int k=6;
        while(k!=0) {
            System.out.println("The number is:");
            float n = cc.nextInt();
            System.out.println("enter user input  of the value of 'X'");
            float x = cc.nextFloat();
            System.out.println("lets calculate the value of Y");
            switch ((int) n) {
                case 1:
                    float y = (float) (1 + Math.pow(x, 2));
                    System.out.println("The value of Y is in this case" + y);
                    break;
                case 2:
                    y = (float) (1 + x / n);
                    System.out.println("The value of Y is in this case" + y);
                    break;
                case 3:
                    y = (float) (1 + 2 * x);
                    System.out.println("The value of Y is in this case" + y);
                    break;
                default:
                    y = 1 + n * x;
                    System.out.println("The value of Y is in this case" + y);
                    break;

            }
            System.out.println("do you want to continue?");
            k = cc.nextInt();
            if (k != 0) {
                System.out.println("continue");
            } else {
                System.out.println("no ,thanks");
            }
        }
    }
}
