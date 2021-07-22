import java.util.Scanner;
public class Tamal_01_NaturalNumberprinting {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("enter the range of the number you wants to print");
        int number= cc.nextInt();
        System.out.println("The first natural number is:\n");
        for (int i=1;i<=number;i++)
        {
            System.out.println(i+"\n");
        }
    }
}
