/*An Armstrong Number in a given number that is the sum of its own digits raise 
to the power of the number of digits */
import java.util.Scanner;
import java.lang.Math;
public class Tamal_01_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Let's check the number is Armstrong number or not!");
        byte k = 4;
        while (k != 0) {
            System.out.println("the number is:");
            int num = cc.nextInt();
            int temp1 = num;
            int temp2 = num;
            int size = 0;
            int sum = 0;
            for(;temp1!=0;temp1/=10){
                size++;
            }
            for (int i = 1; i <= num; i++) {
                int modulo = num % 10;
                sum += Math.pow(modulo, size);
                num /= 10;
            }
            if (temp2==sum) {
                System.out.println("the number\t" + temp2 + "\t is Armstrong number");
            } else {
                System.out.println("the number is not a armstrong number");
            }
            System.out.println("do you wants to continue");
            k= cc.nextByte();
            if(k!=0)
            {
                System.out.println("yes\n continue");
            }
            else
            {
                System.out.println("no thanks");
            }

        }
    }
}
