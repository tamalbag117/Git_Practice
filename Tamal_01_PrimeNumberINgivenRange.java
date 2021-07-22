import java.util.Scanner;
public class Tamal_01_PrimeNumberINgivenRange{
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int c = 5;
        while (c != 0) {
            System.out.println("define the range of the numbers:");
            System.out.println("range starts with the number");
            int n1 = cc.nextInt();
            System.out.println("range ends with the number:");
            int n2 = cc.nextInt();
            for (int j = n1; j < n2; ++j) {
                int k = 0;
                for (int i = 2; i <= j / 2; ++i) {
                    if (j % i == 0) {
                        k = 1;
                        break;
                    }
                }
                if (j == 1) {
                    System.out.println("1 is neither prime nor composite");
                } else if (k == 0) {
                    System.out.println("The number " + j + "is a prime number in the given range of"+n1+"to"+n2);
                }
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
