import java.util.Scanner;
public class Tamal_01_PrimeNumber {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int c = 3;
        while (c != 0) {
            System.out.println("The number is:");
            int num = cc.nextInt();
            int k = 0;
            for (int i = 2;i <= num/2;++i) {
                if (num % i ==0) {
                    k=1;
                    break;
                }
            }
            if(num==1)
            {
                System.out.println("1 is neither prime nor composite");
            }
            else if (k == 0) {
                System.out.println("The number " + num + "is a prime number");
            } else {
                System.out.println(num + "is not a prime number");
            }
            System.out.println("do want want's to continue?");
            c = cc.nextInt();
            if (c != 0)
            {
                System.out.println("continue");
            }
            else
            {
                System.out.println("let's end this!");
            }
        }
    }
}
