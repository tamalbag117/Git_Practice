import java.util.Scanner;
public class Tamal_01_GCDofTWOnumbers {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int c = 5;
        while (c != 0) {
            System.out.print("the first number is:\n");
            int num1 = cc.nextInt();
            System.out.print("the second number is:\n");
            int num2 = cc.nextInt();
            int gcd = 0;
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("The G.C.D of the two number" + num1 + "&" + num2 + "is:\n" + gcd);
            System.out.println("\n\n do you want's to continue");
            c = cc.nextInt();
            if (c != 0) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }
}
