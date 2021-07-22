import java.util.Scanner;
public class TAMAL_01_PerfectNumber {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int k = 2;
        while (k != 0) {
            System.out.println("the number is:");
            int number = cc.nextInt();
            int sum = 0;
            int temp = number;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (temp == sum) {
                System.out.println("The number" + number + " is a perfect number");
            } else {
                System.out.println("The number is not a perfect number");
            }
            System.out.println("are you sure about check another number?");
            k=cc.nextInt();
            if(k!=0)
            {
                System.out.println("yes\n let's continue");
            }
            else
            {
                System.out.println("let's terminate the program");
            }
        }
    }
}
