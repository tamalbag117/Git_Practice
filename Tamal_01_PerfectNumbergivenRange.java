import java.util.Scanner;
public class Tamal_01_PerfectNumbergivenRange {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("perfect number in given range");
        int k = 6;
        while (k != 0) {
            System.out.println("Lower limit of the range");
            int n1 = cc.nextInt();
            System.out.println("Upper limit of the range");
            int n2 = cc.nextInt();
            System.out.println("The prime number in between" + n1 + "and" + n2 + "is\n");
            for (int j = n1; j < n2; j++) {
                int sum = 0;
                int temp = j;
                for (int i = 1; i < j; i++) {
                    if (j % i == 0) {
                        sum += i;
                    }
                    }
                if (temp == sum) {
                    System.out.println(j+"\n");
                }
            }
            System.out.println("do you want to check this in another range?\n");
            k=cc.nextInt();
            if(k!=0)
            {
                System.out.println("yes\n Let's check it");
            }
            else
            {
                System.out.println("no\n we should terminate the program");
            }
        }
    }
}
