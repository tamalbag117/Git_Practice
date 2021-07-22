import java.util.Scanner;
public class Tamal_01_FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int k = 1;
        while (k != 0) {
            int factorial = 1;
            System.out.println("The number is:");
            int num = cc.nextInt();
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of the number is :\n" + factorial );
            System.out.println("do you wants to continue!");
            k= cc.nextInt();
            if(k!=0)
                System.out.println("yes");
            else
                System.out.println("No");
        }
    }
}
