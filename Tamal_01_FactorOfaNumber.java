import java.util.Scanner;
public class Tamal_01_FactorOfaNumber {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int k = 87;
        while (k != 0) {
            System.out.println("the number is:");
            int num = cc.nextInt();
            System.out.println("The factor of the number\t" + num + "\tis:");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i + "\t");
                }
            }
            System.out.println("do you want to calculate factor's of another number:");
            k= cc.nextInt();
            if(k!=0)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
