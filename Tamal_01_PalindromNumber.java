import java.util.Scanner;
public class Tamal_01_PalindromNumber {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int k = 6;
        while (k != 0) {
            System.out.println("enter the number");
            int num = cc.nextInt();
            int temp = num;
            int sum = 0;
            while (num > 0) {
                int modulo = num % 10;
                sum = sum * 10 + modulo;
                num /= 10;
            }
            if (sum == temp) {
                System.out.println(temp + "is a palindrome number");
            } else {
                System.out.println("not a palindrome number");
            }
            System.out.println("do you wants to check another number?");
            k= cc.nextInt();
            if(k!=0)
            {
                System.out.println("yes I want to check another number");
            }
            else
            {
                System.out.println("No thanks");
            }
        }
    }
}
